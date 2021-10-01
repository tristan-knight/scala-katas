
case class Driver(route: Seq[Int], var gossip: Set[Gossip], id: Int)

case class Gossip(id: Int)

object BusDrivers {

  private def fillup(route: Seq[Int], maxLength: Int): Seq[Int] = {
    var filledRoute = route
    while (filledRoute.length < maxLength) {
      filledRoute ++= route
    }
    filledRoute.slice(0, maxLength+1)
  }

  private def getNumberOfStops(drivers: Seq[Driver]): Int = {
    // for loop execution with a range
    for(stop <- drivers.head.route.indices){
      chatDuringStop(drivers, stop)
      if (drivers.map(driver => driver.gossip).takeWhile(gossip => gossip.size == drivers.size).size == drivers.size)
        return stop + 1
      }
    0
    }

  private def chatDuringStop(drivers: Seq[Driver], stop: Int) = {
    drivers.foreach(firstDriver => chatWithDriversAtMyStop(drivers, stop, firstDriver))
  }

  private def chatWithDriversAtMyStop(drivers: Seq[Driver], stop: Int, firstDriver: Driver) = {
    drivers.foreach(nextDriver =>
      if (sameStop(stop, firstDriver, nextDriver)) {
          chat(firstDriver, nextDriver)
      })
  }

  private def sameStop(stop: Int, firstDriver: Driver, nextDriver: Driver) = {
    firstDriver.route(stop) == nextDriver.route(stop)
  }

  private def chat(firstDriver: Driver, nextDriver: Driver) = {
    firstDriver.gossip = firstDriver.gossip ++ nextDriver.gossip
    nextDriver.gossip = firstDriver.gossip
  }

  def calculateStops(routes: Seq[Seq[Int]]): Int = {
    val newRoutes = routes.map(route => fillup(route, routes.map(route => route.length).max))
    var id = 0
    val drivers = newRoutes.map(route => {
      val driver = Driver(route, Set(Gossip(id)), id)
      id += 1
      driver
    })
    getNumberOfStops(drivers)
  }

}
