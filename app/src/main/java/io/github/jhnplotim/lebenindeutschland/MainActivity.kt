
package io.github.jhnplotim.lebenindeutschland

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import io.github.jhnplotim.lebenindeutschland.navigation.NavigationComponent
import io.github.jhnplotim.lebenindeutschland.navigation.NavigationControllerImpl
import io.github.jhnplotim.lebenindeutschland.navigation.composable
import io.github.jhnplotim.lebenindeutschland.ui.screen.Routes
import io.github.jhnplotim.lebenindeutschland.ui.screen.dashboard.DashboardScreen
import io.github.jhnplotim.lebenindeutschland.ui.screen.dashboard.DashboardViewModel
import io.github.jhnplotim.lebenindeutschland.ui.screen.login.LoginScreen
import io.github.jhnplotim.lebenindeutschland.ui.screen.login.LoginViewModel
import io.github.jhnplotim.lebenindeutschland.ui.theme.AndroidcomposetemplateTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navHostState = rememberNavController()
            val controller = NavigationControllerImpl(navHostState)
            AndroidcomposetemplateTheme {
                Surface(color = MaterialTheme.colors.background) {
                    NavigationComponent(
                        startRoute = Routes.Login,
                        navigationController = controller
                    ) {

                        composable<LoginViewModel>(
                            route = Routes.Login,
                            navigationController = controller
                        ) { _, vm ->
                            LoginScreen(vm)
                        }

                        composable<DashboardViewModel>(
                            route = Routes.Dashboard,
                            navigationController = controller
                        ) { _, vm ->
                            DashboardScreen(vm)
                        }
                    }
                }
            }
        }
    }
}