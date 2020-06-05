package kensyu;

abstract class Figure {
	abstract String Calc();
}

class Circle extends Figure{

	int radius;

	@Override
	String Calc() {
		return "面積："+radius*radius*3.14;
	}
	Circle(int radius){
		this.radius = radius;
	}
	Circle(){}

}

class Triangle extends Figure{

	int side;
	int high;

	@Override
	String Calc() {
		return "面積："+side*high/2;
	}

	Triangle(int side, int high){
		this.side = side;
		this.high = high;
	}
	Triangle(){}
}

class Square extends Figure{

	int side1;
	int side2;

	@Override
	String Calc() {
		return "面積；"+side1*side2;
	}

	Square(int side1, int side2){
		this.side1 = side1;
		this.side2 = side2;
	}
	Square(){}

}
