package site.metacoding.firstapp.domain;

import java.util.List;

public interface OrdersDao {
	public Orders findById(Integer ordersId);
	public List<Orders> findAll();
	public void insert(Orders orders);
	public void update(Orders orders);
	public void delete(Integer ordersId);
}