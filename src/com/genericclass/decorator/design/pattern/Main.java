package com.genericclass.decorator.design.pattern;

public class Main {

	public static void main(String[] args) {
		IronMan ironMan = new IronMan();
		ironMan.addNewGadget("Unibeam Chest Projector");
		ironMan.addNewGadget("Flight");
		ironMan.showGadget();
	}

}
