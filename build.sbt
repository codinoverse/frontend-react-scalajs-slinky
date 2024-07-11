ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "frontend-react-scalajs-slinky",
    scalaJSUseMainModuleInitializer := true,
    scalacOptions += "-Ymacro-annotations",
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.8.0",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % Test,
    libraryDependencies += "me.shadaj" %%% "slinky-core" % "0.7.4",
    libraryDependencies += "me.shadaj" %%% "slinky-web" % "0.7.4",

  )

