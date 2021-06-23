package com.bolour.issue.controller

import javax.inject._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success, Try}
import play.api.libs.json._
import play.api.mvc.{Result, _}
import org.slf4j.LoggerFactory

@Singleton
class GameController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {

  private val logger = LoggerFactory.getLogger(this.getClass)

  val serverType = "Scala"

  def handShake: Action[AnyContent] = Action {
    Ok(Json.toJson((serverType, "1.0")))
  }

}

