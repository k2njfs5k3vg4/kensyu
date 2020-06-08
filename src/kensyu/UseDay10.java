package kensyu;

class UseDay10 {
	private int year;
	private int month;
	private int date;

	@Override
	public String toString() {
		return year + "年" + month + "月" + date + "日";
	}

	public UseDay10(int year, int month, int date) throws InvalidDayException {
		if (year < 1 || year > 3000) {
			throw new InvalidDayException("年の範囲を超えました");
		}
		if (month < 1 || month > 12) {
			throw new InvalidDayException("月の範囲を超えました");
		}
		if (date < 1 || date > 31) {
			throw new InvalidDayException("日の範囲を超えました");
		}
		this.year = year;
		this.month = month;
		this.date = date;
	}

	public UseDay10(int year, int month) throws InvalidDayException {
		this(year, month, 1);
	}

	public UseDay10() {

	}
}

//public class UseDay10 {
//
//	public static void main(String[] args) {
//		try {
//			Day10 d1 = new Day10(2007, 12, 30);
//			Day10 d2 = new Day10(-1995, 3, 5);
//			Day10 d3 = new Day10(2000, 1000);
//
//			System.out.println(d1);
//			System.out.println(d2);
//			System.out.println(d3);
//
//		} catch (InvalidDayException e) {
//			e.printStackTrace();
//		}
//	}
//
//}
