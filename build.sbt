name := "TextGravy"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache)

libraryDependencies += "com.googlecode.flickrj-android" % "flickrj-android" % "2.0.8"

play.Project.playScalaSettings
