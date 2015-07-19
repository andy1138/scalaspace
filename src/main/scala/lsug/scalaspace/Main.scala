
package lsug.scalaspace


import rapture._
// import core._, io._, net._, uri._, json._, codec._

import rapture.io._
import rapture.core._
import rapture.json._
import rapture.uri._
import rapture.net._
import rapture.core.strategy.throwExceptions


import jsonParsers.scalaJson._


object Main extends App {
   implicit val enc = Encodings.`UTF-8`


  def loadPage(offsetPage:Int) = {

    val src = uri"https://api.meetup.com/find/groups?page=1000&radius=global&text=scala&key=2393d8e367439537d751513a6a12&format=json".slurp[Char]

    val json = Json.parse(src).as[List[Json]].filter( _.name.toString.toLowerCase.contains("scala"))

    val names = json.map( l => (l.name, l.link, l.lat, l.lon ) )

    names.map( l => ( s"  [${l._1},${l._2},${l._3},${l._4},true]" ) )
  }

  println("var groups = [")
  val x = loadPage(1)
  println(x.sortBy( l => l.toLowerCase).mkString(",\n"))

  println("];")


  println(s"Count ${x.length}")


}