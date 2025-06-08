name := "webscraper"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.7.1"
libraryDependencies ++= {
  Seq(
    "org.jsoup" % "jsoup" % "1.20.1"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
