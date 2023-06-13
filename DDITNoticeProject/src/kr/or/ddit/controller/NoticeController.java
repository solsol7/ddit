package kr.or.ddit.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import kr.or.ddit.service.LoginService;
import kr.or.ddit.util.View;

public class NoticeController {
	//�α��� �� ���� ó���� ������ �� ����� Map ����
	//����ڿ� ������ ���� �����������̶�� �����ϸ� �����ϴ�.
	public static Map<String, Object> sessionStorage = new HashMap<String, Object>();
	
	//��Ʈ�ѷ� �Ѹ����� ����ġ�⸦ �� service�� �θ���.
	//�α����� ������ �� ����� ���� ��ü�� �θ��� ���� �غ�
	LoginService loginService = LoginService.getInstance();
	
	//�������� ������ �˸��� �ý��� ������
	public static void main(String[] args) {
		new NoticeController().start(); //�������� �ý��� ����
	}

	public void start() {
		//�α��� ��, ������ �α��� ���� ����
		//�α��� ó���� ���������� ���� ������, login Ű�� �α��� �Ǿ��ٴ� flag���� true�� ����ؼ� �α��� ���°��� �������ش�.
		sessionStorage.put("login",false);	//�α��λ��� : �̷α���
		sessionStorage.compute("loginInfo", null);
		
		//���� �ý����� �������� ��, ó������ ��Ÿ������ �������� �ʿ��ѵ�
		//�� �༮�� HOME�̶�� �������� �̵��ϱ� ���ؼ� HOME�� ����
		int view = View.HOME;
		
		//�������� ��𼭵��� ���� ���ϴ� �޴��� �����ϱ� ���� ���ѷ���
		while(true) {
			switch (view) {
				case View.HOME:	view = home(); break;
				case View.MAIN:	view = mainPage(); break;
				case View.SIGNIN: view = loginService.SignIn(); break;
				case View.MYPAGE: view = myPage(); break;
				default: break;
			}
		}
	}
	//Ȩ ȭ���̸鼭 ù �޴��� �ش��ϴ� �޼ҵ带 ��Ʈ�ѷ����� �����Ѵ�.
	private int home() {
		System.out.println("::: ������簳�߿� �������� �Խ���");
		System.out.println("::: �߿��� ���� ������ Ȯ���� �� �ֽ��ϴ�.");
		System.out.println("::: �Ʒ� ���� �޴����� ���ϴ� �޴��� �������ּ���.");
		System.out.println("�������� [HOME MENU] ��������");
		System.out.println("1.�α���  2.ȸ������  3.���̵�ã��  4.��й�ȣã��");
		System.out.println("����������������������������������������������������");
		System.out.print("��ȣ�Է� >> ");
		
		Scanner sc=new Scanner(System.in);
		
		//�Է��� �޴� ��ȣ�� ���� ��ȣ�� �ش��ϴ� �޴��� �̵��Ѵ�.
		switch (sc.nextInt()) {
		case 1: return View.SIGNIN;
		case 2: return View.SIGNUP;
		case 3: return View.FINDID;
		case 4: return View.FINDPW;
		default: return View.HOME;
		}
		
	}
	
	//�α��� �� ����� ���� ȭ��
	private int mainPage() {
		//���� ��������� �ʰ�����, member��� ���� �ȿ� ����ִ�
		//������ ȸ���������� ������ ���������� ȸ�������� ��޿� ����
		//�޴��� �޸��� ���� �ְ� �ٸ� �̺�Ʈ�� ���� �� �ְ���??
		Map<String, Object> member=(Map<String, Object>)NoticeController.sessionStorage.get("loginInfo");
		
		System.out.println("��������������[MAIN MENU]������������");
		System.out.println("1.�������� 2.������");
		System.out.println("������������������������������������������������");
		System.out.print("��ȣ �Է� >>");
		
		Scanner sc=new Scanner(System.in);
		switch (sc.nextInt()) {
		case 1:return View.NOTICE_LIST;
		case 2:return View.MYPAGE;
		default: return View.HOME;
		}
	}
	
	private int myPage() {
		Map<String, Object> member=(Map<String, Object>)NoticeController.sessionStorage.get("loginInfo");
		
		System.out.println("������������[������]������������");
		System.out.println("��ID :"+ member.get("MEM_ID"));
		System.out.println("��PW :"+ member.get("MEM_PW"));
		System.out.println("���̸� :"+ member.get("MEM_NAME"));
		System.out.println("�Ἲ�� :"+ member.get("MEM_GENDER"));
		System.out.println("����� :"+ member.get("MEM_BIR"));
		System.out.println("���� :"+ member.get("MEM_GRADE"));
		System.out.print("��1.�ڷΰ���");
		System.out.print("���ȣ�Է� >> ");
		
		Scanner sc=new Scanner(System.in);
		switch (sc.nextInt()) {
		case 1: return View.MAIN;
		default: return View.HOME;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
