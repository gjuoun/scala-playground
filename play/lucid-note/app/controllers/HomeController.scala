package controllers

import akka.util.ByteString
import javax.inject._
import play.api.http.HttpEntity
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def echo() = Action { request =>
    Ok("Hello world")
  }

  def anotherAction = Action { (request) =>
    Ok(s"Got $request")
  }

  def implicitRequest() = Action { implicit request =>
    anotherMethod("Some para value")
    Ok("Got request [" + request + "]")
  }

  def anotherMethod(p: String)(implicit request: Request[_]) = {
    // get implicit Request from previous Action
  }

  def withBodyParser() = Action(parse.json) { implicit request =>
    Ok("Got request [" + request + "]")
  }

  def simpleResult() = Action {
    Result(
      header = ResponseHeader(200, Map.empty),
      body = HttpEntity.Strict(ByteString("Hello world"), Some("text/plain"))
    )
  }

  def redirect() = Action {
    Redirect("/user/home")
  }

  def redirectStatus() = Action({
     Redirect("/user/home", MOVED_PERMANENTLY)
  })

}
