package controllers

import play.api._
import play.api.mvc._

import com.googlecode.flickrjandroid._
import com.googlecode.flickrjandroid.photos._


object Application extends Controller {

  def index = Action {
    // You apps https://www.flickr.com/services/apps/by/oct
  	val key = Play.current.configuration.getString("flickr.api_key").getOrElse("")
  	val secret = Play.current.configuration.getString("flickr.secret").getOrElse("")

  	//initialize Flickr object with key and rest
    val flickr = new Flickr(key, secret)
    Flickr.tracing = true

    // //initialize SearchParameter object, this object stores the search keyword
    val searchParams = new SearchParameters();
    searchParams.setSort(SearchParameters.INTERESTINGNESS_DESC);

    //Create tag keyword array
    val tags = Array("Dog","Beagle");
    searchParams.setTags(tags);

    //Initialize PhotosInterface object
    val photosInterface = flickr.getPhotosInterface();
    //Execute search with entered tags
    val photoList = photosInterface.search(searchParams,20,1);


    Ok(views.html.index("Your new application is ready. coucou"))
  }

}