
public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle() {
		this.length = 1.0;
		this.width = 1.0;
	}
	
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
		
	}


	public Rectangle(double length, double width, String color, boolean filled) {
		super(color, filled);
		
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getArea() {
		return length * width;
	}
	
	
	public double getPerimeter() {
		return (width * 2) + (length * 2);
		
	}


	@Override
	public String toString() {
		return "A Rectangle with length=" + length + ", width=" + width + "which is a subclass of " + super.toString() + "]";
	}


	
	
	
	
}

