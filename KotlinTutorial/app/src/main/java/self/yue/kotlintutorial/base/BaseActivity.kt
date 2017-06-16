package self.yue.kotlintutorial.base

import android.widget.Toast
import self.yue.kotlintutorial.interfaces.ShowableContent

/**
 * Created by dongc on 6/14/2017.
 */
abstract class BaseActivity : android.support.v7.app.AppCompatActivity(), ShowableContent {
    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(getLayoutResId())
    }

    override fun showToast(message: String, duration: Int) {
        Toast.makeText(this, message, duration).show()
    }

    abstract fun getLayoutResId(): Int
}