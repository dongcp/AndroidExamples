package self.yue.kotlintutorial

import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.View
import self.yue.kotlintutorial.base.BaseFragment
import self.yue.kotlintutorial.interfaces.FragmentHasRecyclerView

/**
 * Created by dongc on 6/14/2017.
 */
class NewsFragment : BaseFragment(), FragmentHasRecyclerView<News> {

    private var mToolbar: Toolbar? = null
    private var mRecyclerNews: RecyclerView? = null
    private var mListRefresher: SwipeRefreshLayout? = null

    private var mNewsList: MutableList<News> = ArrayList<News>()

    private var mNewsAdapter: NewsAdapter? = null

    override fun getLayoutResId(): Int = R.layout.fragment_news

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews(view)

        initRecyclerViews(view)

        setupListRefresher()
    }

    override fun onResume() {
        super.onResume()
        mListRefresher?.isRefreshing = true
        refreshList(fetchData())
    }

    override fun initRecyclerViews(rootView: View?) {
        // Find view
        mRecyclerNews = rootView?.findViewById(R.id.recycler_news) as RecyclerView

        // Setup recycler view
        mRecyclerNews?.layoutManager = LinearLayoutManager(activity)

        mNewsAdapter = NewsAdapter(mNewsList)
        mRecyclerNews?.adapter = mNewsAdapter
    }

    override fun refreshList(objects: List<News>) {
        // Stop the loading progress
        mListRefresher?.isRefreshing = false

        if (objects.isNotEmpty()) {
            mNewsList.clear()
            mNewsList.addAll(objects)
            mNewsAdapter?.notifyDataSetChanged()
        } else {
            getBaseFragmentActivity().showToast("Nothing changed")
        }
    }

    private fun initViews(rootView: View?) {
        rootView?.let {
            mToolbar = rootView.findViewById(R.id.toolbar) as Toolbar
            mListRefresher = rootView.findViewById(R.id.list_refresher) as SwipeRefreshLayout
        }
    }

    private fun setupListRefresher() {
        mListRefresher?.setColorSchemeColors(
                android.R.color.holo_blue_light,
                android.R.color.holo_red_light,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light)


    }

    private fun fetchData(): List<News> {
        return listOf(
                News("Aloha", "Day la loi chao"),
                News("Ahihi", "Day la loi e then"))
    }
}