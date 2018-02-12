class ChecksumAccumulator{
  private var sum = 0
  def add(b: Byte): Unit = { sum += b}
  def checksum(): Int = ~(sum & 0xFF) + 1
}

val csa = new ChecksumAccumulator
csa.checksum()

csa.add(10)

csa.checksum()

1 & 2

10 & 0xFF

~(10 & 0xFF)



1 +
2 +
3

1 *
2 *
3


