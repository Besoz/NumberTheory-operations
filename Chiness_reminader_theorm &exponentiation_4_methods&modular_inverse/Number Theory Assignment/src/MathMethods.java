import java.math.BigInteger;
import java.util.Scanner;

public class MathMethods {
	public static void main(String[] args) {

		// long startTime1 = System.currentTimeMillis();
		// System.out.println(Math.pow(4,13)%497);
		// long endTime1 = System.currentTimeMillis();
		// long totalTime1 = endTime1 - startTime1;
		// System.out.println(totalTime1);
		//
		//
//		 long startTime2 = System.currentTimeMillis();
		//
//		 BigInteger a = new BigInteger("555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
//		 BigInteger b = new BigInteger("777777777777777777777777777777777777777777777777777777777777777777777777777777777777777755555555555555555555");
//		 BigInteger m = new BigInteger("222222222222222222222222222222222222222222222222222222222222222222222222222222222222222255555555555555555555");
		// BigInteger c=new BigInteger("1")
		// for (int i = 0 ; i < b.intValue() ; i ++){
		// c=(c.multiply(a)).mod(m);
		// }
		// System.out.println(c);
		//
		// long endTime2 = System.currentTimeMillis();
		// long totalTime2 = endTime2 - startTime2;
		// System.out.println(totalTime2);

//		Scanner in = new Scanner(System.in);
//		int a = 17;
//		int n = 5;
//		int i = 1;
//		while ((i * n + 1) % a != 0)
//			i++;
//		System.out.println(((i * n + 1) / a));
//		System.out.println(a%n);
		 
//	     long startTime2 = System.currentTimeMillis();
//		 System.out.println(modularExpStraight(a, b, m));
//		 long endTime2 = System.currentTimeMillis();
//		 long totalTime2 = endTime2 - startTime2;
//		 System.out.println(totalTime2);
//		 
//			startTime2 = System.currentTimeMillis();
//			System.out.println(modularExpBinary(a, b, m));
//			 endTime2 = System.currentTimeMillis();
//			 totalTime2 = endTime2 - startTime2;
//			 System.out.println(totalTime2);
//			 
//		     startTime2 = System.currentTimeMillis();
//				System.out.println(modularExploop(a, b, m));
//				 endTime2 = System.currentTimeMillis();
//				 totalTime2 = endTime2 - startTime2;
//				 System.out.println(totalTime2);
		 
//		  startTime2 = System.currentTimeMillis();
//			System.out.println(modularExpStraightForward(a, b, m));
//		  endTime2 = System.currentTimeMillis();
//		  totalTime2 = endTime2 - startTime2;
//		 System.out.println(totalTime2);
		 

		 

		

	}
	
	public static BigInteger modularExpStraight(BigInteger a,BigInteger b,BigInteger n){	
		return a.modPow(b, n);
		
	}
	public static BigInteger modularExploop(BigInteger a,BigInteger b,BigInteger n){
		BigInteger i = new BigInteger("0");
		BigInteger c=new BigInteger("1");
		for (; i.compareTo(b) < 0; i = i.add(BigInteger.ONE)) {
			c=(c.multiply(a)).mod(n);
		}
		return c;
		
	}
	
	public static BigInteger modularExpBinary(BigInteger a,BigInteger b,BigInteger n){
		BigInteger c=new BigInteger("1");
	    while (b.compareTo(BigInteger.ZERO) ==1){
	        if (b.mod(new BigInteger("2")).equals(new BigInteger("1"))){
	        	c=(c.multiply(a)).mod(n);
	        }
	        b=b.shiftRight(1);
	        a=(a.multiply(a)).mod(n);
	    }
	    return c;
		
	}
	public static BigInteger modularExpStraightForward(BigInteger a,BigInteger b,BigInteger n){
		BigInteger i = new BigInteger("0");
//		for (; i.compareTo(b) < 0; i = i.add(BigInteger.ONE)) {
			a=a.pow(b.intValue());
//		}
		return a.mod(n);
	}
	public static  int CRT(int[] a , int [] m){
		
		int bigM=1;
		int[] mArr = new int[m.length];
		int[] yArr = new int[m.length];
		int x=0;
		for (int i = 0; i < m.length; i++) {
			bigM=m[i]*bigM;
		}
		
		for (int i = 0; i < mArr.length; i++) {
			mArr[i]=bigM/m[i];
			yArr[i]=(int) getModularInverse(mArr[i], m[i]);
			x=(x+(a[i]*yArr[i]*mArr[i]))%bigM;
		}
		
		return x;
	}
	
	public static long getModularInverse(int a , int m){
		
		long i = 1;
		while ((i * m + 1) % a != 0){
			i++;
		}
		return ((i * m + 1) / a);
	}

	}
