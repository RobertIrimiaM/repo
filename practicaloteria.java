package M5;

import java.util.Scanner;

public class practicaloteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int k= sc.nextInt(); int i=0;
		String [] arr=new String[k];

			while (i<k) {
				 arr[i]=sc.next();
				 i++; }
		int p=sc.nextInt();
		
		for(i=0;i<k;i++) {
			if(p!=i) {
				System.out.println(arr[i]+" ");
			}
		}
		
		sc.close();
	}
	
}


