package library.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import library.dto.Book;
import library.dto.Persona;

@Configuration
public class LibraryConfiguration {
	
	@Bean
	public Persona getPersona() {
		return new Persona(  );
	}
	
	
	@Bean
	public Book getBook() {
		return new Book( );
	}
	
	@Bean
	//NOTA: Non serve il qualifier, di default il nome del bean è quello del metodo
//	@Qualifier("defaultPersona")	
	public Persona getDefaultPersona() {
		return new Persona( "J.K", "Rowling", "F" );
	}
	
	
	@Bean
	// L'ho usato in LibraryApplication
//	@Qualifier("defaultBook")
	public Book getDefaultBook() {
		return new Book(1L, "Harry Potter", this.getDefaultPersona(), 11.0);
	}
	
}
