package com.notforpoints.scout

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class ScoutSpec extends WordSpec with ShouldMatchers {

  "An uninformed Scout" should {
    val scout = new com.notforpoints.scout.Scout
    "pick same word when given only one word" in {
	println(scout.pickMostPopular("foo"))
      scout.pickMostPopular("foo") should be === "foo" 
    }
  }
}
