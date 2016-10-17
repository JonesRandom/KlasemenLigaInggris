package com.JonesRandom.KlasemenLigaInggirs.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponJSON{
	@SerializedName("kompetisi")
	@Expose
	private String kompetisi;
	@SerializedName("klasemen")
	@Expose
	private List<KlasemenItem> klasemen;
	@SerializedName("status")
	@Expose
	private String status;

	public String getKompetisi(){
		return kompetisi; 
	}

	public void setStatus(String status){
		this.status = status; 
	}

	public void setKlasemen(List<KlasemenItem> klasemen){
		this.klasemen = klasemen; 
	}

	public void setKompetisi(String kompetisi){
		this.kompetisi = kompetisi; 
	}

	public List<KlasemenItem> getKlasemen(){
		return klasemen; 
	}

	public String getStatus(){
		return status; 
	}

}