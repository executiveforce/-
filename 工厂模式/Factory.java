//创建工厂类
public class Factory{

	public static Shape getShape(String shapeType){
		if(shapeType == null)
			return null;
		if(shapeType.equalsIgnoreCase("")){
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("")){
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("")){
			return new Square();
		}
		return null;
	}
}


//创建一个接口
interface Shape{
	void draw();
}

//创建实现接口的实体类
class Rectangle implements Shape{

	@override
	public void draw(){
		System.out.println("Inside Rectangle");
	}
}

class Square implements Shape{

	@override
	public void draw(){
		System.out.println("Inside Square");
	}
}

class Circle implements Shape{

	@override
	public void draw(){
		System.out.println("Inside Circle");
	}
}



