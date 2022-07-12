package for_;

public class Ex1 {

	public static void main(String[] args) {

		//Hello, World! 10번 출력
		for(int i = 1 ; i<=10; i++) {
			System.out.println(i+" : Hello, World!");
		}
		
		//for문이 종료되면 i값은 접근 불가
//		System.out.println(i); 에러뜸
		
		System.out.println( );
		System.out.println("=====================");
		
		//2부터 10까지 2씩 증가
		for(int i = 2; i<=10; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println( );
		System.out.println("=====================");
		
		//제어변수 i가 10 ~1까지 감소하며 i값 출력
		for(int i = 10; i>0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println( );
		System.out.println("=====================");
		
		//for문에서 구성요소 제외 가능
		int i = 1;
		for(; i<=10; i++) {
			System.out.print(i + " ");
		}
		System.out.println( );
		System.out.println("for문 종료 후 제어변수 i = " + i);
		
		
//		for(int i = 1; i <=10; i++) { //위에 i를 쓰고있으니까 선언은 하면 안됨
		for( i = 1; i <=10; i++) { //가능
			
		}
		
		
		
	}

}
