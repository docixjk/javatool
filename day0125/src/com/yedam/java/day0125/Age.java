package com.yedam.java.day0125;

import java.util.*;
import java.text.SimpleDateFormat;

public class Age {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sd = new SimpleDateFormat("yyyy");
		Date now = new Date();
		
		String b = sc.nextLine();
		
		int bone2 = Integer.parseInt("19"+b.substring(0,2));

		int year = Integer.parseInt(sd.format(now));
		
		System.out.printf("%s : %d 살",b,year-bone2);
		

	}

}
