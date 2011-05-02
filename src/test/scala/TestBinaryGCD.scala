package tarikjabri.binarygcd.test

import org.specs._

import tarikjabri.binarygcd.BinaryGCD._

class TestBinaryGCD extends Specification {
  // Testing identity 1
  "GCD of 0 and 0 is 0" in {
    binaryGCD(0, 0) must_== 0
  }
  "GCD of 5 and 0 is 5" in {
    binaryGCD(5, 0) must_== 5
  }
  "GCD of 5 and 5 is 5" in {
    binaryGCD(5, 5) must_== 5
  }
  // Testing identity 2
  "GCD of 4 and 2 is 2" in {
    binaryGCD(4, 2) must_== 2
  }
  // Testing identity 3: u even, v odd
  "GCD of 10 and 5 is 5" in {
    binaryGCD(10, 5) must_== 5
  }
  // Testing identity 3: u odd, v even
  "GCD of 81 and 6 is 3" in {
    binaryGCD(81, 6) must_== 3
  }
  // Testing identity 4: both u and v odd
  "GCD of 33 and 3 is 3" in {
    binaryGCD(33, 3) must_== 3
  }
  "GCD of 11 and 33 is 11" in {
    binaryGCD(11, 33) must_== 11
  }
}