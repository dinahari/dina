package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
    int a=13;
    boolean flag=false;
    for(int i=2;i<=a/2;i++) {
    	if(a%i==0)
    	{
    		flag=true;
    		break;
    	}}
    	if(flag==false)
    	{
        System.out.println("prime");
    	}
    	else {
    		System.out.println("not prime");
    	}
    	
    	}
	}