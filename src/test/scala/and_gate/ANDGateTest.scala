package and_gate

import chisel3._, chiseltest._, org.scalatest.freespec.AnyFreeSpec


class ANDGateTest extends AnyFreeSpec with ChiselScalatestTester {
    "AND Gate" in {
        test(new ANDGate) {
            a =>
                val inputs = Seq(
                    Seq(3, 5, 2),
                    Seq(2, 4, 3)
                )
                for (i <- 0 until inputs(0).length) {
                    a.io.in(0).poke(inputs(0)(i).U)
                    a.io.in(1).poke(inputs(1)(i).U)
                    a.clock.step(1)
                }
        }
    }
}

