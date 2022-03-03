package M5;

import java.util.Scanner;

public class TestGitM5 extends GitM5{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		        int K;
		        
		        K = sc.nextInt(); 
		        
		        String [] arr = new String[K];

		        int i =0;

		        while( i < K ) {	 
		             arr[i] = sc.next();
		             i++;
		        }
		      
		        int P;
		     
		        P = sc.nextInt();

		        for (i = 0; i < K; i++) {
		            if( P != i) {	
		                System.out.print(arr[i]+" ");
		            }
		        }
		    }
		}
