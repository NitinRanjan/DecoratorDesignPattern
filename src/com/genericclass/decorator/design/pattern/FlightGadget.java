package com.genericclass.decorator.design.pattern;

public class FlightGadget extends GadgetDecorator {

	public FlightGadget(Gadget nextGadget) {
		super(nextGadget);
	}
	

	@Override
	public void showGadget() {
		super.showGadget();	
		System.out.println("	Flying Gadget...");
	}

}
