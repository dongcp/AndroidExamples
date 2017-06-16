package self.yue.kotlintutorial.interfaces

import android.view.View

/**
 * Created by dongc on 6/14/2017.
 */
interface FragmentHasRecyclerView<T> : HasRecyclerView<T> {
    fun initRecyclerViews(rootView: View?)
}