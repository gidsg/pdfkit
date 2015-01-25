package controllers

import play.api.mvc._

object Application extends Controller {




  def form = Action {
    Ok(views.html.form("Gids"))
  }

}