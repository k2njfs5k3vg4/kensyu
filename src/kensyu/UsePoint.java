package kensyu;

public class UsePoint {

	public static void main(String[] args) {
		Point[] points = { new Point(3,9),
				new ColorPoint(12,-3,"RED"),
				new Point(56,2),
				new ColorPoint(7,-28,"BLUE")
		};

		for(Point p: points) {
			if(p instanceof ColorPoint) {
				ColorPoint c = (ColorPoint)p;
				System.out.println(c.showInfo());
			}else{
				System.out.println(p.showXY());
			}System.out.println();
		}
	}

}
