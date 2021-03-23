import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();//받은 돈
		int n=sc.nextInt();//물건 값
		
		solution(m,n);
	}
	
	public static void solution(int m, int n) {
		int kind=0, cnt=0;//결과값으로 출력할 변수(화폐 종류 개수, 총 화폐 개수)
		
		int change=m-n;
		int[]money= {50000,10000,5000,1000,500,100,50,10};
		
		for(int i=0;i<money.length;i++) {//money배열에 하나씩 접근
			boolean isUsed=false; //사용된 화폐인지 확인하기 위한 변수
			while(change>=money[i]) {
				cnt++;
				change-=money[i];
				isUsed=true;
			}
			
			if(isUsed)kind++;
		}
		
		System.out.println(kind+" "+cnt);
	}
}
