package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean twelve; 
	/**
	 * 
	 * @param hourTime the hour of the time
	 * @param minuteTime the minute of the time
	 * @param twelveTime whether or not its in 12 hour time or military time
	 */
	public Time( int hourTime, int minuteTime, boolean twelveTime) {
		this.hour= hourTime;
		this.minute=minuteTime;
		this.twelve=twelveTime;

	}
	public String toString() {
		if (twelve= true) {


			 if ( hour <12 && minute<10) {
				return hour +":0"+ minute + "am";
			}
			else if (  hour>12 && minute<10) {

				return hour-12 + ":0" + minute + "pm";
			}
			else {
				return hour + ": " + minute + "pm";
			}

		}

		else {
			if (minute<10) {
				return hour + ":0" + minute;
			}
			else  {
				return hour+ ":" + minute;
			}
		}

	}
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}
	public static void main(String[] args) {

		Time t1= new Time(4,50,false); 
		Time t2= new Time(16,50,true);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.equals(t2));


	}


}