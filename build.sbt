name := "download-issue"
organization := "com.bolour.eagerwords.scala"
version := "2.0.11"
publishMavenStyle := true
publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))

packageName in Universal := name.value

lazy val `scala-server` = (project in file("."))
  .enablePlugins(PlayScala)
    .disablePlugins(PlayLayoutPlugin)

sources in (Compile, doc) := Seq.empty
publishArtifact in (Compile, packageDoc) := false
Test / parallelExecution := false
Global / concurrentRestrictions += Tags.limit(Tags.Test, 1)

scalaVersion := "2.12.12"

dependencyOverrides ++= Seq( // Seq for SBT 1.0.x
  "com.typesafe.play" %% "play" % "2.8.0",
  "com.typesafe.play" %% "play-akka-http-server" % "2.8.0",
  "com.google.guava" % "guava" % "22.0",
  "org.slf4j" % "slf4j-api" % "1.7.28"
)

libraryDependencies ++= Seq(guice )
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % "test"

