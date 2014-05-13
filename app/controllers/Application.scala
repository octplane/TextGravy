package controllers

import play.api._
import play.api.mvc._

import com.googlecode.flickrjandroid._

object Application extends Controller {

  def index = Action {
  	val key = "12"
  	val secret = "13"

  	//initialize Flickr object with key and rest
    val flickr = new Flickr(key, secret)

    // //initialize SearchParameter object, this object stores the search keyword
    // val searchParams = new SearchParameters();
    // searchParams.setSort(SearchParameters.INTERESTINGNESS_DESC);

    // //Create tag keyword array
    // val tags = Array("Dog","Beagle");
    // searchParams.setTags(tags);

    // //Initialize PhotosInterface object
    // val photosInterface = flickr.getPhotosInterface();
    // //Execute search with entered tags
    // val photoList = photosInterface.search(searchParams,20,1);


    Ok(views.html.index("Your new application is ready. coucou"))
  }

}