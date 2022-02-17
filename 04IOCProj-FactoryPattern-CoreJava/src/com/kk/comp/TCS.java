package com.kk.comp;

public class TCS implements ICompany {
	private IItems items;
	
	public TCS(IItems items) {
		this.items = items;
	}

	@Override
	public void production() {
		System.out.println("Production is in pocess of:: "+items.itemName());
	}

}
