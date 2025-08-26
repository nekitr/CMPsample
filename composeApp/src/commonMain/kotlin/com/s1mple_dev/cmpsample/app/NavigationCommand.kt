package com.s1mple_dev.cmpsample.app

sealed class NavigationCommand {

    sealed class Inner : NavigationCommand() {
        data object FirstNavigation : Inner()
        data object SecondNavigation : Inner()
    }

    sealed class Outer : NavigationCommand() {
        data object PickFileNavigation : Outer()
        data object ShareAppNavigation : Outer()
        data object RateUsGoogleFormNavigation : Outer()
        data object RateUsPlayStoreNavigation : Outer()
        data object PrivacyPolicyNavigation : Outer()
        data object TermsAndConditionsNavigation : Outer()
        data object SupportNavigation : Outer()
    }
}