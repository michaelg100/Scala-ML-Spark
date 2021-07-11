name := "firstscala"
version := "0.1"
scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.1.0",
  "org.apache.spark" %% "spark-core" % "2.4.0",
  "org.apache.spark" %% "spark-sql" % "2.4.0",
  "org.apache.spark" %% "spark-mllib" % "2.4.0"
)
