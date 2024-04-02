package library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import library.config.LibraryConfiguration;
import library.controller.ControllerLibrary;
import library.dto.Book;

@SpringBootApplication(scanBasePackages = "library")
public class LibraryApplication {

	private static Logger logger = LoggerFactory.getLogger(LibraryApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
		logger.info("Library application finally started");
		logger.info("trying to use a Bean od type book");
		ApplicationContext ctx = new AnnotationConfigApplicationContext( LibraryConfiguration.class );

//		Book book = ctx.getBean( Book.class );
		Book book = ctx.getBean( "getDefaultBook", Book.class );
		
		logger.info("Il libro instanziato tramite bean è:{}", book);

	}

}
