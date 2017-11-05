package com.lottery.utils;

import java.util.Collection;

public class CheckUtils {

	
	public static boolean isEmpty(Object src) {
		if(src == null ) {
			return true;
		}
		
		if( src instanceof String ) {
			if("".equals(((String) src).trim())) {
				return true;
			}
		}
		
		if( src instanceof Collection ) {
			Collection o = (Collection)src;
			if(o.size() < 1) {
				return true;
			}
		}
		return false;
	}
}
