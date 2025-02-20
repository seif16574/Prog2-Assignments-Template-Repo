//name : seif mahmoud
//id : 20216574
import java.util.Scanner;
import java.util.*;

class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count= sc.nextInt();
        List<String> output = new ArrayList<String>();
        
        for (int i=1 ; i<=count ; i++ ){
            int num = sc.nextInt();
            if(isPrime(num)) {
                output.add("Prime");
            }
            else{
                output.add("Not");
            }
        }
        
        for (int i=0; i<count; i++){
            System.out.println(output.get(i));
        }
    }
    static boolean isPrime(int num)
    {
        for(int i=2; i<=num/2; i++){
            if((num%i)==0) {
                return  false;
            }
        }
        return true;
    }
}
