package com.notforpoints.scout

class Scout {
  def pickMostPopular(words:String*) : String = {
    words.toList.reduceLeft((w1,w2) =>              
      if (w2.length < w1.length) w2
      else w1
    )
  }
}
