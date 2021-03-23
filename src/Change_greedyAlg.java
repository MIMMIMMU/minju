import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();//���� ��
		int n=sc.nextInt();//���� ��
		
		solution(m,n);
	}
	
	public static void solution(int m, int n) {
		int kind=0, cnt=0;//��������� ����� ����(ȭ�� ���� ����, �� ȭ�� ����)
		
		int change=m-n;
		int[]money= {50000,10000,5000,1000,500,100,50,10};
		
		for(int i=0;i<money.length;i++) {//money�迭�� �ϳ��� ����
			boolean isUsed=false; //���� ȭ������ Ȯ���ϱ� ���� ����
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
