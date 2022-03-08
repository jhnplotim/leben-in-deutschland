
package io.github.jhnplotim.lebenindeutschland.navigation.routing

interface NavigableRoute<R: ScreenRoute> {

    val screenRoute: R

    val path: String

}