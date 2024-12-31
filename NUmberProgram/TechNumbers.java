
public class TechNumbers {
	public static void main(String args[]){
		int num=3025;
		int copy=num;
		int count=0;
		while(num>0){
			count++;
			num=num/10;
		}
		if(count%2==0){
			int div=(int)Math.pow(10,count/2);
			int firsthalf=copy/div;
			int secondhalf=copy%div;
			int sum=firsthalf+secondhalf;
			int sq=sum*sum;
			if(sq==copy)
				System.out.println("Number Is Tech Number");
			else
				System.out.println("Number Is 'Not' A Tech Number");
		}else
			System.out.println("This Is Not A Tech Number");
	}
}