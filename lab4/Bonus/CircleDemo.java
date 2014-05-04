public class CircleDemo{
	public static void main(String[] args)
	{
		
		//create two point objects as centers
		Point p1 = new Point(5,7);
		Point p2 = new Point(2,9);
		
		//creat two circles
		Circle c1 = new Circle(p1,3);
		Circle c2 = new Circle(p2,12);
		
		//test if the second circle contains the first one
		if(c2.contains(c1))
			System.out.println(c2+" contians "+c1);
		else
			System.out.println(c2+" doesnot contian "+c1);
		
		Circle c3 = new Circle(p2,4);
		//test if circle1 overlaps circle3
		if(c1.overlaps(c3))
			System.out.println(c1+" overlaps "+c3);
		else
			System.out.println(c1+" doesnot overlap "+c3);
		
		Circle c4 =new Circle(p2,2);
		//test if circle1 touches circle4
		if(c1.touches(c4))
			System.out.println(c1+" touches "+c4);
		else
			System.out.println(c1+" does not touch "+c4);
			
	}
}