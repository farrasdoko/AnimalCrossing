package com.idn.farras.animalcrossing.Main.Model;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class AmiiboItem{

	@SerializedName("head")
	private String head;

	@SerializedName("image")
	private String image;

	@SerializedName("character")
	private String character;

	@SerializedName("release")
	private Release release;

	@SerializedName("tail")
	private String tail;

	@SerializedName("name")
	private String name;

	@SerializedName("type")
	private String type;

	@SerializedName("amiiboSeries")
	private String amiiboSeries;

	@SerializedName("gameSeries")
	private String gameSeries;

	public void setHead(String head){
		this.head = head;
	}

	public String getHead(){
		return head;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setCharacter(String character){
		this.character = character;
	}

	public String getCharacter(){
		return character;
	}

	public void setRelease(Release release){
		this.release = release;
	}

	public Release getRelease(){
		return release;
	}

	public void setTail(String tail){
		this.tail = tail;
	}

	public String getTail(){
		return tail;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setAmiiboSeries(String amiiboSeries){
		this.amiiboSeries = amiiboSeries;
	}

	public String getAmiiboSeries(){
		return amiiboSeries;
	}

	public void setGameSeries(String gameSeries){
		this.gameSeries = gameSeries;
	}

	public String getGameSeries(){
		return gameSeries;
	}

	@Override
 	public String toString(){
		return 
			"AmiiboItem{" + 
			"head = '" + head + '\'' + 
			",image = '" + image + '\'' + 
			",character = '" + character + '\'' + 
			",release = '" + release + '\'' + 
			",tail = '" + tail + '\'' + 
			",name = '" + name + '\'' + 
			",type = '" + type + '\'' + 
			",amiiboSeries = '" + amiiboSeries + '\'' + 
			",gameSeries = '" + gameSeries + '\'' + 
			"}";
		}
}