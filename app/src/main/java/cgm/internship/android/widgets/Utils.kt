package cgm.internship.android.widgets

import android.graphics.Color
import androidx.annotation.ColorInt
import java.util.*

/**
 * Created by dorunechifor.
 */
object Utils {

    private val randomizer = Random()

    // Generates Random integer between these limits (both inclusive)
    fun generateRandomIntegerBetween(lowerLimit: Int, upperLimit: Int): Int {
        return randomizer.nextInt(upperLimit + 1) + lowerLimit
    }

    @ColorInt
    fun generateRandomColor(): Int {
        val red = randomizer.nextInt(256)
        val green = randomizer.nextInt(256)
        val blue = randomizer.nextInt(256)
        return Color.rgb(red, green, blue)
    }
}
