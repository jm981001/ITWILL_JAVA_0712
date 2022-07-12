package while_;

public class Test2 {//while문
	public static void main(String[] args) {

		int dan = 2;
		while(dan <10) {
			
			System.out.println("< " + dan + "단 >");
			
			int i = 1; //여기서 i를 선언해야 리셋되고 다시 시작
			while (i < 10) {
				System.out.println(dan + " * " + i + " = " +  (dan * i));
				i++;
			}
			
			System.out.println();
			dan++;
		}
	}
}

