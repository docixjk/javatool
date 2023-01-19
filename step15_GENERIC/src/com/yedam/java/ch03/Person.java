package com.yedam.java.ch03;

public class Person {

}

//Person이라는 부모 클래스를 상속 받음
class Worker extends Person {
}

class Student extends Person {
}

//Student 클래스를 상속 받음
class HighStudent extends Student {
}

class MiddleStudent extends Student {
}

//시작점을 지정가능, 시작끝도 지정가능
//super는 부모 클래스만 ?
//extends 는 뒤에 선언한 것보다 자식 클래스만 들어올 수 있다.