- [ ] AXI4 Lite Master
- [x] AXI4 Lite Slave
- [ ] AXI4 Master
- [ ] AXI4 Slave
- [ ] AXI4 Stream

Add line to project/build.scala

```
lazy val axi4 = Project("axi4", file("axi4")).dependsOn(chisel)
```
