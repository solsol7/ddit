package chap05.sec01;

public class ReferenceTypeExample {//��� Ŭ������ �θ� Ŭ���� -> ObjectŬ����
	//Ŭ�����̸� �ڿ� extends Object�� �����Ǿ�����
//�ڹٿ��� � Ŭ������ ��ӹ������� Ŭ������ extends�� �ٿ��ָ� �˴ϴ�.
//�׷��� extends�� �ٿ����� �ʾƵ� �ڹ��� ��� Ŭ������ �⺻������
//java.lang.Object�� ��ӹ޽��ϴ�.

public static void main(String[] args) {
Person p1=new Person("ȫ�浿",50);  // 
String str=new String("ȫ�浿");

int[] score=new int[10];

System.out.println("p1="+p1);  //�ּ����   , akakakak �κ�(�������̵�) ���� ���� ��µ�
System.out.println("str="+str); //�������
//������Ʈ Ŭ������ toString �޼ҵ� ->  ��ü������ ��ȯ�� �� ���
//("p1="+p1)��⼭ +p1, +str �ڿ� .toString �޼ҵ尡 �����Ǿ���.
// StringŬ�������� toString �޼ҵ� �������̵� -> �������� ��. ���� ��� �������.
System.out.println("score"+score);    //�迭-> Ŭ������ ���� ������ o     //�ּ����

}

}

class Person{
String name;		//�����ڸ޼ҵ�-new �ڿ� ������. ��� - ��ü �ʱ�ȭ(������� �ʱ�ȭ)
int age;			//name, age - �������

Person(){} // �Ű�����  person�� ���� �ϱ� ���� �ܺηκ��� ������ �޾Ƶ��̴� ��ο���/ �Ű�������(��ȣ�ȿ� ������) X -> �⺻������
Person(String name, int age){
this.name=name;				//name, age - ��������

	//�޼ҵ� �����ε� : �� Ŭ���������� �̸��� �Ȱ��� �޼ҵ尡 ������ ������ �� o, �� Ŭ���� ������ �߻�
				//���� : �پ��� ������ ���, �Ű������� ����/Ÿ���� �ٸ��� �޼ҵ� �̸��� ��


//���Ƶ� �������(�ٸ��޼ҵ�� ���)
	//�������̵� : �θ��ڽİ� ��Ӱ��迡 �մ� �ΰ� �̻��� Ŭ�������� �߻�, �θ�Ŭ�������� �����س��� �޼ҵ带 �ڽ� Ŭ�������� ������
	//��� Ŭ������ �����ڸ޼ҵ尡 �ϳ� �̻� �־�� ��.(�ȸ���� �ڹ� �����Ϸ��� �ڵ����� ����(default ������)
					//-> Person(){} �̰� �ڵ�����
	//����ڰ� ���������� �ڵ����� �ȸ���
	//�⺻������ ���������� ����ϱ�- �����߻� �ּ�ȭ
this.name=name;
this.age=age;
}
//akakakak
@Override  //@ -> �����ϵǾ����� �ּ�, ����� �ܼ�ȭ��ų �� O
public String toString() { 
return this.name; 
}

}
