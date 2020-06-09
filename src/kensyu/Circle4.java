package kensyu;

public class Circle4 {

	public static final double PI = 3.14;
	private double radius;

	public Circle4(double radius) throws CircleRadiusException {
		//circle4でcatchせず、呼び出し元でcatchしてもらう。
		this.setRadius(radius);
	}

	public Circle4() {
	}

	public double area() {
		return this.getRadius() * this.getRadius() * PI;
	}

	public double getRadius() {
		return radius;
	}

	//setterに半径が0以下になっていないかの検査することを任せる
	public void setRadius(double radius) throws CircleRadiusException {
		if (radius <= 0) {
			throw new CircleRadiusException("半径が0以下です。");
		}

		this.radius = radius;
	}

}
