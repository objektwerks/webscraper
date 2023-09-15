package objektwerks

@main
def runWebScraper(): Unit =
  println( GithubScraper.scrape(url = "https://github.com/objektwerks") )