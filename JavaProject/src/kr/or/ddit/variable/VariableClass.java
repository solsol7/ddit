package kr.or.ddit.variable;

public class VariableClass {
	/*
	 *   2. ������ Ÿ��
	 *  - ���� ���� �� �ʱ�ȭ
	 *  - ���� ��� ��Ģ
	 *  - �⺻ Ÿ��
	 *  - Ÿ�� ��ȯ
	 *  - ������ �ý��� �����
	 */
	public static void main(String[] args) {
		/*
		 * 1) ���� ���� �� �ʱ�ȭ
		 * 
		 * ������? ���� ������ �� �ִ� �޸��� Ư�� ������ ���̴� �̸��̴�.
		 * �̷� ���� �� �ʿ� ���� '���� �����ϱ� ���� ����'���� ����ϸ� �˴ϴ�.
		 * �׷��� �� ������ �ּҸ� ���´ٴ� ���̴�!!
		 * 
		 * [���� ���� �� �ʱ�ȭ]
		 * int age;				//���� ����
		 * age=10;				//���� �ʱ�ȭ
		 * int num=20;			//���� ���� �� �ʱ�ȭ
		 * 
		 * 
		 * 		** ���⼭ �� �˰� ���� �� �κ���, ������ �����ϱ� ���ؼ��� �������� Ÿ����
		 * 			�ڷ����� �˾ƾ� �մϴ�. �׷��� ���ؼ��� Ÿ�� ������ �˰� Ÿ�� ������ ����
		 * 			�ʱ�ȭ �� �� �ִ� ���� �˾ƾ� �մϴ�.
		 * 			Ÿ�Ժ� �ʱ�ȭ �� �� �ִ� ���� ����̸�, Ÿ�� ������ ����� �ְ� �� ���´�
		 * 			� ���� �ִ����� �Ʒ� 3)���� �ѹ��� Ȯ���� �� �ֵ��� �մϴ�!!!!
		 */
	int age = 99;				//������ Ÿ���� ���� age�� 99��� ������ �ʱ�ȭ
	int num;					// ������ Ÿ���� ���� num�� ����
	num=1400;					//���� num�� 1400������ �ʱ�ȭ
	boolean flag= false;		//���� Ÿ���� ���� flag�� false������ �ʱ�ȭ
	String str="";				//���ڿ� Ÿ���� ���� str�� ""(����)������ �ʱ�ȭ
	str = "Basic Java";			//str������ "Basic Java"���ڿ��� ���� �ʱ�ȭ
	
	
	/*
	 * 2) ���� ��� ��Ģ
	 * 
	 * 		���� �̸��� �ڹ� ���� ���� ��� ��Ģ�� ����� �ϴµ�, �Ʒ��� ���� ���
	 * 		��Ģ�� ��Ű���� ����!
	 * 		- ù��° ���ڴ� �����̰ų� '$','_'�� �����ؾ� �ϰ�, ���ڷ� ������ �� ����
	 * 		-���� ��ҹ��ڸ� �����Ѵ�.
	 * 		- ù ���ڴ� �ҹ��ڷ� �����ϰ�, �ڿ� �ٸ� �ܾ �ٴ� ��� �빮�ڷ� �����Ѵ�
	 * 			>�����ڵ� ���̿��� ���ʷ� ��������
	 * 			>ī�� ǥ���(Camel Case)�̶�� �Ѵ�.
	 * 		-���� ���� ������ ����. (�׷��ٰ� �ʹ� ��� �ȵǰ���? ������ ���)
	 * 		-�ڹ� ������ ����� �� ����
	 * 			>boolean, byte, char, int, private, new, void ��
	 * 			>ȥ�� �����ϴ� �ڹ� p50���� �����ϵ��� �Ѵ�!
	 */
	
	int boNo = 0;
	int bo_hit=0;
	String title ="";
	String boContent="";
	boolean joinFlag = false;
	
	double mathKorNum;		//���������� ������ �ҹ��ڷ� �����Ѵ�.
	float floatNum;			// ������ ���ڷ� ������ �� ����
	String $ajaxObject;		// ������ $�� ������ �� �ִ�.
	int _count;				// ������ _�� ������ �� �ִ�.
//	String private;			//�������� ������ ������ �� ����.
	
	/*
	 * 3) �⺻ Ÿ��
	 * 
	 * 		�⺻�� Ÿ��
	 * 		-����, �Ǽ�, ����Ÿ���� �⺻ Ÿ���� �����Ѵ�.
	 * 		-������ Ÿ�� : byte, char, short, int, long
	 * 		-�Ǽ� Ÿ�� : float, double
	 * 		-�� Ÿ�� : boolean
	 * 
	 *		** ������ Ÿ���� ũ�� �ϱ� ���
	 *		- BC ī��� SIL����!!!!
	 *		- B C S I L  (byte, char, short, int, long)
	 *		- 1 2 2 4 8
	 *		-boolean float double
	 *		- 1			4	8
	 *
	 *		������ Ÿ��
	 *		- String, Integer, Float, Double ���
	 */	
	byte len = 127;
	short length = 128;
	char ch1='A';		//A�� ��µȴ�
	char ch2=65;		//A�� ��µȴ�
	int textNum=ch1;	//���� 64�� ��µȴ�
	int box = 2145685911;	//int���� ���� �� �ִ� �ִ� �� ������ �ִ�.
	long max= 999999999;	//long���� ���� �� �ִ� �ִ� �� ������ �ִ�.
	boolean agree=false;	// ������ true/false �� �� �� �ϳ���
	float num1=24;			
//	float num2=24.5;		// float�� �Ҽ��� �Է��� �� f�� �ٿ��ش�.
	float num3=24.516f;		
	double num4=123.123;	//double�� �Ҽ��� �״�� �Է� ����
	double num5=num3;		//���� �Ǽ����̱� ������ ������� �� �ִ�.

	
	/*
	 * 4) Ÿ�� ��ȯ
	 *  Ÿ�� ��ȯ�̶�, �ش� ������ Ÿ���� �ٸ� ������ Ÿ������ ��ȯ�ϴ� ���� ���Ѵ�.
	 *  
	 *  Ÿ�� ��ȯ�� ū ��� ���� Ÿ��= ���� ��� ���� Ÿ��;
	 *  
	 *  [ũ�� ����]
	 *  byte < short < int < long < float < double
	 *  
	 *  ���� Ÿ�� ��ȯ(ĳ����)
	 *  ���� ��� ���� = (ū ��� ����)��;
	 *  
	 *  ������ Ÿ���� �Լ��� �̿��� Ÿ�Ժ�ȯ
	 *  ������ Ÿ��.parse������ Ÿ��
	 *  >Integer.parseInt();
	 *  >Byte.parseByte();
	 *  >Short.parseShort();
	 *  >Double.parsDouble();
	 *  
	 *  ������ Ÿ���� �Լ��� �̿��� ����ȯ�� Ư¡�� �ִµ� ��ȯ�ϰ��� �ϴ� Ÿ����
	 *  �� ���¸� �����־�� �Ѵ�.
	 *  
	 *  #�ڷ����� ���� �⺻��(������)
	 *  �ڷ���	| �⺻��
	 *  byte	| 	0
	 *  short	|	0
	 *  int		|	0
	 *  long	|	0
	 *  float	|	0.0f
	 *  double	|	0.0	
	 *  char	|	'\u0000'(null)
	 *  boolean	|	false
	 */
	
	byte byteValue = 127;
	int intValue = 1+ byteValue;
	long longValue = 900000000L;
	float floatValue = longValue;
	double doubleValue = longValue;
	char charValue = 'A';
	int intValue2 = charValue;
	System.out.println("��� ����=====");
	System.out.println("byteValue : "+byteValue);
	System.out.println("intValue :"+intValue);
	System.out.println("longValue : "+longValue);
	System.out.println("floatValue : "+floatValue);
	System.out.println("doubleValue : "+doubleValue);
	System.out.println("charValue : "+charValue);
	System.out.println("intValue2 : "+intValue2);
	System.out.println("");
	
	int a=128;
	byte b = (byte)a;
	System.out.println("b : "+b);
	
	}
	
}




