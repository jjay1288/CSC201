//Ronald Phillips
public class Rectangle {
//instance variables	
private double length=1;
private double width=1;

public Rectangle(double length, double width){
	
	if (length>0.0 && length<20)
			this.length=length;
		else{
			System.out.println("Invalid Entry");
			System.exit(0);
		}

	if (width>0.0 && width<20)

	this.width=width;
		else{
			System.out.println("Invalid Entry");
			System.exit(0);
		}
	
}

public double getLength(){
	return length;
}

public double getWidth(){
	return width;
}

public void setLength(double length){
	if (length>0.0)
		if (length<20)
			this.length=length;
		else{
			System.out.println("Invalid Entry");
		}
}

public void setWidth(double width){
	if (width>0.0)
		if (width<20)
	this.width=width;
		else{
			System.out.println("Invalid Entry");
		}
}

public double calcPerim(){
	return (2*length)+(2*width);

}

public double calcArea(){
	return (length*width);

}

}
