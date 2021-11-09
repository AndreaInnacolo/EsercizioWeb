package com.company.EsercizioWeb.model;

public class ErrorResponse implements Response
{
	
	private final int id;
	private final String message;
	
	public ErrorResponse(int id, String message) 
	{
		this.id = id;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public boolean isError() 
	{
		return true;
	}

	@Override
	public String toString() {
		return "ErrorResponse [id=" + id + ", message=" + message + ", getMessage()=" + getMessage() + ", getId()="
				+ getId() + ", isError()=" + true + "]";
	}

}//end
