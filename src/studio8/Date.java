package studio8;

import java.util.LinkedList;

public class Date {
	private int month; 
	private int day; 
	private int year; 
	private boolean holiday;
	


	/**
	 * 
	  @param dateMonth what month that day is in
	 * @param dateDay the day of the month
	 * @param dateYear what year it is on that date
	 * @param holidayDate if the day is a holiday

	 */
	public Date (int dateMonth, int dateDay, int dateYear, boolean holidayDate) {
		this.day=dateDay;
		this.month= dateMonth;
		this.year= dateYear;
		this.holiday=holidayDate;
		holidayDate=false;
	}
	public String toString() {
		if (holiday=true) {
			return  month + "/" + day + "/" + year + "is a holiday";

		}
		else {
			return  month + "/" + day + "/" + year ;
		}
	}
	public static void main(String[] args) {
		LinkedList<Date> list = new LinkedList<Date>();

		Date d1= new Date(7,8,2004,true);
		Date d2= new Date(7,8,2004, true);
		Date d3=  new Date(11,8,2002,true);
		Date d4= new Date(7,4, 1776, true);
		Date d5= new Date (12, 25,2023, true);
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println(d3);
		System.out.println(list);
		
	}

}
