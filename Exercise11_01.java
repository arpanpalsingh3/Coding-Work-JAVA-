import java.lang.Math;

public class Exercise11_01 { 

public static void main(String[] args) {   

    Triangle triangle = new Triangle(1, 1.5, 1); 

    triangle.setColor("yellow");  

    triangle.setFilled(true);   

    System.out.println(triangle);  

    System.out.println("The area is " + triangle.getArea());  

    System.out.println("The perimeter is "      + triangle.getPerimeter());   

    System.out.println(triangle); 

    }

}
abstract class GeometricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  /** Construct a default geometric object */
  protected GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /** Construct a geometric object with color and filled value */
  protected GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
   *  the get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }
   @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();


}



class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;

	Triangle() {
		this.side1 = 0;
		this.side2 = 0;
		this.side3 = 0;
	}
	Triangle(double Side1, double Side2, double Side3) {
		this.side1 = Side1;
		this.side2 = Side2;
		this.side3 = Side3;
	}

	double getSide1() {
		return side1;
	}
	double getSide2() {
		return side2;
	}
	double getSide3() {
		return side3;
	}
	public double getArea() {
	    double P = (side1+side2+side3)/2;
		return Math.sqrt(P*(P-side1)*(P-side2)*(P-side3));	
	}
	public double getPerimeter() {
		double p = (side1+side2+side3)/2;
		return p;
	}
	public String toString() {
	    return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}

}


