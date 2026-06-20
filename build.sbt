name := "webscraper"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.9.0-RC1"
libraryDependencies ++= {
  Seq(
    "org.jsoup" % "jsoup" % "1.22.1"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
