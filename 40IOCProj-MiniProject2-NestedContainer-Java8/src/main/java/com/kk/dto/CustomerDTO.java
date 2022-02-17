package com.kk.dto;

import lombok.Data;

@Data
public class CustomerDTO {
	private int cId;
	private String cName;
	private String cAdd;
	private float pAmt;
	private float intrAmt;
}
