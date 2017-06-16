package self.yue.kotlintutorial.data.server

/**
 * Created by dongc on 6/15/2017.
 */
class ServerResponse<T> {
    var code: Int = 0
    var message: String = ""
    var result: T? = null
}