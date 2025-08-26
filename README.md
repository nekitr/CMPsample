This is a Kotlin Multiplatform project targeting Android, iOS.

* [/composeApp](./composeApp/src) is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - [commonMain](./composeApp/src/commonMain/kotlin) is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    the [iosMain](./composeApp/src/iosMain/kotlin) folder would be the right place for such calls.
    Similarly, if you want to edit the Desktop (JVM) specific part, the [jvmMain](./composeApp/src/jvmMain/kotlin)
    folder is the appropriate location.

* [/iosApp](./iosApp/iosApp) contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform,
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…

🚀 Tech Stack:
- Kotlin – shared business logic across Android & iOS
- Compose Multiplatform – modern declarative UI for both platforms
- Compose Navigation – seamless navigation between screens
- Ktor – networking and API communication
- Room – local persistence and database management
- Koin – lightweight dependency injection
- Coil – fast and efficient image loading

🏛 Architecture:
- Clean Architecture
  - Separation into layers: Domain, Data, Presentation
  - Improves testability, scalability, and maintainability
- MVI (Model–View–Intent)
  - Unidirectional data flow with predictable state management
  - UI fully driven by immutable state
  - Clear contract between View, Intent, and State

📱 Features:

- Two simple demo screens with smooth navigation using Compose Navigation
- Shared UI logic written once in Compose Multiplatform, running natively on Android & iOS
- Strong architectural foundation with MVI + Clean Architecture
- Integration of modern libraries for networking, persistence, DI, and image loading