package com.application.controller;

import com.application.model.CurrencyModel;
import com.application.view.CurrencyView;

public class CurrencyController {
	
	// variables
	private CurrencyModel model;
	private CurrencyView view;
	
	public CurrencyController() {
		this.model = new CurrencyModel();
		this.view = new CurrencyView(this);
	}
	
	// 
	public void convert(String toConvertTo, String value) {
		
		double currency = (double) Double.parseDouble(value);
		
		String result = "";
		
		if (toConvertTo.equalsIgnoreCase("JMD")) {
			result = String.valueOf(model.convertJMDToUSD(currency));
		}
		if (toConvertTo.equalsIgnoreCase("USD")) {
			result = String.valueOf(model.convertUSDToJMD(currency));
		}
		
		view.updateResult (result);
	}

	public static void main(String[] args) {
		// 23
		new CurrencyController();

	}

}
