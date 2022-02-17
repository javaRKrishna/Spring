package com.kk.comp;

public class iVIS implements ICompany {
	private IItems items;
	
	public iVIS(IItems items) {
		this.items = items;
	}

	@Override
	public void production() {
		System.out.println("Production is in process of:: "+items.itemName());
	}

}
