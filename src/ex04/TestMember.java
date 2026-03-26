package ex04;

class Member{
	
//	field : package level 변수 : 같은 폴더에서 변수공유
//	acess modifier(public, private, protected, package)를 안붙이면 package level 이다
//  field는 private
	private int    id;
	private String name;
	private String email;
	
//	constructor
	public Member() {}
	public Member(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
//	toString / method
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
//	setter 함수: 외부클래스에서 내부 Field에 값을 넣는 방법 --------------------
//	public void setId(int id) {
//		this.id = id;	
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setEmail(String email) {
//		this.email = email;
//	}
	
//	getter -------------------------------------------------------------
//	public String getname() {
//		// TODO Auto-generated method stub
//		return this.name;
//	}
//	public int getId() {
//		return id;
//	}
//	public String getName() {
//		return name;
//	}
//	public String getEmail() {
//		return email;
//	}
	
//	getter/setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
} //

public class TestMember {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.setId(1);
		m1.setName("박찬호");
		m1.setEmail("pack@lotte.com");
		System.out.println(m1);
		String name1 = m1.getName();
		System.out.println("m1의 이름:" + name1);
		
		Member m2 = new Member(2,"강호동","kang@busan.com");
//		System.out.println(m2);
		m2.setEmail("kang@samsung.com"); 
//		m2.email = "kang@samsung.com"; 
		System.out.println(m2);
		System.out.println("m2의 Id:" + m2.getId());
		System.out.println("m2의 Name:" + m2.getName());
		System.out.println("m2의 Email:" + m2.getEmail());

	}

	
} //
