load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary")
scala_binary(
    name = "bin",
    srcs = glob(["src/**/*.scala"]),
    main_class = "bowl.Sambhar",
    deps = [
        "//java-pulao:lib",
        "@maven//:org_apache_commons_commons_lang3"
    ]
)
