

resolvers += "Prize Ltd" at "s3://repo.prize.ltd.uk/maven"

publishMavenStyle := true
publishTo := Some("Prize Ltd" at "s3://repo.prize.ltd.uk/maven")


lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.5",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    libraryDependencies  ++= Seq(
	"org.scalatest" %% "scalatest" % "3.0.5" % Test,
	"uk.ltd.prize.holidaytravel" % "provider-factories" % "1.1")
  )
