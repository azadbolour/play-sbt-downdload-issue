logLevel := Level.Warn

// resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"
resolvers += Resolver.sbtPluginRepo("releases")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.0")

