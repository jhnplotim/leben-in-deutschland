
package io.github.jhnplotim.lebenindeutschland.ui.screen.dashboard

import androidx.lifecycle.SavedStateHandle
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.jhnplotim.lebenindeutschland.ui.screen.common.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
): BaseViewModel() {

    private val mUsernameState = MutableStateFlow(savedStateHandle.get<String>("username") ?: "")
    val usernameState: StateFlow<String>
        get() = mUsernameState

}