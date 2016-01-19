organization := "com.github.karasiq"

name := "sbt-scalajs-bundler"

isSnapshot := false

version := "1.0.3"

scalacOptions ++= Seq("-target:jvm-1.7")

sbtPlugin := true

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "commons-io" % "commons-io" % "2.4",
  "org.scalaj" %% "scalaj-http" % "2.2.1",
  "org.jsoup" % "jsoup" % "1.8.3",
  "com.google.javascript" % "closure-compiler" % "v20151216" % "provided",
  "com.yahoo.platform.yui" % "yuicompressor" % "2.4.8",
  "com.googlecode.htmlcompressor" % "htmlcompressor" % "1.5.2",
  "de.neuland-bfi" % "jade4j" % "1.1.4" % "provided",
  "com.github.sommeri" % "less4j" % "1.15.4" % "provided"
)

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ ⇒ false }

licenses := Seq("Apache License, Version 2.0" → url("http://opensource.org/licenses/Apache-2.0"))

homepage := Some(url("https://github.com/Karasiq/" + name.value))

pomExtra := <scm>
  <url>git@github.com:Karasiq/{name.value}.git</url>
  <connection>scm:git:git@github.com:Karasiq/{name.value}.git</connection>
</scm>
  <developers>
    <developer>
      <id>karasiq</id>
      <name>Piston Karasiq</name>
      <url>https://github.com/Karasiq</url>
    </developer>
  </developers>