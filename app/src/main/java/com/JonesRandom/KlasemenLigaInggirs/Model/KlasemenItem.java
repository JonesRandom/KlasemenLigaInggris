package com.JonesRandom.KlasemenLigaInggirs.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KlasemenItem{
	@SerializedName("poin")
	@Expose
	private String poin;
	@SerializedName("menang")
	@Expose
	private String menang;
	@SerializedName("main")
	@Expose
	private String main;
	@SerializedName("posisi")
	@Expose
	private int posisi;
	@SerializedName("klub")
	@Expose
	private String klub;
	@SerializedName("seri")
	@Expose
	private String seri;
	@SerializedName("kalah")
	@Expose
	private String kalah;

	public void setMenang(String menang){
		this.menang = menang; 
	}

	public int getPosisi(){
		return posisi; 
	}

	public void setSeri(String seri){
		this.seri = seri; 
	}

	public String getKalah(){
		return kalah; 
	}

	public String getMain(){
		return main; 
	}

	public void setMain(String main){
		this.main = main; 
	}

	public String getMenang(){
		return menang; 
	}

	public String getSeri(){
		return seri; 
	}

	public void setKalah(String kalah){
		this.kalah = kalah; 
	}

	public void setPoin(String poin){
		this.poin = poin; 
	}

	public void setPosisi(int posisi){
		this.posisi = posisi; 
	}

	public String getKlub(){
		return klub; 
	}

	public void setKlub(String klub){
		this.klub = klub; 
	}

	public String getPoin(){
		return poin; 
	}

}