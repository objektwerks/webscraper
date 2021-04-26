package objektwerks

import org.jsoup._

import scala.jdk.CollectionConverters._

object WebScraper {
  def main(args: Array[String]): Unit = {
    val url = "https://github.com/objektwerks"
    println(s"*** url: $url")

    val doc = Jsoup.connect(url).get()
    println(s"*** title: ${doc.title()}")

    val organization = doc.select(".vcard-details li div").asScala.last.text
    println(s"*** organization: $organization")

    val profile = doc.select("div.p-note.user-profile-bio.mb-3.js-user-profile-bio.f4").asScala.last.text
    println(s"*** profile: $profile")

    val email = doc.select(".vcard-details li div").asScala.last.text
    println(s"*** email: $email")

    val contributions = doc.select("h2.f4.text-normal.mb-2").asScala.last.text()
    println(s"*** contributions: $contributions")
  }
}