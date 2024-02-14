# NotesApp Android

This is a simple notes application that allows users to create, view, edit, and delete notes. This app is developed in Kotlin and follows the MVVM (Model View ViewModel) architecture with the Repository design pattern. It also uses Jetpack to implement various libraries including Room Database and Hilt Dagger for dependency injection.

## Features

- Create new notes with title and content.
- View list of existing notes.
- Sort by date and tittle.
- Edit existing notes.
- Delete notes.

## Technologies Used

- [Jetpack](https://developer.android.com/jetpack) - is a suite of libraries to help developers follow best practices, reduce boilerplate code, and write code that works consistently across Android versions and devices.
- [Compose for UI](https://developer.android.com/jetpack/compose/mental-model) - Jetpack Compose is Android’s modern toolkit for building native UI. It simplifies and accelerates UI development on Android bringing your apps to life with less code, powerful tools, and intuitive Kotlin APIs following the declarative programming paradigm
- [Room](https://developer.android.com/jetpack/androidx/releases/room) - Room is a persistence library provided by the Android Jetpack framework. It is used to create and manage an abstraction over SQLite. Room provides an easy and efficient way to store, access, and manage structured data in an Android application.
- [Hilt Dagger](https://developer.android.com/training/dependency-injection/hilt-android) - Hilt is a dependency injection library for Android that reduces the boilerplate of doing manual dependency injection in your project.
- [Coroutines](https://developer.android.com/kotlin/coroutines) - They provide a concise and intuitive way to write asynchronous code, reducing the complexity associated with asynchronous programming.

## MVVM Architecture

The MVVM architecture divides an application into three distinct layers: the Model, the View, and the ViewModel. The Model represents the data and business logic, the View handles the visual presentation to the user, and the ViewModel acts as the intermediary between the Model and the View. This separation of concerns promotes code reusability, testability, and maintainability.

![IMG_1020](https://github.com/igmtz/NotesAppAndroid/assets/104402745/a1d0de2a-d1cf-48eb-a17c-2ab057056ccf)

The Repository Pattern is also implemented in this application. The Repository Pattern is a design approach that provides a structured and organized way to manage data access and manipulation. It serves as an intermediary between different data sources (like databases, network services) and the rest of the application. The primary goal is to abstract the data access details promoting clean architecture.

The key components is of this design pattern are:

1. **Model**: Define the structure of the data entities you’ll be working with (Note entity).
2. **Data Sources**: Implement classes that interact with specific data sources (Room database). In this case, a Data Access Object (DAO) is used to access the application’s persisted data in Room.
3. **Repository**: Class that acts as a bridge between data sources and the rest of the app. It provides methods for data access and manipulation.
