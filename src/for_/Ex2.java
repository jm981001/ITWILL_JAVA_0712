package for_;

public class Ex2 {
	public static void main(String[] args) {

	//1~100까지 합
	int sum = 0; //누적할 변수 선언 //선언만 하고 초기화는 안하면 에러 뜸! 꼭 int sum = 0; 해주기
	for(int i=0; i <= 100; i++) {
		sum+=i;
	}
	System.out.println("1부터 100까지의 합 : " +sum);
	
	
	System.out.println("===============================");
	
	//반복문과 조건문의 결합
	//1~100까지 1씩 증가하며 홀수와 짝수 따로 구분
	sum = 0;
	int sum2 = 0;
	
	for(int i = 1 ; i <=10; i++) {
		if(i%2==0) {
			sum += i;
		}else {
			sum2 += i;
		}
	}
	System.out.println("1~10까지 짝수의 합 " + sum);
	System.out.println("1~10까지 홀수의 합 " + sum2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
