organization in Global := "keisukehonda"

scalaVersion in Global := "2.10.4"

crossScalaVersions in Global := Seq("2.10.4", "2.11.5")

resolvers += Resolver.sonatypeRepo("releases")

lazy val deeply = project.in(file(".")).aggregate(core).settings(publish := {})

lazy val core = project

parallelExecution in Global := false

publish := {}

//common.promptSettings
