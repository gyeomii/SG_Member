package com.cal.servlet;

import java.util.Iterator;
import java.util.Scanner;

import com.cal.service.Operator;
import com.cal.service.OperatorImpl;

public class TestCalculator {

	public static void main(String[] args) {
		String msg = "2,3,4,";
		String[] arr = msg.split(",");
		for (String string : arr) {
			System.out.println(string + ",");
		}
	}
}