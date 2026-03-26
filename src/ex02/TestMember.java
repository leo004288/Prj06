package ex02;

import java.util.Objects;

class Member {
	
	//field
	int num;
	String name;
	
	//constructor
	//기본생성자
	public Member() {}
	
	//인자있는 생성자
	public Member(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	//method
	void disp() {
		System.out.println(num + " " + name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, num);
	}

//	@Override - annotation -> 컴파일러에게 알려줌
//	Object의 equals()를 재정의
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && num == other.num;
//		return Objects.equals(name, other.name) && num == other.num;
	}

	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + "]";
	}
		
//	//  새로만든 equals() <- Object를 재정의 한게 아님
//	@Override <- 에러
//	boolean equals(Member m3) {
//		boolean result = false;
//		
//		if( this.num == m3.num ) {
//			if( this.name.equals(m3.name) ) {
//				result = true;
//			}
//		}
//		
//		return result;
//	}
	
	
} //

public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.num   = 1;
		m1.name = "단종";
		m1.disp();
		System.out.println(m1);
		System.out.println(m1.toString());
		
		Member m2 = new Member(2, "엄홍도");
		m2.disp();
		System.out.println(m2);
		System.out.println(m2.toString());
		
		System.out.println(m1 == m2);
		
		Member m3 = new Member(1, "단종");
		System.out.println(m1 == m3);
		System.out.println(m3);
		
//		객체를 비교하여 주소가 아니라 내용비교
//		m1.equals(m3) - 주소비교 -> 기능수정해야함
		System.out.println(m1.equals(m3));
		
	}

	
} //
