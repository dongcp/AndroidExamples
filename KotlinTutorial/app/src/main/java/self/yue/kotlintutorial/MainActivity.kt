package self.yue.kotlintutorial

import self.yue.kotlintutorial.base.BaseFragment
import self.yue.kotlintutorial.base.BaseFragmentActivity

/**
 * Created by dongc on 6/14/2017.
 */
class MainActivity : BaseFragmentActivity() {

    override fun getFirstFragment(): BaseFragment = NewsFragment()
}