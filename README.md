📱 TrainingsKalenderApp
TrainingsKalenderApp ist eine native Android-Anwendung zur offlinefähigen Verwaltung, Anzeige und Nachverfolgung von Trainingsplänen – speziell für Haltungs-, Mobilisations- und Kräftigungsübungen. Die App wurde für Nutzer entwickelt, die strukturierte Trainingspläne (z. B. zur Haltungskorrektur bei Hyperkyphose) durchführen und ihren Fortschritt lokal erfassen möchten.

🔑 Funktionen
✅ Import von .ics-Kalenderdateien mit Trainingsinformationen

✅ Offline-Kalenderansicht mit Tagesdetails

✅ Übungsdatenbank mit 80+ Übungen

Kategorien: Mobilisation, Haltungskräftigung, Dehnung

Inhalte: YouTube-Links, Bildverweise, Kurzanleitungen

✅ Pop-up-Detailansicht pro Übung

✅ Tägliches Fortschritts-Tracking (Sätze, Wiederholungen, Checkboxen)

✅ Lokale Datenspeicherung mit Room DB (kein Internet erforderlich)

✅ Exportfunktion als CSV zur späteren Analyse (z. B. mit KI)

✅ Filterbare Übungsliste (geplant)

✅ Benachrichtigung & Erinnerungen (geplant)

🧱 Technische Umsetzung
Komponente	Technik
Kalenderimport	.ics-Dateiparser (iCal-Format)
Kalenderanzeige	RecyclerView / CalendarView
Übungsdatenbank	JSON + Room
Fortschrittsverfolgung	Room-Datenbank
App-Architektur	MVVM + ViewModel, LiveData
Speicher	100 % lokal, kein Backend

🛠️ Zielgruppe
Physiotherapie-Nutzer:innen

Reha-Klient:innen mit Mobilitäts- oder Haltungseinschränkungen

Trainingsbegeisterte mit strukturierten Plänen

App-Entwickler:innen, die ein Projekt mit ICS-Import & Offline-Tracking suchen

🚀 Status
Die App befindet sich aktuell in aktiver Entwicklung.
Features wie Tageskalender, Room-Integration, ICS-Parser und Trainingsvisualisierung sind im Aufbau.
