package com.example.trainingskalenderapp

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {
    private lateinit var outputText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        outputText = findViewById(R.id.textOutput)

        val importButton = findViewById<Button>(R.id.buttonImport)
        val getContent = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                result.data?.data?.also { uri ->
                    handleFile(uri)
                }
            }
        }

        importButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_OPEN_DOCUMENT).apply {
                addCategory(Intent.CATEGORY_OPENABLE)
                type = "*/*"
            }
            getContent.launch(intent)
        }
    }

    private fun handleFile(uri: Uri) {
        val inputStream = contentResolver.openInputStream(uri)
        val reader = BufferedReader(InputStreamReader(inputStream))
        val content = reader.readText()
        reader.close()

        val events = content.split("BEGIN:VEVENT").drop(1).map {
            val summary = Regex("SUMMARY:(.*)").find(it)?.groupValues?.get(1) ?: "Kein Titel"
            val description = Regex("DESCRIPTION:(.*)").find(it)?.groupValues?.get(1) ?: ""
            val date = Regex("DTSTART(?:;[^:]+)?:([0-9T]+)").find(it)?.groupValues?.get(1) ?: "Unbekannt"
            "$date – $summary"
            "$description"

        }

        outputText.text = events.joinToString("\n\n")
    }
}
