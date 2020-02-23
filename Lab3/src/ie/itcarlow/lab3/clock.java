package ie.itcarlow.lab3;

import java.util.Calendar;

public class clock {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		
		System.out.print(t);
		
		int s = t.getMinute() + 1;
		System.out.print(s);
		
		while(t.getMinute() < s) {
			//wait a second
			long i = System.currentTimeMillis();
			
		while (System.currentTimeMillis() < i + 1000) 
		{
			//do nothing
		}
		//call tick
		t.tick();
		
		System.out.print(t.getSecond() + ", ");
		//loops the minutes to add a minute after every 60 secs
		if(t.getMinute() == s)
		{
			t.incrementMinute();
			System.out.println(t.getMinute());
			
			s = s + 2;
		}
		}
	}

}
