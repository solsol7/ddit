package user;


import java.util.Arrays;
import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		System.out.println(method1(4,11));
	}
	
	public static int method1(int a, int b) {
		int result=a+b;
		return result;
	}
	
}







class Varargs{
		public void number(int ...a) {
			for(int num : a) {
				System.out.println(num);
			}
		}
		
		public void result() {
			number(1,2,3,4,10);
		}
}



 class SolSol {
	Scanner sc=new Scanner(System.in);
	public void main(String[] args) {
		ex9();
	}
	public void ex1(){
		int x=5;
		int y=2;
		double result=(double)x/(double)y;
		System.out.println(result);

	}
	
	public void ex2() {
		double var1=3.5;
		double var2=2.7;
		int result=(int)(var1+var2);
		System.out.println(result);
	}
    public void ex3() {
	int answer = 0;
    String str;
    String[] order = {"1","2","3","4","6","8"};
    int[] sum = null;
    for(int i=0; i<order.length; i++){
        if(order[i]=="1"||order[i]=="3"||order[i]=="7"||order[i]=="9"||order[i]=="6"||order[i]=="2"){
                    sum[i]=4500;
        }else{
                    sum[i]=5000;
        }
        answer=answer+sum[i];
	
    	}
    }
    
    public void ex4() {
    	System.out.println("���� �Է� : ");
    	Scanner sc=new Scanner(System.in);
    	String word=sc.nextLine();
    	int[] count = new int[52];
    	char[] al = new char[26];
    	char[] ab = new char[26];
    	al[0]='A';
    	for(int i=0; i<25; i++) {  					 //al=='A'
    		for(int j=0; j<word.length(); j++) {
    			if(word.charAt(j)==al[i]) {				
    				count[i]=count[i]+1;
    			}
    		}
    		al[i+1]=(char)(al[i]+1);
        		}
		for(int j=0; j<word.length(); j++) {
			if(word.charAt(j)==al[25]) {				
				count[25]=count[25]+1;
			}
		}
		ab[0]='a';
    	for(int i=0; i<25; i++) {  					 //al=='A'
    		for(int j=0; j<word.length(); j++) {
    			if(word.charAt(j)==ab[i]) {				
    				count[i+26]=count[i+26]+1;
    			}
    		}
    		ab[i+1]=(char)(ab[i]+1);
        		}
		for(int j=0; j<word.length(); j++) {
			if(word.charAt(j)==ab[25]) {				
				count[51]=count[51]+1;
			}
		}
    	
  
    	for(int i=0; i<count.length; i++){
    			System.out.print(count[i]);
    	}
    }
    
    
    public void ex5() {
    	Scanner sc = new Scanner(System.in);
    	String my_string=sc.nextLine();
        int[] answer = new int[52];
        for(int i=0; i<52; i++) {
        	for(int j=0; j<my_string.length(); j++) {
        		if(my_string.charAt(j)==(char)('A'+i)) {
        			
        			}
        	}
    	}
}
    
    public void ex6() {
    	
    	char[] al=new char[26];
    	al[0]='A';
    	for(int i=0; i<26; i++) {
    		if(i<25) {
        al[i+1]=(char)(al[i]+1);
    		}
    	}
    	System.out.println(al);
    	
    	}
    
	public void ex7() {  //�̰� ���ص�
		boolean a=false;
		int b=0;
		while(a==false) {
			b=b+2;
			if(b==32) {
				a=true;   //
			}
		}
		System.out.println(b);
    }
	
	public void ex8() {  //���� ��
		boolean a=false;
		int b=0;
		while(a!=true) {
			b=b+2;
			if(b==32) {
				a=true;   //
			}
		}
		System.out.println(b);
    }
	
	public void ex9() {  //�̰� ���� �ȵ�
		boolean a=false;
		int b=0;
		while(!a) {    //��ȣ ���� true,  a�� �ƴҶ� �ݺ�->true�϶� �ݺ��� �Ѵ�?? !a�� a!=false�� �ٸ���?
			b=b+2;
			if(b==32) {
				a=!false;   // a�� true�ε� �� ����?
			}
		}
		System.out.println(b);
    }


	public void ex10() {						//���� �Է¹޾� 2�� �ŵ��������� ���� ���ϱ�
		System.out.print("���ڸ� �Է��ϼ��� : ");
		double number=sc.nextDouble();
		double i=0;
/* 		i=number/2.0;
		do {
			i=i/2.0;
		}while(i>1);			*/
		if(i==1.0) {
			System.out.println("2�� �ŵ������Դϴ�.");
		}else {
			System.out.println("2�� �ŵ������� �ƴմϴ�.");
			}
		}

	
		public void ex11() {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			double number=sc.nextDouble();
/*				while(number>1) {
				number=number/2.0;
				}							*/
				if(number==1.0) {
					System.out.println("2�� �ŵ������Դϴ�.");
				}else {
					System.out.println("2�� �ŵ������� �ƴմϴ�.");
				}
			}

		public void ex12() {
			int[] arr1= {10,20,30,40,50};
			int[] arr2=arr1;
			arr2[2]=1000;
			int[] arr3 =new int[5];
			System.out.println(arr1[2]);
			System.arraycopy(arr1, 0, arr3, 0, arr1.length);
			System.out.println(Arrays.toString(arr3));
			String[] str = {"����","����","�ٳ�","��","����"};
			String st=str[0];
			char[] ch=st.toCharArray();
			System.out.println(Arrays.toString(ch));
			System.out.println(new String(ch));
			}
		

		}


 
 
 
 
 
 class Student1{	
		private long stdID;
		private String stdName;	

								
		public Student1() {} 
		public void setStdID(long stdID)  {						
			this.stdID=stdID;							
		}
		public void setStdName(String stdName)  {				
			this.stdName=stdName;					
		}

		public Student1(long stdID, String stdName) {
			this.stdID=stdID;		
			this.stdName=stdName;	
		}

		public void showInfo() { 
			System.out.println("�й� : "+stdID);
			System.out.println("�̸� : "+stdName);
		}

		@Override
		public String toString() { 
			return "�й� : "+stdID+"�̸� : \n"+stdName; 
		}
	}

 
 
