package objektwerks

import org.jsoup._

import scala.jdk.CollectionConverters._

case class GithubExtract(url: String,
                         title: String,
                         organization: String,
                         location: String,
                         experience: String,
                         resume: String,
                         contributions: String) {
  override def toString: String = {
    val builder = new StringBuilder(9)
    builder ++= s"\ngithub extract\n"
    builder ++= s"--------------\n"
    builder ++= s"- url: $url\n"
    builder ++= s"- title: $title\n"
    builder ++= s"- organization: $organization\n"
    builder ++= s"- location: $location\n"
    builder ++= s"- experience: $experience\n"
    builder ++= s"- resume: $resume\n"
    builder ++= s"- contributions: $contributions\n"
    builder.result()
  }
}

object GithubScraper {
  def scrape(url: String): GithubExtract = {
    val doc = Jsoup.connect(url).get()
    GithubExtract(
      url = url,
      title = doc.title(),
      organization = doc.select(".vcard-details li div").asScala.last.text,
      location = doc.select(".vcard-detail .p-label").asScala.last.text,
      experience = doc.select("div.p-note.user-profile-bio.mb-3.js-user-profile-bio.f4").asScala.last.text,
      resume = doc.select("li.vcard-detail.pt-1 a.Link--primary").asScala.last.text,
      contributions = doc.select("h2.f4.text-normal.mb-2").asScala.last.text()
    )
  }
}