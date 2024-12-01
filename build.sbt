name := "webscraper"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.6.2-RC3"
libraryDependencies ++= {
  Seq(
    "org.jsoup" % "jsoup" % "1.18.1"
  )
}
scalacOptions ++= Seq(
  "-Wall"
)
