package and_gate

import chisel3._


class ANDGateIO extends Bundle {
    val in = Input(Vec(2, UInt(32.W)))
    val out = Output(UInt(32.W))
}


class ANDGate extends Module {
    val io = IO(new ANDGateIO)

    io.out := io.in(0) & io.in(1)
}

