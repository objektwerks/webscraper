name := "webscraper"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.7.4-RC2"
libraryDependencies ++= {
  Seq(
    "org.jsoup" % "jsoup" % "1.21.2"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
