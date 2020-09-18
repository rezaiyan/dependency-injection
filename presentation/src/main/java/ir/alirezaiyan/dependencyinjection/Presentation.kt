// <editor-fold desc="Dependency Injection">
package ir.alirezaiyan.dependencyinjection

import ir.alirezaiyan.dependencyinjection.helper.*

// </editor-fold>





// <editor-fold desc="Introduction">

//    _______
//     |   |
//     |   |
//     |   |
//    |||||||
//    |     |
//    |     |
//    |XXXXX|
//    |XXXXX|
//    |XXXXX|
//    +--+--+
//       |
//       |
//       |
//       +


var whatIsDependencyInjection = {
/*Separation of concerns of construction and use of objects (loosely coupled)*/
/*Separate the responsibility of creation of an object to out of the concretes*/
    val soliD = "Dependency inversion principle"
    val injectionTypes = listOf("Constructor", "Property", "Method")
}
// </editor-fold>





// <editor-fold desc="Agnosticism">

var whyDoWeNeedIt = {
    becauseOf(
        "GOD",


        "We can work independently",
        "We can have a cleaner code",
        "We can have more maintainable code",
        "Our code will be more readable",
        "Our code will be more reusable",
        "Have a different configuration",
        "We can plan for testing",

        )
}

var it = WhatDependencyInjectionToolsAreAvailableForAndroid {

    lateinit var dagger: Dagger
    lateinit var hilt: Hilt
    var guice: Guice? = null
    var koin: Koin? = null
    var kodein: Kodein? = null
    var etc: Unit? = null

}


// </editor-fold>





// <editor-fold desc="Evidence">


//       .---.
//       |---|
//       |---|
//       |---|
//   .---^ - ^---.
//   :___________:
//      |  |//|
//      |  |//|
//      |  |//|
//      |  |//|
//      |  |//|
//      |  |//|
//      |  |.-|
//      |.-'**|
//       \***/
//        \*/
//         V


var WhatIsDagger = {
    /*A dagger is a knife with a very sharp point and usually two sharp edges*/

    /*NO NO :) */


    description(
        "Dagger is a fully static," +
        "compile-time dependency injection framework for Java, Kotlin, and Android"
    )

    website("dagger.dev")

}

var WhatIsHilt = {

    description(
        "Hilt provides a standard way" +
        "to incorporate Dagger dependency injection into an Android application.")

    website("dagger.dev/hilt")

    goals(
        "To simplify Dagger-related infrastructure for Android apps",
        "To create a standard set of components and scopes to ease setup, readability/understanding, and code sharing between apps",
        "To provide an easy way to provision different bindings to various build types (e.g. testing, debug, or release)"
    )

}

// </editor-fold>





// <editor-fold desc="Anything else">
var HowAboutOthers = {

    koin("A pragmatic lightweight dependency injection framework for Kotlin developers")

    kodein("A very simple and yet very useful pure Kotlin dependency retrieval container")

}
// </editor-fold>





// <editor-fold desc="Q&A">
// </editor-fold>