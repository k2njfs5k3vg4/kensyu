package kensyu;

public class Day10 {

	private int year;
	private int month;
	private int date;

	public String toString() {
		return year+"年"+month+"月"+date+"日";
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public Day10(int i, int j, int k) throws InvalidDayException{
		this.year=i;
		this.month=j;
		this.date=k;
	}



}
