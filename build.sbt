sbtPlugin := true

scalacOptions := Seq("-deprecation", "-encoding", "utf8")

//crossSbtVersions := Vector("0.13.16", "1.0.0")

// Scripted test options.

ScriptedPlugin.projectSettings

version := "0.9.0.1"

organization := "io.spray"

scriptedLaunchOpts += s"-Dplugin.version=${version.value}"

scriptedBufferLog := false

test in Test := (test in Test).dependsOn(scripted.toTask("")).value

publishMavenStyle := true
