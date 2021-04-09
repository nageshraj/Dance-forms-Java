package com.wolken.wolkenapp.game;

public class DanceFormsDTO {

	private String style;
	private int noOfPerformers;
	private String origin;

	public DanceFormsDTO() {

	}

	// setter
	public void setStyle(String style) {
		this.style = style;

	}

	public void setNoOfPlayers(int noOfPerformers) {
		this.noOfPerformers = noOfPerformers;

	}

	public void setOrigin(String origin) {
		this.origin = origin;

	}

	// Getters

	public int getNoOfPerformers() {
		return noOfPerformers;
	}

	public void setNoOfPerformers(int noOfPerformers) {
		this.noOfPerformers = noOfPerformers;
	}

	public String getStyle() {
		return style;
	}

	public String getOrigin() {
		return origin;
	}
}
