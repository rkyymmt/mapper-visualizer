organization := "info.rkyymmt"

name := "mapper-visualizer"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.9.0-1"

/**Shell */
shellPrompt := {
  state => System.getProperty("user.name") + "> "
}

shellPrompt in ThisBuild := {
  state => Project.extract(state).currentRef.project + "> "
}

libraryDependencies ++= {
  val liftVersion = "2.4-M3"
  Seq(
    "net.liftweb" %% "lift-mapper" % liftVersion % "compile->default" withSources
  )
}

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "0.9.29" % "compile->default",
  "org.scala-tools.testing" %% "specs" % "1.6.8" % "test->default"
)
