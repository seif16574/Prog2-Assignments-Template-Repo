//name : seif mahmoud
//id : 20216574
import java.util.Arrays;
import java.util.*;
public class first {
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();    
        int [] arr = new int[s];   
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();    
        }
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
