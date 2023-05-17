package chap06.sec02;

public class Shape {
	String kind="오각형";  //직접초기화
	int height=50;
	int weight=15;
	
	{					//초기화블록
		kind="타원형";
		height=70;
	}

	Shape(String kind,int weight){		//생성자메소드
		this.kind=kind;
		this.weight=weight;
	}

	@Override
	public String toString() {
		return "도형 : "+kind+"\n가로 : "+weight+"\n세로 : "+height;
	}


}
