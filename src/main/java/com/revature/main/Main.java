package com.revature.main;
import com.revature.controllers.MenuInterface;

public class Main {
	
	public static void main (String[] args) {
		System.out.print("----------------------------Welcome to the employee database system!----------------------------");
		
		// Creating a new menuInterface option for user to make a selection
		MenuInterface menuInterface = new MenuInterface();
		menuInterface.MenuSelect();
	}

}
