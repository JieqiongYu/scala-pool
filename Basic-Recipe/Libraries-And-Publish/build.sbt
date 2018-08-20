name := "Animals"

organization := "farm"

version := "1.0.0"

scalaVersion := "2.12.3"

resolvers += "Sonatype Releases Repository" at "https://oss.sonatype.org/content/repositories/Releases"

{
    val liftVersion = "3.1.0"
    libraryDependencies ++= List(
        "net.liftweb" %% "lift-util" % liftVersion,
        "net.liftweb" %% "lift-json" % liftVersion
    )
}

publishTo := Some("Sonatype Releases Repository" at "https://oss.sonatype.org/content/repositories/Releases")

credentials += Credentials(Path.userHome / ".ivy2" / "credentials")