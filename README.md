

Add line to project/build.scala

```
lazy val axi4 = Project("axi4", file("axi4")).dependsOn(chisel)
```
