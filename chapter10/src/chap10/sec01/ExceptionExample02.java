package chap10.sec01;

public class ExceptionExample02 {//����

	public static void main(String[] args) {
		try {
			throw new CustomException("���� ���� ���� Ŭ����");	//������ ���ܰ� �߻���
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

//����� ���� ����Ŭ����
// �Ϲݿ���Ŭ���� : Exception Ŭ������ ��ӹ޾� ����   -�̰� �ַ� ���� ���
// ���࿹��Ŭ���� : RuntimeException Ŭ������ ��ӹ޾� ����
class CustomException extends Exception{
	CustomException(){}
	
	CustomException(String message){
		super(message);
	}
}
