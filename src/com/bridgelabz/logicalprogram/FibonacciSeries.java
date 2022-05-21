package com.bridgelabz.logicalprogram;

public class FibonacciSeries {

	
	
	public void fibonacci(int num){
        int a=0, b=1;
        int c;
  System.out.print(a + " "+b );

  //loop through numbers, below 'num' 
  for(int i=2;i<num;i++){
      c = a+b;
      a = b;
      b = c;
      System.out.print(" "+c);            
  }
}

//recursive method to add last 2 numbers
public int recFibonacci(int a, int b){
  int c =a+b;
  return c;        
}
public static void main(String[] args){
	FibonacciSeries  fib = new FibonacciSeries();
  fib.fibonacci(10);        
}

	
	
	
	
	
	
	
	
	
	
	
}
