name := "webscraper"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.6.4-RC2"
libraryDependencies ++= {
  Seq(
    "org.jsoup" % "jsoup" % "1.19.1"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
