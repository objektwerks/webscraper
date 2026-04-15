name := "webscraper"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.8.4-RC1"
libraryDependencies ++= {
  Seq(
    "org.jsoup" % "jsoup" % "1.22.1"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
