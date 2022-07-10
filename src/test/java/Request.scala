import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Request {

  def getOrders = {
    exec{
      http("getOrders")
        .get("#services")
        .check(status.is(200))
    }
  }
}
