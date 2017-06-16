package self.yue.kotlintutorial.base

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by dongc on 6/14/2017.
 */
abstract class BaseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return if (inflater != null) inflater.inflate(getLayoutResId(), container, false) else
            super.onCreateView(inflater, container, savedInstanceState)
    }

    abstract fun getLayoutResId(): Int

    protected fun getBaseFragmentActivity(): BaseFragmentActivity = activity as BaseFragmentActivity
}