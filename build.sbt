name := "webscraper"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.6.3"
libraryDependencies ++= {
  Seq(
    "org.jsoup" % "jsoup" % "1.18.3"
  )
}
scalacOptions ++= Seq(
  "-Wall"
)
