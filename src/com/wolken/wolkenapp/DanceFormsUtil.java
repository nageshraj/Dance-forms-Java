package com.wolken.wolkenapp;

import com.wolken.wolkenapp.game.DanceFormsDTO;

public class DanceFormsUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DanceFormsDTO dance = new DanceFormsDTO();
		dance.setNoOfPerformers(5);
		dance.setOrigin("india");
		dance.setStyle("Kathak");
		// DanceForms dance1 = new DanceForms("abc",5);
		// DanceForms dance2 = new DanceForms("ghi",6);
		// DanceForms dance3 = new DanceForms("mno",7);

		// dance.noOfPerformers=4;
		// dance.origin="brazil";
		// dance.style="hiphop";

		System.out.println(dance.getNoOfPerformers() + " " + dance.getOrigin() + " " + dance.getStyle());
		// System.out.println(dance1.noOfPerformers +" "+dance1.origin+" "+
		// dance1.style);
		// System.out.println(dance2.noOfPerformers +" "+dance2.origin+" "+
		// dance2.style);
		// System.out.println(dance3.noOfPerformers +" "+dance3.origin+" "+
		// dance3.style);

	}

}
