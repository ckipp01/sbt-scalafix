inThisBuild(
  List(
    scalaVersion := "2.12.11"
  )
)

lazy val root = project
  .in(file("."))
  .aggregate(lib)

lazy val lib = project
  .in(file("lib"))
  .settings(
    addCompilerPlugin(scalafixSemanticdb),
    scalacOptions ++= List(
      "-Ywarn-unused",
      "-Yrangepos"
    )
  )
