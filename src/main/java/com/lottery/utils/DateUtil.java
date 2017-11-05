package com.lottery.utils;

import java.util.Date;

public class DateUtil {

	public static Date getExpireTime(Date current) {
		long validPeriodTime = 1*3600 * 1000 * 30;//30天有效期
		Date expireTime = new Date(current.getTime() + validPeriodTime);
		return expireTime;
	}
}
