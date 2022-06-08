// Define versions for libraries:
val VersionCats        = "1.4.0"
val VersionCatsEffect  = "1.0.0"
val VersionCirce       = "0.10.0"
val VersionDecafClient = "0.0.2-SNAPSHOT"

// Configure the root project:
lazy val root = (project in file("."))
  .enablePlugins(BuildInfoPlugin)
  .settings(
    // Top-level Settings:
    name := "decaf-client-scala-repositories",
    organization := "com.decafhub",
    scalaVersion := "2.12.15",
    version := "0.0.2-SNAPSHOT",

    // Scalac Options:
    scalacOptions += "-deprecation",

    // BuildInfo Settings:
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "com.decafhub.decaf.client.repositories.buildinfo",

    // Libraries:
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core"          % VersionCats,
      "org.typelevel" %% "cats-effect"        % VersionCatsEffect,
      "io.circe"      %% "circe-core"         % VersionCirce,
      "io.circe"      %% "circe-generic"      % VersionCirce,
      "com.decafhub"  %% "decaf-client-scala" % VersionDecafClient,
    )
  )
