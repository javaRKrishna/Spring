package com.kk.beans;

import java.util.Date;
import java.util.Set;

public class ContactInfo {
	private Set<Long> phoneNumbers;
	private Set<Date> dates;

	public ContactInfo(Set<Long> phoneNumbers, Set<Date> dates) {
		System.out.println(phoneNumbers.getClass());
		this.phoneNumbers = phoneNumbers;
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "ContactsInfo [phoneNumbers=" + phoneNumbers + ", dates=" + dates + "]";
	}
}
