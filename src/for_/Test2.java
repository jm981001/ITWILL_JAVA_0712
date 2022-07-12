package for_;

public class Test2 {

	public static void main(String[] args) {

		//두 정수 a~b까지 3의 배수의 합
		//출력 : “X ~X까지 3의 배수의 합 : XX”
		int a=10, b=30;
		int sum = 0;

		for (int i=a; i <= b; i++) {
			if(i%3==0) {
				sum +=i;
			}
		}
		System.out.println(a+"~"+b+"까지 3의 배수의 합 : " + sum);

	/////////////////////////////////////////////////////////////////

		//369 게임
		//정수 1~100까지 증가하며 반복
		//정수 일의자리가 3,6,9인경우 숫자 대신에 "짝" 출력

		for(int i = 1; i<=100; i++) {
			int num = i%10;
			if(num==3||num==6||num==9) {
				System.out.print("짝 ");
			}else {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		//switch case문으로 해보기
		for(int i = 1; i<=100; i++) {
			switch (i%10) {
			case 3:
			case 6:
			case 9:
				System.out.print("짝 ");
				break;
			default:
				System.out.print(i+" ");
			}
		}
	
		System.out.println();
		
		
		/////////////////////////////////////////////////////////////////

		
		
		//7의 갯수 카운트 하기 //반복 횟수를 모르니까 while문이 더 적합
		int n = 247778777;
		int sum1 = 0;
//	while문	
		while(n>0) {
			if(n%10==7) { //n값이 바뀐건 아니다 
				sum1++; 
			}
			n/=10; //n을 초기화 다시 시켜주기
		}
		System.out.println("7의 갯수 : " + sum1 ); 
		
		
// for문
		int count=0;
		for(int n1 = 247778777; n1 != 0; n1 /= 10) {
			if(n1 % 10 == 7) {
				count++;
			}
		}
		
		System.out.println("7의 갯수 : " + count);
	
}
}

