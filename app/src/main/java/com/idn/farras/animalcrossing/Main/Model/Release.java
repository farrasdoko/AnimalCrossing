package com.idn.farras.animalcrossing.Main.Model;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class Release{

	@SerializedName("eu")
	private String eu;

	@SerializedName("na")
	private String na;

	@SerializedName("au")
	private String au;

	@SerializedName("jp")
	private String jp;

	public void setEu(String eu){
		this.eu = eu;
	}

	public String getEu(){
		return eu;
	}

	public void setNa(String na){
		this.na = na;
	}

	public String getNa(){
		return na;
	}

	public void setAu(String au){
		this.au = au;
	}

	public String getAu(){
		return au;
	}

	public void setJp(String jp){
		this.jp = jp;
	}

	public String getJp(){
		return jp;
	}

	@Override
 	public String toString(){
		return 
			"Release{" + 
			"eu = '" + eu + '\'' + 
			",na = '" + na + '\'' + 
			",au = '" + au + '\'' + 
			",jp = '" + jp + '\'' + 
			"}";
		}
}