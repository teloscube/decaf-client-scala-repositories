// Define versions for libraries:
val VersionCats       = "1.4.0"
val VersionCatsEffect = "1.0.0"
val VersionCirce      = "0.10.0"

// Configure the root project:
lazy val root = (project in file("."))
  .enablePlugins(BuildInfoPlugin)
  .settings(
    // Top-level Settings:
    name := "decaf-client-scala-repositories",
    organization := "com.teloscube",
    scalaVersion := "2.12.13",
    version := "0.0.2-SNAPSHOT",

    // Scalac Options:
    scalacOptions += "-deprecation",

    // BuildInfo Settings:
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "com.vsthost.rnd.barista.client.repositories",

    // Libraries:
    libraryDependencies ++= Seq(
      "org.typelevel"   %% "cats-core"               % VersionCats,
      "org.typelevel"   %% "cats-effect"             % VersionCatsEffect,
      "io.circe"        %% "circe-core"              % VersionCirce,
      "io.circe"        %% "circe-generic"           % VersionCirce,
      "com.teloscube"   %% "decaf-client-scala-core" % "0.0.2-SNAPSHOT",
    )
  )
