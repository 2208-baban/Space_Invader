package com.game.assets;

public class Avatar {
	String NAME;
	Integer WIDTH,HEIGHT,DAMAGE,LIFE;
	
	public Avatar(Integer WIDTH,Integer HEIGHT,Integer DAMAGE,String NAME){
		this.DAMAGE=DAMAGE;
		this.HEIGHT=HEIGHT;
		this.NAME=NAME;
		this.WIDTH=WIDTH;
		this.LIFE=100;
	}
	public Avatar(Integer WIDTH,Integer HEIGHT,String NAME){
		this.HEIGHT=HEIGHT;
		this.NAME=NAME;
		this.WIDTH=WIDTH;
		this.LIFE=100;
	}
	
	void display(){
		System.out.println(NAME);
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public Integer getWIDTH() {
		return WIDTH;
	}
	public void setWIDTH(Integer wIDTH) {
		WIDTH = wIDTH;
	}
	public Integer getHEIGHT() {
		return HEIGHT;
	}
	public void setHEIGHT(Integer hEIGHT) {
		HEIGHT = hEIGHT;
	}
	public Integer getDAMAGE() {
		return DAMAGE;
	}
	public void setDAMAGE(Integer dAMAGE) {
		DAMAGE = dAMAGE;
	}
	
}
