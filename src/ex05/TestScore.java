package ex05;

 /*
num, name,kor, eng, mat
번호,이름,국어,영어,수학
1,사나,70,80,90
2,모모,0,70,100
3,쯔위,70,90,90
4,정연,80,90,70
5,원영,90,90,89
6,유진,100,100,100
*/

//입력:번호,이름,국어,영어,수학
//출력:번호 이름 국어 영어 수학 총점 평균 등급
//     num  name kor  eng  mat  tot  avg  grade
//모든 field는 private
//생성자 getter/setter, toString() 만들어서 작업

class Score { 
//	field
	private int    id;
	private String name;
	private int    kor;
	private int    eng;
	private int    mat;
	
	private int       tot;
	private double    avg;
	private String    grade;

//	constructor
	public Score () {}
	
	public Score(int id, String name, int kor, int eng, int mat) {
		this.id   = id;
		this.name = name;
		this.kor  = kor;
		this.eng  = eng;
		this.mat  = mat;
		
		gettot();
		getavg();
		getgrade();
		
    //		this.tot = colcTot();
	}
	
//	method
    //	private int calcTot {
    //		return kor + eng + mat
    //	}
	private void gettot() {
		this.tot = this.kor + this.eng + this.mat;
	}

	private void getavg() {
		this.avg = (this.kor + this.eng + this.mat) / 3.0;
		
	}

	private void getgrade() {
		int val = (int) (this.avg / 10);
		switch (val) {
		case 10:
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default: grade = "F"; break;
		}	
	}
	
//
	@Override
	public String toString() {
		return String.format("Score [id=%d, name=%s, kor=%d, eng=%d, mat=%d, tot=%d, avg=%.2f, grade=%s]",
				                         id, name, kor, eng, mat, tot, avg, grade);
	}
	
//	
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

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

//	public void setTot(int tot) {
//		this.tot = tot;
//	}

	public double getAvg() {
		return avg;
	}

//	public void setAvg(double avg) {
//		this.avg = avg;
//	}

	public String getGrade() {
		return grade;
	}

//	public void setGrade(String grade) {
//		this.grade = grade;
//	}

	public void calc() {            //
		this.tot = getTot();
		this.avg = getAvg();
		this.grade = getGrade();
	}
		
	public static void title() {
		String tittle = "번호 이름 국어 영어 수학 총점 평균 등급";
		System.out.println(tittle);		
	}
	
	public void disp() {
		String fmt	  = "%s    %s   %d   %d   %d  %d  %.2f  %c\n";
		System.out.printf(fmt, id, name, kor, eng, mat, tot, avg, grade);
		
	}
	
} //

public class TestScore {

	public static void main(String[] args) {
		
		Score m1 = new Score(1,"사나",70,80,90);
		System.out.println(m1);
		System.out.println("번호:" + m1.getId());
		System.out.println("이름:" + m1.getName());
		System.out.println("평균:" + m1.getAvg());
		System.out.println("등급:" + m1.getGrade());
		
		Score m2 = new Score();
		m2.setId(2);
		m2.setName("모모");
		m2.setKor(0);
		m2.setEng(70);
		m2.setMat(100);
		m2.calc();                  //
		System.out.println(m2);
		m2.title();
		m2.disp();
		
		Score m3 = new Score(3,"쯔위",70,90,90);
		System.out.println(m3);
		
		Score m4 = new Score(4,"정연",80,90,70);
		System.out.println(m4);
		
		
	}

	
} //
