import sbt._

class ScoutProject(info: ProjectInfo) extends DefaultProject(info) with growl.GrowlingTests{
	val specs = "org.scalatest" % "scalatest" % "1.0" % "test"
}
