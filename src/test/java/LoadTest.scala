import io.gatling.core.Predef._
import io.gatling.http.Predef.http
import Simulation._

class LoadTest extends Simulation {

  val httpConf = http.baseUrl("https://marstech.tb.ru/")

  setUp {
    getOrdersScen.inject(
      constantUsersPerSec(1) during 1
    ).protocols(httpConf)
  }
}
