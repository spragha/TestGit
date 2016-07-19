import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class MainEqual {

	static{

	}

	public static void main(String[] args) {

		//MainEqual equal=new MainEqual();
		/*int i=10;
		int j=10;
		String str="raghavan";
		String str1="raghavan";

		System.out.println(i==j);
		System.out.println(str==str1);

		System.out.println(1);*/


		Date dNow = new Date( );
	      SimpleDateFormat ft =
	      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss:SSS a zzz");

	     int a=198;
	     long startTime=System.nanoTime();

	     System.out.println("Current Date: " + startTime);
		if(a>=101&&a<=199){

			System.out.println("A value is :"+a);

		}
		long endTime=System.nanoTime();
		System.out.println("Current Date: " + endTime);
		System.out.println(endTime-startTime);
		System.out.println(TimeUnit.MICROSECONDS.convert(endTime-startTime, TimeUnit.NANOSECONDS));
	}

}
