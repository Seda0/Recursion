package Recursion;

import java.time.LocalDateTime;

public class Rec {
	
	enum Level{
		LOW,MEDiUM,HİGHT
	}
	
    static int n1=0, n2=1, n3=0;
	static void fib(int count) {
	
	if(count>0) {
		
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print("" +n3);
		fib(count-1);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=10;
		LocalDateTime time=LocalDateTime.now();
		
		System.out.print(n1+""+n2);
		fib(count-2);
		System.out.print("");
		System.out.print(time);
		Level l=Level.MEDiUM;
		System.out.println(1);
		
		
		
		
	}

}
