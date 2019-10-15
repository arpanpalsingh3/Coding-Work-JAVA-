
public class Exercise09_01 {
	public static void main(String[] args) {
		Rectangle a = new Rectangle(4.0, 40.0);
		System.out.println("The area of a rectangle with width 4.0 and height 40.0 is "+ a.getArea());
		System.out.println("The perimeter of a rectangle is "+ a.getPerimeter());
		Rectangle b = new Rectangle(3.5, 35.9);
		System.out.println("The area of a rectangle with width 3.5 and height 35.9 is "+ b.getArea());
		System.out.println("The perimeter of a rectangle is "+ b.getPerimeter());

	}
}
class Rectangle{
		public double width = 1;
		public double height = 1;
	
		Rectangle(){
			this.width = 1.0;
			this.height = 1.0;
		}
		Rectangle(double newWidth, double newHeight){
			this.width = newWidth;
			this.height  = newHeight;
		}
		public double getArea() {
			return (width * height);
		}
		public double getPerimeter() {
			return (2*width)+ (2*height);
		}
	}


	



