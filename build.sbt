name := "webscraper"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.6.3-RC2"
libraryDependencies ++= {
  Seq(
    "org.jsoup" % "jsoup" % "1.18.3"
  )
}
scalacOptions ++= Seq(
  "-Wall"
)
