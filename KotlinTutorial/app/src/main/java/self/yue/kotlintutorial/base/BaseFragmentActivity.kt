package self.yue.kotlintutorial.base

/**
 * Created by dongc on 6/14/2017.
 */
abstract class BaseFragmentActivity : BaseActivity() {

    override fun getLayoutResId(): Int {
        return self.yue.kotlintutorial.R.layout.base_fragment_activity
    }

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)

        fragmentManager.beginTransaction().add(self.yue.kotlintutorial.R.id.fragment_container, getFirstFragment()).commit()
    }

    abstract fun getFirstFragment(): BaseFragment
}