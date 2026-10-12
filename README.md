# Practical 7: JSON API Data Fetching and SQLite Database in Android

## 📌 Aim

Develop an Android application that retrieves Person data in JSON format from an Internet API and stores the retrieved data in an SQLite database.

## 🎯 Objectives

* Fetch JSON data using `HttpURLConnection`.
* Parse JSON data using Kotlin.
* Store fetched data in an SQLite database.
* Display records using RecyclerView.
* Perform CRUD operations on SQLite.
* Pass Person objects between Activities using Serializable.
* Display Person details and location information.

## 🛠 Technologies Used

* Kotlin
* Android Studio
* RecyclerView
* SQLite Database
* HttpURLConnection
* Kotlin Coroutines (`CoroutineScope`)
* View Binding
* JSON Parsing
* Serializable Interface

## 📂 Project Structure

```text
app/
├── MainActivity.kt
├── MapActivity.kt
├── Person.kt
├── PersonAdapter.kt
├── HttpRequest.kt
├── DatabaseHelper.kt
├── PersonDbTableData.kt
├── activity_main.xml
├── activity_map.xml
├── person_item.xml
└── AndroidManifest.xml
```

## ✨ Features

### 1. JSON Data Fetching

* Retrieves Person data from a REST API.
* Uses `HttpURLConnection` for network communication.
* Executes network operations in the background using Kotlin Coroutines.

### 2. SQLite Database

* Insert Person records.
* Retrieve stored records.
* Update existing records.
* Delete records from the database.

### 3. RecyclerView

Displays Person records, including:

* Name
* Email
* Phone number
* Address

### 4. Map Activity

Passes Person objects using Serializable and displays:

* Name
* Address
* Latitude
* Longitude

## 👤 Person Model

```kotlin
class Person(
    var id: String,
    var name: String,
    var emailId: String,
    var phoneNo: String,
    var address: String,
    var latitude: Double,
    var longitude: Double
) : java.io.Serializable
```

## 🗄 SQLite Table Structure

| Column Name       | Data Type |
| ----------------- | --------- |
| `id`              | TEXT      |
| `person_name`     | TEXT      |
| `person_email_id` | TEXT      |
| `person_phone_no` | TEXT      |
| `person_address`  | TEXT      |
| `person_lat`      | REAL      |
| `person_long`     | REAL      |

## 🌐 Sample JSON API Response

```json
{
  "id": "123",
  "email": "user@gmail.com",
  "phone": "+919876543210",
  "profile": {
    "name": "Dhruvi Patel",
    "address": "Ahmedabad, Gujarat",
    "location": {
      "lat": 23.0225,
      "long": 72.5714
    }
  }
}
```

## 🔄 Application Workflow

```text
JSON API
   ↓
HttpURLConnection
   ↓
CoroutineScope
   ↓
JSON Parsing
   ↓
Person Object
   ↓
SQLite Database
   ↓
RecyclerView
   ↓
Map Activity
```

## 📱 Screenshots

### Main Screen

Displays Person records in a RecyclerView.

### Map Screen

Displays Person details, address, latitude, and longitude.

## 📖 Learning Outcomes

* Parse JSON data in Android applications.
* Connect Android apps with REST APIs.
* Use HttpURLConnection for network communication.
* Work with Kotlin Coroutines.
* Implement SQLite CRUD operations.
* Display data using RecyclerView.
* Transfer objects between Activities using Serializable.
* Develop database-driven Android applications.

## 🚀 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/Dhruvi-patel05/25012022005_Practical-7.git
   ```

2. Open the project in Android Studio.

3. Sync the Gradle files.

4. Connect an Android device or start an emulator.

5. Run the application.

## 👨‍💻 Author

**Dhruvi Patel**
B.Tech Information Technology

## 🔗 GitHub Repository

[**View Practical 7 on GitHub**](https://github.com/Dhruvi-patel05/25012022005_Practical-7)
