package library.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Component

/*		NOTA 
 * avevo questo errore che non mi permetteva di istanziare il bean
 * Parameter 0 of constructor in library.dto.Book required a bean of type 'java.lang.Long' 
 * that could not be found.
 * 
 * l'errore era generato dalla presenza di AllArgsConstructor di Lombok
 * ho risolto aggiungendo un cotruttore di default
 */
@AllArgsConstructor
@Data
public class Book {

	private Long id;
	private String title;
	private Persona persona;
	private Double price;
	static int stock;
	
	public Book() {
		super();
	}
	
	public Book(long id, String title, Persona persona, double price) {
		this.id=id;
		this.title=title;
		this.persona=persona;
		this.price=price;
	}
	
}
