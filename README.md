# Practical 5: Login and Registration Screens using Jetpack Compose

## 📌 Aim

To develop an Android application containing Login and Registration screens using Kotlin and Jetpack Compose.

## 🎯 Objectives

* Design a Login screen using Jetpack Compose.
* Design a Registration screen with input fields.
* Use Material 3 components.
* Implement navigation between Login and Registration screens.
* Perform basic form validation.
* Create reusable UI components.

## 🛠 Technologies Used

* Kotlin
* Android Studio
* Jetpack Compose
* Material 3
* Navigation Compose
* Android Toast
* State Management

## 📂 Project Structure

```text
25012022005_Practical_5/
├── MainActivity.kt
├── AppNavigation.kt
├── LoginScreen.kt
├── RegisterScreen.kt
├── FormField.kt
├── ui/
│   └── theme/
├── res/
│   └── drawable/
│       └── guni_pink_logo.png
└── README.md
```

## ✨ Features

### 1. Login Screen

* GUNI pink logo
* Email input field
* Password input field
* Login button
* Forgot Password option
* Navigation to Registration screen

### 2. Registration Screen

* Name input field
* Phone number input field
* City input field
* Email input field
* Password and Confirm Password fields
* Register button
* Basic form validation
* Navigation back to Login screen

### 3. Reusable Form Fields

The `FormField.kt` file provides reusable input fields for email, password, name, phone number, and other details.

### 4. Navigation

The `AppNavigation.kt` file uses Navigation Compose to navigate between Login and Registration screens.

## 🔄 Application Workflow

```text
       Start Application
              ↓
         Login Screen
          ↙       ↘
 Register Screen   Login Button
       ↓
 Enter Details
       ↓
 Validate Input
       ↓
 Display Message
       ↓
 Return to Login
```

## 🚀 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/Dhruvi-patel05/25012022005_Practical-5.git
   ```

2. Open the project in Android Studio.

3. Sync the Gradle files.

4. Ensure `guni_pink_logo.png` is in the drawable folder.

5. Run the application on an emulator or Android device.

## 👨‍💻 Author

**Dhruvi Patel**
B.Tech Information Technology

## 🔗 GitHub Repository

[View Practical 5 on GitHub](https://github.com/Dhruvi-patel05/25012022005_Practical-5)

## 📝 Conclusion

This practical demonstrates the development of Login and Registration screens using Jetpack Compose. It covers UI design, reusable composables, navigation, state management, and basic form validation.

**Note:** The Login and Registration screens currently demonstrate UI and basic validation. Real authentication and database integration require additional implementation.
