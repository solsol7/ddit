package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class OrderDAO {
	private static OrderDAO instance=null;
	private OrderDAO() {}
	
	public static OrderDAO getInstance() {
		if(instance==null) instance=new OrderDAO();
		return instance;
	}
	
	JDBCUtil jdbc=JDBCUtil.getInstance();
	
	public List<Map<String, Object>> selectList(){
		String sql=" select * from tbl_prod ";
		return jdbc.selectList(sql);
	}
}
