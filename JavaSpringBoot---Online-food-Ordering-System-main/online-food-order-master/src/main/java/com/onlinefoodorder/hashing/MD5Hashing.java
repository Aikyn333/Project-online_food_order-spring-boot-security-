package com.onlinefoodorder.hashing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Hashing {

	/**
	 * Метод для создания MD5 хэша от переданной строки.
	 *
	 * @param password Строка, которую необходимо хэшировать.
	 * @return Хэш в виде строки в формате MD5.
	 */
	public static String doHashing(String password) {
		StringBuilder sb = null;
		try {
			// Инициализация объекта для вычисления MD5 хэша
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");

			// Обновление объекта MessageDigest данными из строки пароля
			messageDigest.update(password.getBytes());

			// Вычисление MD5 хэша
			byte[] resultByteArray = messageDigest.digest();

			// Преобразование байтового массива хэша в строку в формате hex
			sb = new StringBuilder();
			for (byte b : resultByteArray) {
				sb.append(String.format("%02x", b));
			}

		} catch (NoSuchAlgorithmException e) {
			// В случае ошибки алгоритма хэширования выводим стек трейс ошибки
			e.printStackTrace();
		}

		// Возвращаем хэш в виде строки
		return sb.toString();
	}
}
