package com.onlinefoodorder;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Класс-наследник SpringBootServletInitializer, необходимый для корректной инициализации Spring Boot приложения
 * при запуске в контейнере сервлетов (например, на сервере приложений).
 */
public class ServletInitializer extends SpringBootServletInitializer {

	/**
	 * Переопределенный метод конфигурации, который указывает на основной класс Spring Boot приложения.
	 *
	 * @param application SpringApplicationBuilder, используемый для настройки и конфигурации приложения.
	 * @return SpringApplicationBuilder с указанием основного класса приложения.
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OnlineFoodOrderApplication.class);
	}

}
