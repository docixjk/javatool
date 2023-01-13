package com.yedam.Class4;

import com.yedam.Class3.A;

public class C {
	//필드
	
		A a = new A(true);
		//public 만 다른 패키지 내에서 사용 가능
		A b = new A(1);
		//다른 패키지라서 default를 사용 불가
		A c = new A("다나카");
		//오류가 뜨는 이유는 private 는 해당 클래스내에서만 사용이 가능하니까
}
