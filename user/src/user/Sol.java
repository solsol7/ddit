package user;

import java.util.Scanner;

public class sol {

	public static void main(String[] args) {
		ex5();
	}
	public static void ex1(){
		int x=5;
		int y=2;
		double result=(double)x/(double)y;
		System.out.println(result);

	}
	
	public static void ex2() {
		double var1=3.5;
		double var2=2.7;
		int result=(int)(var1+var2);
		System.out.println(result);
	}
    public static void ex3() {
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
    
    public static void ex4() {
    	System.out.println("문자 입력 : ");
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
    
    
    public static void ex5() {
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
    
    public static void ex6() {
    	
    	char[] al=new char[26];
    	al[0]='A';
    	for(int i=0; i<26; i++) {
    		if(i<25) {
        al[i+1]=(char)(al[i]+1);
    		}
    	}
    	System.out.println(al);
    }
}


// 이은솔 메렁