name := "webscraper"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.3.1"
libraryDependencies ++= {
  Seq(
    "org.jsoup" % "jsoup" % "1.16.2"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
