# play-sbt-downdload-issue
minimal scala project showing play sbt plugin download issue in github actions

The CI build in github actions fails with errors like the following:

lmcoursier.internal.shaded.coursier.error.FetchError$DownloadingArtifacts: Error fetching artifacts:
Error:  https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/com.typesafe.play/sbt-plugin/scala_2.12/sbt_1.0/2.8.0/jars/sbt-plugin.jar: download error: Caught javax.net.ssl.SSLHandshakeException: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target (sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target) while downloading https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/com.typesafe.play/sbt-plugin/scala_2.12/sbt_1.0/2.8.0/jars/sbt-plugin.jar
