package com.application.model;

public class CurrencyModel {

	// convertJMDToUSD method
	public double convertJMDToUSD(double jmd) {
		return jmd * 0.0068;
	}
	
	// convertJMDToUSD method
	public double convertUSDToJMD(double usd) {			
		return usd * 152.6;
	}

}
