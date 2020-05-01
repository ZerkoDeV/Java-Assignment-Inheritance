
public class Circle extends Shape {

	private double radius;
    
    public Circle() {
    	this.radius = 1.0;
    }
	
	
    public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
		
		
	}
    
    public double getRadius(){
        return this.radius;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    
    
    public void setRadius(double radius){
        if(radius <= 0){
            this.radius = 1.0;
        }else{
            this.radius = radius;
        }
    }


	@Override
	public String toString() {
		return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString() + "]";
	}

	
  
   
}
