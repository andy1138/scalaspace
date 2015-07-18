
package lsug.scalaspace


import rapture._
import core._, io._, net._, uri._, json._, codec._

import rapture.json.jsonBackends.json._


// Read a file into a string
import encodings.`UTF-8`

// Parse it as Json
//import jsonBackends.jackson._



object Main extends App {
  println("Hello")

  val src = uri"https://api.meetup.com/find/groups?page=20&text=scala&key=2393d8e367439537d751513a6a12&sign=true&format=json".slurp[Char]

  val json = Json.parse(src)
  println(json)

  // Auto-extract a `Group` into a case class structure
//  case class Member(name: String, born: Int)
//  case class Group(groupName: String, members: Set[Member])
//  json.groups(0).as[Group]

}