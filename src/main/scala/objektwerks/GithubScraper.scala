package objektwerks

import org.jsoup._

import scala.jdk.CollectionConverters._

case class GithubScraper(url: String,
                         title: String,
                         organization: String, 
                         location: String,
                         experience: String,
                         resume: String,
                         contributions: String) {
  override def toString: String = {
    val builder = new StringBuilder(6)
    builder ++= s"\ngithub scraper\n"
    builder ++= s"--------------\n"
    builder ++= s"- url: $url\n"
    builder ++= s"- title: $title\n"
    builder ++= s"- organization: $organization\n"
    builder ++= s"- experience: $experience\n"
    builder ++= s"- resume: $resume\n"
    builder ++= s"- contributions: $contributions\n"
    builder.result()
  }
}

object GithubScraper {
  def scrape(url: String): GithubScraper = {
    val doc = Jsoup.connect(url).get()
    val title = doc.title()
    val organization = doc.select(".vcard-details li div").asScala.last.text
    val location = doc.select(".vcard-detail .p-label").asScala.last.text
    val experience = doc.select("div.p-note.user-profile-bio.mb-3.js-user-profile-bio.f4").asScala.last.text
    val resume = doc.select("li.vcard-detail.pt-1 a.Link--primary").asScala.last.text
    val contributions = doc.select("h2.f4.text-normal.mb-2").asScala.last.text()
    GithubScraper(url, title, organization, location, experience, resume, contributions)
  }
}