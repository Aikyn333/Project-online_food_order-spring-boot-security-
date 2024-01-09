package com.onlinefoodorder.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinefoodorder.model.Cart;

/**
 * Интерфейс для доступа к данным корзины товаров.
 */
@Repository
public interface CartDao extends JpaRepository<Cart, Integer> {

	/**
	 * Находит все товары в корзине для определенного пользователя.
	 *
	 * @param userId Идентификатор пользователя.
	 * @return Список товаров в корзине для указанного пользователя.
	 */
	List<Cart> findByUserId(int userId);

	/**
	 * Подсчитывает количество товаров в корзине для определенного пользователя.
	 *
	 * @param userId Идентификатор пользователя.
	 * @return Количество товаров в корзине для указанного пользователя.
	 */
	Long countByUserId(int userId);
}
