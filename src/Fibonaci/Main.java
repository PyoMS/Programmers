package Fibonaci;


class Main {
    public static void main(String[] args){
    	Fib s = new Fib();
    	s.fibonacci(3);
    	s.fibonacci(3);
    	s.fibonacci(3);
    	s.fibonacci(3);
    	s.printString();
    
    }
}
class Fib{
	int zero_cnt=0;
	int one_cnt=0;
	public int fibonacci(int n) {
		
		
		if(n==0){
			zero_cnt++;
			return 0;
		}
			
		else if(n==1){
			one_cnt++;
			return 1;
		}
		else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
			
	  }
	public void printString(){
		System.out.println(zero_cnt+" "+one_cnt);
		zero_cnt = 0;
		one_cnt = 0;
	}
}
