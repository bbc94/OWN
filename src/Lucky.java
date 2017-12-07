import java.util.Random;
import java.util.Scanner;
public class Lucky {
	public static void main(String args[]) {
		int good[] = new int[3];
		int bad[] = new int[3];
		int select[]= new int[6];
		int count=0;
		int in[] = new int[6];
		
		Scanner put = new Scanner(System.in);
		for(int i=0;i<in.length;i++) {
			in[i]=put.nextInt();
		}
		
		Random rd = new Random();
		
		for(int i=0;i<select.length;i++) {
			select[i]=(int)rd.nextInt(12)+1;
		
			for(int j=0;j<i;j++) {
				if(select[i]==select[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0;i<select.length;i++) {
			if(i<3) {
				good[i]=select[i];
			}
			if(i>=3) {
				bad[i-3]=select[i];
			}
		}
		for(int i=0;i<good.length;i++) {
			System.out.print(good[i]+" ");
		}
		System.out.println();
		for(int i=0;i<bad.length;i++) {
			
			System.out.print(bad[i]+" ");
		}
		for(int i=0;i<in.length;i++) {
			
			System.out.print(in[i]+" ");
		}
		
		
	}
}
