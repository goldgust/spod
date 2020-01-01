# spod

A Scala base docker image for gitpod.

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/goldgust/spod)

### Setup a new project

```
unset JAVA_TOOL_OPTIONS

sbt new scala/scala-seed.g8
(choose project name)

cd (project name)
sbt --error run
sbt --error test
```



For [s-99](http://aperiodic.net/phil/scala/s-99/)
```
sbt new scala/scalatest-example.g8
(choose project name app)
cd app
sbt --error test
```
