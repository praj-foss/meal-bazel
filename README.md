Bazel Examples
===

### Project setup

Step 1: Build the jar with dependencies

```sh
bazel build //scala-sambhar:bin_deploy.jar
```

Step 2: Execute the jar

```sh
java -jar bazel-bin/scala-sambhar/bin_deploy.jar
```
