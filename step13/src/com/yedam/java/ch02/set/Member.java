package com.yedam.java.ch02.set;

public class Member {
	public int id;
	public String name;

	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// name은 스트링이니까 해시코드값만 빼감
		return id + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return (id == member.id) && (name.equals(member.name));
		}
		return false;
	}

}
