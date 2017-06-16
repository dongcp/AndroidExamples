package self.yue.kotlintutorial

/**
 * Created by dongc on 6/14/2017.
 */
class News {
    constructor(title: String, summary: String) {
        this.title = title
        this.summary = summary
    }

    var title: String = ""
    var content: String = ""
    var summary: String = ""
}