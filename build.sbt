name := "webscraper"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.5.0-RC5"
libraryDependencies ++= {
  Seq(
    "org.jsoup" % "jsoup" % "1.18.1"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
