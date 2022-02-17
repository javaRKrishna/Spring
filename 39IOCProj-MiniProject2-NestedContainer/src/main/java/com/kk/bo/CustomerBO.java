package com.kk.bo;

import lombok.Data;

@Data
public class CustomerBO {
	private int cId;
	private String cName;
	private String cAdd;
	private float pAmt;
	private float intrAmt;
}
