//name : seif mahmoud
//id : 20216574
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
        int num = sc.nextInt();
	    for(int i = 0; i < num; i++){
	        System.out.print(fib_num(i)+ " ");
	    }
    }
}
