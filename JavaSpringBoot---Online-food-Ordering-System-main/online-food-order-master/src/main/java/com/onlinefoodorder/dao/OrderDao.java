package com.onlinefoodorder.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.onlinefoodorder.model.Orders;

/**
 * Интерфейс для доступа к данным заказов.
 */
@Repository
public interface OrderDao extends JpaRepository<Orders, Integer> {

	/**
	 * Находит заказы по идентификатору заказа.
	 *
	 * @param orderId Идентификатор заказа.
	 * @return Список заказов с заданным идентификатором.
	 */
	List<Orders> findByOrderId(String orderId);

	/**
	 * Находит заказы по идентификатору пользователя.
	 *
	 * @param userId Идентификатор пользователя.
	 * @return Список заказов, сделанных указанным пользователем.
	 */
	List<Orders> findByUserId(int userId);

	/**
	 * Находит заказы по дате заказа.
	 *
	 * @param orderDate Дата заказа.
	 * @return Список заказов, сделанных в указанную дату.
	 */
	List<Orders> findByOrderDate(String orderDate);

	/**
	 * Находит заказы по дате заказа и идентификатору пользователя.
	 *
	 * @param orderDate Дата заказа.
	 * @param userId Идентификатор пользователя.
	 * @return Список заказов, сделанных указанным пользователем в указанную дату.
	 */
	List<Orders> findByOrderDateAndUserId(String orderDate, int userId);
}
