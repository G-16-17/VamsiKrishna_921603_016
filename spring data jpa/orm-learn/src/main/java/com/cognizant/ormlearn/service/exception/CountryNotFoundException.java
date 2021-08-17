package com.cognizant.ormlearn.service.exception;

@SuppressWarnings("serial")
public class CountryNotFoundException extends Exception{
	public CountryNotFoundException(String msg) {
		super(msg);
	}

}
