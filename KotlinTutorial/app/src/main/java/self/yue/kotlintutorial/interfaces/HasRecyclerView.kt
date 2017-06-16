package self.yue.kotlintutorial.interfaces

/**
 * Created by dongc on 6/14/2017.
 */
interface HasRecyclerView<T> {
    fun refreshList(objects: List<T>)
}