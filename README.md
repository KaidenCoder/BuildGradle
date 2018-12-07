# BuildGradle
Build Gradle is an app which display jokes which contain both paid and free flavors. 

## Features

### Common Project Requirements
* App is written solely in the Java Programming Language
* App utilizes stable release versions of all libraries, Gradle, and Android Studio.

### Required Components
* Project contains a Java library for supplying jokes.
* Project contains an Android library with an activity that displays jokes passed to it as intent extras.
* Project contains a Google Cloud Endpoints module that supplies jokes from the Java library. Project loads jokes from GCE module via an AsyncTask.
* Project contains connected tests to verify that the AsyncTask is indeed loading jokes.
* Project contains paid/free flavors. The paid flavor has no ads and no unnecessary dependencies.
* Ads are required in the free version.

### Required Behavior
* App retrieves jokes from Google Cloud Endpoints module and displays them via an Activity from the Android Library. Note that the GCE module need only be deployed locally.
