name := "webscraper"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.9.0-RC4"
libraryDependencies ++= {
  Seq(
    "org.jsoup" % "jsoup" % "1.23.1"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
