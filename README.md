# sangria-graphql derivation bug

This repository serves the purpose of investigating sangria-graphql bug https://github.com/sangria-graphql/sangria/issues/172 ("Field list is empty").

Currently, compiling this project yields the above mentioned error "Field list is empty". It's unclear to me at the moment if the reason for the error is a library misuse from my side or it's indeed a reproducible for https://github.com/sangria-graphql/sangria/issues/172.

# Steps to reproduce the error

```sbt
$ sbt
	[info] Loading settings from idea.sbt ...
[info] Loading global plugins from /Users/mirco/.sbt/1.0/plugins
[info] Loading project definition from /Users/mirco/tmp/sangria-bug/project
[info] Loading settings from build.sbt ...
[info] Set current project to sangria-bug (in build file:/Users/mirco/tmp/sangria-bug/)
[info] sbt server started at 127.0.0.1:4722
sbt:sangria-bug> compile
[info] Compiling 4 Scala sources to /Users/mirco/tmp/sangria-bug/target/scala-2.12/classes ...
[error] /Users/mirco/tmp/sangria-bug/src/main/scala/bug/Derivation.scala:6:68: Field list is empty
[error]   val MutationType = deriveContextObjectType[MyCtx, Mutation, Unit](_.mutation)
[error]                                                                    ^
[error] one error found
[error] (compile:compileIncremental) Compilation failed
[error] Total time: 1 s, completed Dec 24, 2017 11:30:08 AM
```
