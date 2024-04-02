package library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import library.dto.Book;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Validated
@RestController
@RequestMapping(ControllerLibrary.REST_BASE_URL)
public class ControllerLibrary {
	public static final String REST_BASE_URL = "/api/v1";
	public static final String REST_BOOK_BY_ID = "/book/{bookId}";
	public static final String REST_HELLO = "/hello";
	
	private Book book;
	// url di richiamo dell'applicativo
	//	http://localhost:8080/library-service/api/v1/hello
	//	http://localhost:8080/library-service/api/v1/book/1
	
	public ControllerLibrary(Book book) {
		super();
		this.book= book;
	}
//	public ControllerLibrary() {
//		
//	}
	
//	@Operation(summary = "Get PlayerSession filtering by: playerSessionId")
//	@GetMapping(REST_BOOK_BY_ID)
//	public ResponseEntity<Book> getBookById(@PathVariable String bookId) {
//		log.info("getBookById input: {}", bookId);
//		return new ResponseEntity<Book>(book, HttpStatus.OK);
//	}
	
	@GetMapping(REST_HELLO)
	public ResponseEntity<Void> getHelloBook() {
		log.info("getHelloBook input: {}", "hello");
		return new ResponseEntity<Void>(HttpStatus.OK);
	}



}
