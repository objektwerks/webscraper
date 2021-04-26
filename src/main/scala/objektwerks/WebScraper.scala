package objektwerks

import org.jsoup._

import scala.jdk.CollectionConverters._

object WebScraper {
  def main(args: Array[String]): Unit = {
    val url = "https://github.com/objektwerks"
    val doc = Jsoup.connect(url).get()
    println(s"*** url: $url")
    println(s"*** title: ${doc.title()}")

    val contributions = doc.select("h2.f4.text-normal.mb-2").asScala.last.text()
    println(s"*** contributions: $contributions")
  }
}