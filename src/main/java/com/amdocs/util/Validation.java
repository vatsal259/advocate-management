package com.amdocs.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation 
{
	private static final String PHONE_NUMBER_REGEX = "^[0-9]{10}$";
	private static final String PINCODE_REGEX = "^[0-9]{6}$";
	public boolean isValidPhoneNumber(String phoneNumber)
	{
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
	public boolean validatePincode(String pincode)
	{
        Pattern pattern = Pattern.compile(PINCODE_REGEX);
        Matcher matcher = pattern.matcher(pincode);
        return matcher.matches();

    }
}
