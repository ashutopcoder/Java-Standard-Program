//Linear Search In Java:
import java.util.Scanner; 
public class LinearSearch{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num=sc.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]){
				System.out.println(arr[i]+" Number Found On Position: "+i);
				flag=1;
			}
		}
		if(flag==0)
				System.out.println("Number Not Found");		
	}
}