// name : khadiga mohamed 
// id : 20216283
import java.io.*;
import java.util.Scanner;
public class Main {
    public static int fib_num(int n)
    {
	    if(n == 0){
	        return 0;
	    } else if(n == 1){
	        return 1;
	    }else{
	        return fib_num(n-2) + fib_num(n-1);
	    }
    }
    public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	    for(int i = 0; i < n; i++){
	        System.out.print(fib_num(i)+ " ");
	    }
    }
}
