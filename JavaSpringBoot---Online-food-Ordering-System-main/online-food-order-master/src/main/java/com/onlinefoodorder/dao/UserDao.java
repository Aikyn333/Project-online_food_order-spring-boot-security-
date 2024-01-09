package com.onlinefoodorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.onlinefoodorder.model.User;

/**
 * Интерфейс для работы с данными пользователей в базе данных.
 * Наследует функциональность JpaRepository для базовой работы с сущностью User.
 */
@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	/**
	 * Находит пользователя по электронной почте и паролю.
	 *
	 * @param emailId Электронная почта пользователя.
	 * @param password Пароль пользователя.
	 * @return Пользователь, соответствующий заданным электронной почте и паролю.
	 */
	User findByEmailidAndPassword(String emailId, String password);

	/**
	 * Находит пользователя по электронной почте.
	 *
	 * @param emailId Электронная почта пользователя.
	 * @return Пользователь с указанной электронной почтой или null, если пользователь не найден.
	 */
	User findByEmailid(String emailId);

	/**
	 * Находит пользователя по электронной почте и номеру мобильного телефона.
	 *
	 * @param emailId Электронная почта пользователя.
	 * @param mobileNo Номер мобильного телефона пользователя.
	 * @return Пользователь, соответствующий указанным электронной почте и номеру мобильного телефона.
	 */
	User findByEmailidAndMobileno(String emailId, String mobileNo);
}
