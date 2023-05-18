package chap06.sec03;

public class CylinderExampleMe {

	public static void main(String[] args) {
		VolumnM volumnM=new VolumnM(23.5, new CircleM(5));
		System.out.println(volumnM.getVolumnM());
	}

}


class CircleM{
	private double half;
	private final double PI=3.14;
	
	CircleM(){}
	CircleM(double half){
		this.half=half;
	}
	
	public double area() {
		return half*half*PI;
	}
}




class VolumnM{
	CircleM circleM;
	private double height;
	private double volumnM;
	
	VolumnM(){}
	VolumnM(double height,CircleM circleM){
		this.height=height;
		this.circleM=circleM;
	}
	
	public double getVolumnM() {
		return circleM.area()*height;
	}
	
	
}

