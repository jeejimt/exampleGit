import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DataEx {

	public static void main(String[] args) {
		//to get current date and time
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());   
		/*or use the following single step
		System.out.println(Calendar.getInstance().getTime());*/

		//to add random numbers of   days to current date
		Random rnd=new Random();
		int i=rnd.nextInt(100);//will produce random numbers between 0(include) and 100(exclude)
		System.out.println(i);
		cal.add(Calendar.DATE,i);
		Date d=cal.getTime();
		System.out.println(d);


		//to get date in desired format
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YY");

		String dd=sdf.format(d);
		System.out.println(dd);
		System.out.println(dd.split("/")[1]);
	}

}
