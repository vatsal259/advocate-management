package com.amdocs.exception;

public class InvalidPincodeException extends Exception
{
	private static final long serialVersionUID = 1L;

	public InvalidPincodeException(String message) 
	{
        super(message);
    }
}
