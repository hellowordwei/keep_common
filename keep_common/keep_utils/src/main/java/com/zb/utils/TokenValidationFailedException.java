package com.zb.utils;

/**
 * Token验证失败异常
 * @author hduser
 *
 */
public class TokenValidationFailedException extends Exception {

	public TokenValidationFailedException(String msg){
		super(msg);
	}
}
