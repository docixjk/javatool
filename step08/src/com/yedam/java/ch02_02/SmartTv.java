package com.yedam.java.ch02_02;
// RemoteControl, Searchable 를 상속 받고 있다
// 부모의 내용을 자신의 것 처럼 가지고 있음
public interface SmartTv extends RemoteControl, Searchable {
	public void alarm(String time);
}
