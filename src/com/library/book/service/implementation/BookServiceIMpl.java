/**
 * 
 */
package com.library.book.service.implementation;

import java.util.ArrayList;
import java.util.List;

import com.library.book.Iservice.Ibook;
import com.library.book.model.BookModel;

/**
 * @author Saikrishna Gudla
 *
 */
public class BookServiceIMpl implements Ibook {
	List<BookModel> books =  new ArrayList<>();

	/* (non-Javadoc)O
	 * @see com.library.book.Iservice.Ibook#addBook(com.library.book.model.BookModel)
	 */
	public String addBook(BookModel book) {
		books.add(book);
		return "Sucess";
	}

	/* (non-Javadoc)
	 * @see com.library.book.Iservice.Ibook#getBookByTitleAuth(java.lang.String, java.lang.String)
	 */
	public BookModel getBookByTitleAuth(String title, String author) {
		
		return books.stream().filter(bk->bk.getTitle().equalsIgnoreCase(title)||bk.getAuthor().equalsIgnoreCase(title)).findFirst().get();
	}

	/* (non-Javadoc)
	 * @see com.library.book.Iservice.Ibook#getCount()
	 */
	public int getCount() {
		return books.size();
	}

	/* (non-Javadoc)
	 * @see com.library.book.Iservice.Ibook#removeBook(com.library.book.model.BookModel)
	 */
	public int removeBook(BookModel book) {
		for(int i = 0;i<books.size();i++){
			if(books.get(i).getBookId() == book.getId()){
				books.remove(i);
			}
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.library.book.Iservice.Ibook#returnBook(com.library.book.model.BookModel)
	 */
	public int returnBook(BookModel book) {
		// TODO Auto-generated method stub
		return 0;
	}

}
