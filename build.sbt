name := "webscraper"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.8.2-RC3"
libraryDependencies ++= {
  Seq(
    "org.jsoup" % "jsoup" % "1.21.2"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
