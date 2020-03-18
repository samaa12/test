package task4part1;

import java.util.Scanner;

public class task4part1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in) ;
		System.out.println("enter the size of the first array");
		int size1=scanner.nextInt();
		int [] num1=new int [size1];
		for(int i=0 ;i<size1;i++) {
		  num1[i]=scanner.nextInt();
		}
		System.out.println("enter the size of the second array");
		int size2=scanner.nextInt();
		int [] num2=new int [size2];
		for (int i=0;i<size2 ;i++) {
			num2[i]=scanner.nextInt();
			
		}
		
		int [] result=new int [size1+size2];
		int aindex=0;
		int bindex=0;
		int rindex=0;
		while (aindex<size1 && bindex<size2) {
			if (num1[aindex]<=num2[bindex]) {
				result[rindex]=num1[aindex];
				aindex ++;
				
			}else {
			if(	result[rindex]<=num2[bindex]) {
				bindex ++;
			}
				rindex++;
				
			}
		}
		
		System.out.println("the result is" + result);
		

	}

}
