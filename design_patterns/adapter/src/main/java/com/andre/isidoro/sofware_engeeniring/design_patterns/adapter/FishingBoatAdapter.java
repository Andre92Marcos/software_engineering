package com.andre.isidoro.sofware_engeeniring.design_patterns.adapter;

public class FishingBoatAdapter implements RowingBoat{
	private FishingBoat fishingBoat;

	public FishingBoatAdapter(FishingBoat fishingBoat) {
		super();
		this.fishingBoat = fishingBoat;
	}

	public void row() {
		fishingBoat.sail();
	}
	
	
}
