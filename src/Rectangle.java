public class Rectangle extends Shape{
	double length; //가로
	double width;	//세로
	public Rectangle(String color, double radius) {
		super(color); //부모 클래스의 생성자 호출
		System.out.println("Rectangle 클래스의 생성자 호출");
		this.length = length;
		this.width = width;
	}
	
	double area() {
		return length * width;
	}
	
	public String toString() {
		return "사각형 생상은 " + super.getColor() + " 그리고 면적은 " + area();
	}
}