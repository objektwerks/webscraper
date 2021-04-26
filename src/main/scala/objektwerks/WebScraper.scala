package objektwerks

object WebScraper {
  def main(args: Array[String]): Unit = {
    println( GithubScraper.scrape(url = "https://github.com/objektwerks") )
  }
}