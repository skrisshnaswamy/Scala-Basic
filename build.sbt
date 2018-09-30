import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.basics",
      scalaVersion := "2.12.7",
      version      := "0.1"
    )),
    name := "Scala-Basic",
    libraryDependencies += scalaTest % Test
  )