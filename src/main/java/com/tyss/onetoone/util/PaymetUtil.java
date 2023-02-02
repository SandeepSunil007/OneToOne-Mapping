package com.tyss.onetoone.util;

import java.util.HashMap;
import java.util.Map;

import com.tyss.onetoone.Exception.InsufficienAmountException;

public class PaymetUtil {
	private static Map<String, Double> map = new HashMap<>();

	static {
		map.put("accoun1", 8000.00);
		map.put("accoun2", 8000.00);
		map.put("accoun3", 8000.00);
		map.put("accoun4", 8000.00);
		map.put("accoun5", 8000.00);
	}

	public static boolean validateCreditLimit(String accountNo, double paindAmount) {
		if (map.get(accountNo) < paindAmount) {
			throw new InsufficienAmountException("insufficien amount in your account");
		}
		return true;

	}
}
