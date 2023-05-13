package chap02.sec03;

import java.io.IOException;

public class CastExample02 {

	public static void main(String[] args) throws IOException{
		System.out.print("문자 한 글자 입력 :");
		int ch1=System.in.read();
		System.out.println((char)ch1);

	}

}
