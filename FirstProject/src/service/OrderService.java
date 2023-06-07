package service;

import java.util.List;
import java.util.Map;

import dao.OrderDAO;
import util.ProdView;

public class OrderService {
	private static OrderService instance;
	private OrderService() {}
	
	ProdView prodView=ProdView.getInstance();
	private OrderDAO dao=OrderDAO.getInstance();
	
	public static OrderService getInstance() {
		if(instance==null) instance=new OrderService();
		return instance;
	}
	
	public void selectProd() {
		List<Map<String, Object>> list=dao.selectList();
		prodView.displayProd(list);
		System.out.println("-----------------------------------------");
		System.out.println();
	}
}