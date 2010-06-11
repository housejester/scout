package com.notforpoints.scout

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class ScoutSpec extends WordSpec with ShouldMatchers {

  "An uninformed Scout" when {
    val scout = new com.notforpoints.scout.Scout
    "given only one word" should {
      "pick first word" in {
        scout.pickMostPopular("foo") should be === "foo" 
      }
    }
    "given 2 same-sized words" should {
      "pick first word" in {
        scout.pickMostPopular("foo", "bar") should be === "foo"
      }
    }
    "given multiple same-sized words" should {
      "pick first word" in {
          scout.pickMostPopular("foo", "bar", "baz") should be === "foo"
      }
    }
    "give multiple diff-sized words" should {
      "pick shortest word when shortest is first" in {
        scout.pickMostPopular("foo", "bars", "bazz") should be === "foo"
      }
      "pick shortest word when shortest is not first" in {
        scout.pickMostPopular("bars", "foo", "bazz") should be === "foo"
      }
    }
  } 
}
