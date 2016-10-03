package axi4

import Chisel._

object axi4 {
  def main(args: Array[String]) {

    val test_args = args.slice(1, args.length)

    args(0) match {
      case "lite_slave" 
        => chiselMain(test_args, () => Module(new AXI4LiteSlave(4, 32))) 
      case "lite_slave_test" 
        => chiselMain(test_args, () => Module(new LiteSlaveTest))

      case _ => assert(false)
    }

  }
}
