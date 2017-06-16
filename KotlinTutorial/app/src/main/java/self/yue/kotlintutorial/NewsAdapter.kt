package self.yue.kotlintutorial

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by dongc on 6/14/2017.
 */
class NewsAdapter(newsList: MutableList<News>) : RecyclerView.Adapter<NewsAdapter.ItemHolder>() {
    private var mNewsList: MutableList<News>? = null

    init {
        mNewsList = newsList
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent?.context)?.inflate(R.layout.item_news, parent, false))
    }

    override fun onBindViewHolder(holder: ItemHolder?, position: Int) {
        var news = mNewsList?.get(position)
        holder?.let {
            holder.textTitle.text = news?.title
            holder.textSummary.text = news?.summary
        }
    }

    override fun getItemCount(): Int {
        return mNewsList?.size ?: 0
    }

    class ItemHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        lateinit var textTitle: TextView
        lateinit var textSummary: TextView

        init {
            itemView?.let {
                textTitle = itemView.findViewById(R.id.text_title) as TextView
                textSummary = itemView.findViewById(R.id.text_summary) as TextView
            }
        }
    }
}