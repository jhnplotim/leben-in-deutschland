
package io.github.jhnplotim.lebenindeutschland.ui.screen

import androidx.navigation.NavType
import io.github.jhnplotim.lebenindeutschland.navigation.routing.ScreenRoute

object Routes {

    object Login : ScreenRoute(
        routeDefinition = Definition("login")
    )

    object Dashboard : ScreenRoute(
        routeDefinition = Definition("dashboard", argumentKeys = listOf(
            "username" to { type = NavType.StringType; optional = false }
        ))
    )

}