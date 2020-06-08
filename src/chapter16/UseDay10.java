package chapter16;

//Day10に例外処理を任せるパターン
class Day10 {
	private int year;
	private int month;
	private int date;

	public String toString() {
		return year + "年" + month + "月" + date + "日";
	}

	public Day10(int year, int month, int date) throws InvalidDayException {
		if (year < 1 || year > 3000) {
			throw new InvalidDayException("年の範囲を超えました。");
		}
		if (month < 1 || month > 12) {
			throw new InvalidDayException("月の範囲を超えました。");
		}
		if (date < 1 || date > 3000) {
			throw new InvalidDayException("日の範囲を超えました。");
		}
		this.year = year;
		this.month = month;
		this.date = date;

	}

	public Day10(int year, int month) throws InvalidDayException {
		this(year, month, 1);
	}
}

public class UseDay10 {

	public static void main(String[] args) {
		try {
			Day10 d1 = new Day10(2007, 12, 30);
			Day10 d2 = new Day10(-1995, 3, 5);
			Day10 d3 = new Day10(2007, 1000);

			System.out.println("インスタンスd1の日付は" + d1);
			System.out.println("インスタンスd2の日付は" + d2);
			System.out.println("インスタンスd3の日付は" + d3);

		} catch (InvalidDayException e) {
			e.printStackTrace();
		}
	}

}
