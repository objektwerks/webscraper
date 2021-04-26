package objektwerks

import org.jsoup._

object WebScraper {
  def main(args: Array[String]): Unit = {
    val url = "https://github.com/objektwerks"
    val doc = Jsoup.connect(url).get()
    println(s"*** url: $url")
    println(s"*** title: ${doc.title()}")
    println(s"*** body: ${doc.body()}")
  }
}