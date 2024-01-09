package com.onlinefoodorder.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.onlinefoodorder.model.Food;

/**
 * Интерфейс для доступа к данным продуктов питания.
 */
@Repository
public interface FoodDao extends JpaRepository<Food, Integer> {

	/**
	 * Находит продукты питания по части имени (без учета регистра).
	 *
	 * @param name Часть имени продукта.
	 * @return Список продуктов, соответствующих заданному имени.
	 */
	List<Food> findByNameContainingIgnoreCase(String name);

	/**
	 * Находит продукты питания по идентификатору категории.
	 *
	 * @param categoryId Идентификатор категории продукта.
	 * @return Список продуктов, относящихся к указанной категории.
	 */
	List<Food> findByCategoryId(int categoryId);

	/**
	 * Удаляет продукты питания по идентификатору категории.
	 *
	 * @param categoryId Идентификатор категории продукта.
	 */
	@Query(value="delete from Food f where f.categoryId = :categoryId")
	void deleteProductByCategoryId(@Param("categoryId") int categoryId);
}
