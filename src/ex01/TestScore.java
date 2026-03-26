package ex01;
/*
num,name,kor,eng,mat
번호,이름,국어,영어,수학
1,사나,70,80,90
2,모모,0,70,100
3,쯔위,70,90,90
4,정연,80,90,70
5,원영,90,90,89
6,유진,100,100,100
*/

class Score {
//입력:번호,이름,국어,영어,수학
//	   num, name, kor, eng, mat
//출력:번호 이름 국어 영어 수학 총점 평균 등급
//	   num, name, kor, eng, mat, tot, avg, grage
	//Field
	 //입력
	int    num;
	String name;
	int    kor;
	int    eng;
	int    mat;
	 //출력
	int    tot;
	double avg;
	char   grade;
	
	//constructor
	public Score(int num, String name, int kor, int eng, int mat) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		//계산
		gettot();
		getavg();
		getgrade();
	}
	
	private void gettot() {
		this.tot = this.kor + this.eng + this.mat;
	}
	
	private void getavg() {
		this.avg = (this.kor + this.eng + this.mat) / 3.0;
		
	}
	
	private void getgrade() {
//		this.grade = ' ';
//		if (0 <= this.avg && this.avg < 59.99) {
//			this.grade = 'F';
//		} else {
//			if (60 <= this.avg && this.avg < 69.99) {
//				this.grade = 'D';
//			} else {
//				if (70 <= this.avg && this.avg < 79.99) {
//					this.grade = 'C';
//				} else {
//					if (80 <= this.avg && this.avg < 89.99) {
//						this.grade = 'B';
//					} else {
//						if (90 <= this.avg && this.avg <= 100) {
//							this.grade = 'A';
//						}
//					}
//				}
//			}
//		}
		int v = (int) this.avg/10;
		switch(v) {
		case 10 :
		case 9  :this.grade = 'A'; break;
		case 8  :this.grade = 'B'; break;
		case 7  :this.grade = 'C'; break;
		case 6  :this.grade = 'D'; break;
		default :this.grade = 'F'; break;
		}
		
	}



	static void tittle() {
		String tittle = "번호 이름 국어 영어 수학 총점 평균 등급";
		System.out.println(tittle);		
	}
	
	//method
	void disp() {
		String fmt	  = "%s    %s   %d   %d   %d  %d  %.2f  %c\n";
		System.out.printf(fmt, num, name, kor, eng, mat, tot, avg, grade);
		
	}


	
}

public class TestScore {

	public static void main(String[] args) {
		
		Score.tittle();
//		Score sc1 = new Score(); //기본생성자 없고 다른 생성자만 존재하면 에러
		Score sc1 = new Score(1,"사나",70,80,90);
		sc1.disp();
		
		Score sc2 = new Score(2,"모모",0,70,100);
		sc2.disp();
		
		Score sc3 = new Score(3,"쯔위",70,90,90);
		sc3.disp();
		
		Score sc4 = new Score(4,"정연",80,90,70);
		sc4.disp();
		
		Score sc5 = new Score(5,"원영",90,90,89);
		sc5.disp();
		
		Score sc6 = new Score(6,"유진",100,100,100);
		sc6.disp();
		
	}

}
