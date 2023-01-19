package com.yedam.java.ch01;

public class CalculatorExp {

	public static void main(String[] args) {
		
		//기존
		Calculator cal = new Calculator() {

			@Override
			public double plus(double x, double y) {

				return x + y;
			}

		};
		
		//람다식 - 코드가 간결해짐 ( 불필요한 코드를 줄임 )
		Calculator ramda = (x, y) -> x + y;
		
		//값과 타입이 같다
		System.out.println("cal : " + cal.plus(10.5, 15.8));
		System.out.println("ramda : " + ramda.plus(10.5, 15.8));
	}

}
