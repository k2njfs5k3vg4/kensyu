package kensyu;

class Day10 {
	private int month;

	public String toString() {
		return month + "月";
	}

	public Day10(int month) throws InvalidDayException{
		if ( month < 1 || month > 12) {
			throw new InvalidDayException("月の範囲を超えました");
		}
		this.month = month;
	}
}

class UseDay10{
	public static void main(String[] args) {
		try {
			Day10 d1 = new Day10(12);
			System.out.println("インスタンスd1の日付は" + d1);

			Day10 d2 = new Day10(13);
			System.out.println("インスタンスd2の日付は" + d2);

		} catch(InvalidDayException e) {
			e.printStackTrace();
		}
	}
}
