package com.gyeom.dao;

public class test {
	public static void main(String[] args) {
		String str = "sjfla$$dsklf";
		
		String [] arr = str.split("\\$\\$");
				
		for (String string : arr) {
			System.out.println(string + "$$");
		}
	}
}
