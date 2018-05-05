package example

import uk.ltd.prize.holidaytravel.getabed.SearchRequestFactory 

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
  private val searchRequestFactory: SearchRequestFactory = new SearchRequestFactory("hello", "hello", "hello")
}
