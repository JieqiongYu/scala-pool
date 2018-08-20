name := "Animals"

organization in ThisBuild := "farm"

version in ThisBuild:= "1.0.0"

scalaVersion := "2.12.3"

resolvers += "Sonatype Releases Repository" at "https://oss.sonatype.org/content/repositories/Releases"

lazy val animals = project in file("animals")
// lazy val animals = project
lazy val animalsRunner = 
    (project in file("animals-runner"))
    .dependsOn(animals)