
package io.github.jhnplotim.lebenindeutschland.di.entrypoint

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import io.github.jhnplotim.lebenindeutschland.di.component.ComposableComponent

@InstallIn(ComposableComponent::class)
@EntryPoint
interface ComposableEntryPoint {

}