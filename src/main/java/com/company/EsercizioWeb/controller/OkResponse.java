package com.company.EsercizioWeb.controller;

import com.company.EsercizioWeb.model.Response;

public class OkResponse implements Response
{
		
	@Override
	public boolean isError() 
	{
		return false;
	}
 
	@Override
	public String toString() {
		return "OkResponse [isError()=" + false + "\nTutto apposto" + "]";
	}
	
}
