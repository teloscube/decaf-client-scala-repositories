// Define versions for libraries:
val VersionCats              = "1.2.0"
val VersionCatsEffect        = "1.0.0-RC3"
val VersionCirce             = "0.9.3"


// Configure the root project:
lazy val root = (project in file("."))
  .enablePlugins(BuildInfoPlugin)
  .dependsOn(RootProject(uri("https://github.com/teloscube/decaf-client-scala.git#0.0.1")))
  .settings(
    // Top-level Settings:
    name := "barista-client-repositories",
    organization := "com.vsthost.rnd",
    scalaVersion := "2.12.6",
    version := "0.0.2-SNAPSHOT",

    // Scalac Options:
    scalacOptions += "-deprecation",

    // BuildInfo Settings:
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "com.vsthost.rnd.barista.client.repositories",

    // Libraries:
    libraryDependencies ++= Seq(
      "org.typelevel"   %% "cats-core"           % VersionCats,
      "org.typelevel"   %% "cats-effect"         % VersionCatsEffect,
      "io.circe"        %% "circe-core"          % VersionCirce,
      "io.circe"        %% "circe-generic"       % VersionCirce,
    )
  )
