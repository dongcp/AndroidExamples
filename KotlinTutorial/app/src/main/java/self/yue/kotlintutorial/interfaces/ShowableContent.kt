package self.yue.kotlintutorial.interfaces

import android.widget.Toast

/**
 * Created by dongc on 6/14/2017.
 */
interface ShowableContent {
    fun showToast(message: String, duration: Int = Toast.LENGTH_SHORT)
}