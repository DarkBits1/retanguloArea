package entities;

public class rectangle {
	
     public double width;
     public double height;
     
     
     
     public double area() {
    	return width * height;
     }
     public double perimeter() {
    	 return width * 2 + height * 2;
     }
     public double diagonal() {
    	 return Math.sqrt(height*height + width*width );
     }
     
     public String result() {
    	 return String.format("AREA = %.2f%n", area())
    			 + String.format("PERIMETER = %.2f%n", perimeter())
    			 + String.format("DIAGONAL = %.2f%n", diagonal());
    	 
     }
}    
