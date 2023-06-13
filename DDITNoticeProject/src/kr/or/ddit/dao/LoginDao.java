package kr.or.ddit.dao;

import java.util.Map;

import kr.or.ddit.util.JDBCUtil;

public class LoginDao {
	private static LoginDao instance = null;
	private LoginDao() {}

	public static LoginDao getInstance() {
		if(instance==null) instance = new LoginDao();
		return instance;
	}
	
	JDBCUtil jdbc=JDBCUtil.getInstance();
	
	//�α��� ���
	//���̵�, ��й�ȣ�� ��ġ�ϴ� ȸ�������� ���Ϲ޴´�.
	//���� ���� ȸ�������� Map�ȿ� ���εǾ� ���޹޴´�.
	
	public Map<String, Object> signIn(String id, String pw){
		String sql=" SELECT MEM_KEY, MEM_ID, MEM_PW, MEM_NAME, "+
					" MEM_BIR, MEM_GENDER, GRADE FROM MEMBER "+
					" WHERE MEM_ID = '"+id+"' AND MEM_PW = '"+pw+"' ";
		return jdbc.selectOne(sql)
	}
}
