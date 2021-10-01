import org.scalatest.FunSuite

class BusDriversTest extends FunSuite {

  /*
  Bus drivers like to gossip, everyone knows that.
  And bus drivers can gossip when they end up at the same stop.
  So now we are going to calculate after how many stops all the bus drivers know all the gossips.
  You will be given a number of bus routes that the drivers follow. Each driver starts with one gossip.
  Each route is appointed to 1 driver. When 2 or more drivers are at the same stop (even if it is the start),
   they can exchange all the gossips they know. A route looks like this: 1 2 3 4 and is repeated over the whole day
   like this 1 2 3 4 1 2 3 4 1 2 3 … If a driver starts and stops at the same stop then that is also repeated.
   All drivers take 1 minute to go from one stop to another and the gossip exchange happens instantly.
   All drivers drive 8 hours a day so you have a maximum of 480 minutes to get all the gossiping around.


   Example 1:
3 1 2 3
3 2 3 1
4 2 3 4 5
Example 1: 5


2 1 2
5 2 8
never

1
1

1 2
3 2

1 2 3
3 2 4

1 2
3 4 1

3 4 1
1 2

1 2 5
1 3 5
4 2

   */



  test("BusDrivers.calculateStops") {
    assert(BusDrivers.calculateStops(Seq(Seq(1), Seq(1))) === 1)
    assert(BusDrivers.calculateStops(Seq(Seq(1, 2), Seq(3, 2))) === 2)
    assert(BusDrivers.calculateStops(Seq(Seq(1, 2, 3), Seq(3, 2, 4))) === 2)
    assert(BusDrivers.calculateStops(Seq(Seq(1, 2), Seq(3, 4, 1))) === 3)
    assert(BusDrivers.calculateStops(Seq(Seq(3, 4, 1), Seq(1, 2))) === 3)
    assert(BusDrivers.calculateStops(Seq(Seq(1, 2, 5), Seq(1, 3, 5), Seq(4, 2))) === 3)
    assert(BusDrivers.calculateStops(Seq(Seq(1, 2), Seq(1, 3), Seq(4, 2))) === 0) // never
  }

}
