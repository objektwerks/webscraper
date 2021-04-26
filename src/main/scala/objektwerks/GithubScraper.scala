package objektwerks

import org.jsoup._

import scala.jdk.CollectionConverters._

object GithubScraper {
  def scrape(url: String): String = {
    val doc = Jsoup.connect(url).get()
    val builder = new StringBuilder(9)
    builder ++= s"\ngithub scraper\n"
    builder ++= s"--------------\n"
    builder ++= s"- url: $url\n"
    builder ++= s"- title: ${doc.title}\n"
    builder ++= s"- organization: ${doc.select(".vcard-details li div").asScala.last.text}\n"
    builder ++= s"- location: ${doc.select(".vcard-detail .p-label").asScala.last.text}\n"
    builder ++= s"- experience: ${doc.select("div.p-note.user-profile-bio.mb-3.js-user-profile-bio.f4").asScala.last.text}\n"
    builder ++= s"- resume: ${doc.select("li.vcard-detail.pt-1 a.Link--primary").asScala.last.text}\n"
    builder ++= s"- contributions: ${doc.select("h2.f4.text-normal.mb-2").asScala.last.text}\n"
    builder.result()
  }
}