name := "TextGravy"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache)

libraryDependencies ++= Seq(
  "com.googlecode.flickrj-android" % "flickrj-android" % "2.0.8",
  "org.json" % "json" % "20140107",
  "org.slf4j" % "slf4j-api" % "1.7.7")


play.Project.playScalaSettings
