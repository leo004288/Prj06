package ex03;

class Member {
//	field
	int    id;
	String name;
	String email;
	
//	constructor
	public Member() {}
	
	public Member(String msg) {
		System.out.println("객체 생성1");
	}
	
	public Member(int id, String name, String email) {
		this("msg");  //기본 생성자 Member() 호출함 / this - 자신
//		super();   부모클래스 기본생성자 호출         - 부모클래스
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	// override method
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	
} //

public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.id    = 1;
		m1.name  = "박찬호";
		m1.email = "pack@lotte.com";
		System.out.println(m1);
		
		Member m2 = new Member(2,"강호동","kang@busan.com");
		System.out.println(m2);

	}

	
} //
