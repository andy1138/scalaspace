name := "hello"

version := "1.0"

scalaVersion := "2.10.5"

//libraryDependencies ++= Seq("com.propensive" %% "rapture-core" % "0.9.0")

//libraryDependencies ++= Seq("com.propensive" %% "rapture-json" % "0.9.0")

//libraryDependencies ++= Seq("com.propensive" %% "rapture-io" % "0.9.0")

//libraryDependencies ++= Seq("com.propensive" %% "rapture-net" % "0.10.0")


libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.12" % "test",
  "org.scalatest" %% "scalatest" % "2.2.0" % "test",
  "com.propensive" %% "rapture-io" % "0.9.1" withSources() withJavadoc(),
  "com.propensive" %% "rapture-json" % "0.9.1" withSources() withJavadoc(),
  "com.propensive" %% "rapture-json-jackson" % "0.9.0" withSources() withJavadoc(),
  "com.propensive" %% "rapture-core" % "0.9.0" withSources() withJavadoc(),
  "com.propensive" %% "rapture-net" % "0.9.0" withSources() withJavadoc(),
  "com.propensive" %% "rapture-uri" % "0.9.1" withSources() withJavadoc()
)

