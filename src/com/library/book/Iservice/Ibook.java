/**
 * 
 */
package com.library.book.Iservice;

import com.library.book.model.BookModel;

/**
 * @author Saikrishna Gudla
 *
 */
public interface Ibook {
	
	String addBook(BookModel book);
	BookModel getBookByTitleAuth(String title,String author);
	int getCount();
	int removeBook(BookModel book);
	int returnBook(BookModel book);

}
