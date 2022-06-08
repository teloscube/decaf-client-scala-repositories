// Define versions for libraries:
val VersionCats        = "1.4.0"
val VersionCatsEffect  = "1.0.0"
val VersionCirce       = "0.10.0"
val VersionDecafClient = "0.0.2"

// Configure the root project:
lazy val root = (project in file("."))
  .enablePlugins(BuildInfoPlugin)
  .settings(
    name := "decaf-client-scala-repositories",
    version := "0.0.2-SNAPSHOT",
    description := "DECAF API Scala Client Extensions for Record Repositories.",
    homepage := Some(
      url(
        "https://github.com/teloscube/decaf-client-scala-repositories",
      ),
    ),
    licenses := List(
      "Apache 2" -> new URL(
        "http://www.apache.org/licenses/LICENSE-2.0.txt",
      ),
    ),
    organization := "com.decafhub",
    organizationName := "decafhub",
    organizationHomepage := Some(
      url("https://decafhub.com"),
    ),
    scmInfo := Some(
      ScmInfo(
        url(
          "https://github.com/teloscube/decaf-client-scala-repositories",
        ),
        "scm:git@github.com:teloscube/decaf-client-scala-repositories.git",
      ),
    ),
    developers := List(
      Developer(
        id = "vst",
        name = "Vehbi Sinan Tunalioglu",
        email = "vst@vsthost.com",
        url = url("https://github.com/vst"),
      ),
    ),
    scalaVersion := "2.12.15",
    scalacOptions += "-deprecation",
    buildInfoKeys := Seq[BuildInfoKey](
      name,
      version,
      scalaVersion,
      sbtVersion,
    ),
    buildInfoPackage := "com.decafhub.decaf.client.repositories.buildinfo",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core"          % VersionCats,
      "org.typelevel" %% "cats-effect"        % VersionCatsEffect,
      "io.circe"      %% "circe-core"         % VersionCirce,
      "io.circe"      %% "circe-generic"      % VersionCirce,
      "com.decafhub"  %% "decaf-client-scala" % VersionDecafClient,
    ),
    pomIncludeRepository := { _ => false },
    publishTo := {
      val nexus = "https://s01.oss.sonatype.org/"
      if (isSnapshot.value)
        Some(
          "snapshots" at nexus + "content/repositories/snapshots",
        )
      else
        Some(
          "releases" at nexus + "service/local/staging/deploy/maven2",
        )
    },
    publishMavenStyle := true,
  )
