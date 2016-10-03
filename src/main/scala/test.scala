package axi4

import Chisel._

class LiteSlaveTest extends Module {
  val addr_width = 4
  val data_width = 32

  val io = new Bundle {
    val LEDG = Bits(width = 4).asOutput
    val slave = new AXI4LiteSlaveIO(addr_width, data_width)
  } 

  val slave = Module(new AXI4LiteSlave(addr_width, data_width))

  val slave_data_valid = Bool()
  val slave_data_data = Reg(init = Bits(0, width = data_width))
  val slave_data_ready = Bool(false)

  slave_data_valid := slave.io.host_data.valid
  slave.io.host_data.ready := Bool(false)
  io.slave <> slave.io.slave

  when(slave.io.host_data.valid)
  {
    slave_data_data := slave.io.host_data.data
    slave.io.host_data.ready := Bool(true)
  }

  io.LEDG := slave_data_data 
}

