package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class LoginDAO {
	private static LoginDAO instance=null;
	private LoginDAO() {}
	
	public static LoginDAO getInstance() {
		if(instance==null) instance=new LoginDAO();
		return instance;
	}
	
	JDBCUtil jdbc=JDBCUtil.getInstance();
	
	public Map<String, Object> login(String id, String pass){
		String sql="select * from tbl_member where mem_id=?";
		sql=sql+" and mem_pass=?";
		List<Object> param=new ArrayList<Object>();
		param.add(id);
		param.add(pass);
		
		return jdbc.selectOne(sql, param);
	}
}
