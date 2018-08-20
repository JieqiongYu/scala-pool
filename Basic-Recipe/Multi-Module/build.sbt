name := "Animals"

organization in ThisBuild := "farm"

version in ThisBuild:= "1.0.0"

scalaVersion := "2.12.3"

resolvers += "Sonatype Releases Repository" at "https://oss.sonatype.org/content/repositories/Releases"

val liftVersion = "3.1.0"

lazy val animals = project in file("animals")
// lazy val animals = project
lazy val animalsRunner = 
    (project in file("animals-runner"))
        .settings(libraryDependencies ++= List(
            "net.liftweb" %% "lift-util" % liftVersion,
            "net.liftweb" %% "lift-json" % liftVersion
        )
    )
    .dependsOn(animals)