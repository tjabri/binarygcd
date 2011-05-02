package tarikjabri.binarygcd

object BinaryGCD {

  def main(args: Array[String]): Unit = {
    if (args.length != 2) printUsageAndExit()
    else {
      try {
        val u = args(0).toLong
        val v = args(1).toLong
        println("GCD: " + binaryGCD(u, v))
      } catch {
        case ne: NumberFormatException => printUsageAndExit()
      }
    }
  }

  def binaryGCD(u: Long, v: Long): Long = {
    // convert to absolute values in order to deal with negative numbers
    val uAbs = math.abs(u)
    val vAbs = math.abs(v)

    // identity 1: gcd(0,v) = v OR gcd(u,0) = u OR gcd(0,0) = 0
    if (uAbs == vAbs || uAbs == 0 || vAbs == 0) return uAbs|vAbs

    if (uAbs % 2 == 0) {
      // u is even
        if (vAbs % 2 == 0)
          // identity 2: u AND v even
          return 2 * binaryGCD(uAbs / 2, vAbs / 2)
        else
          // identity 3: u is even AND v is odd
          return binaryGCD(uAbs / 2, vAbs)
    } else if (vAbs % 2 == 0) {
        // identity 3: u is odd AND v is even
        return binaryGCD(uAbs, vAbs / 2)
    } else {
      // u AND v are odd
      if (uAbs >= vAbs) return binaryGCD((uAbs - vAbs) / 2, vAbs)
      else              return binaryGCD((vAbs - uAbs) / 2, uAbs)
    }
  }

  def printUsageAndExit() = {
    println("usage: BinaryGCD int1 int2\n\n\tPlease supply 2 integer values")
    System.exit(5)
  }
}
