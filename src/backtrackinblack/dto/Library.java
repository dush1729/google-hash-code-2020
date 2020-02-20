package backtrackinblack.dto;

import java.util.List;

public class Library {
	int numBooks;
	int signupDuration;
	int rateOfSendingBooks;
	List<Book> books;

	public Library(int numBooks, int signupDuration, int rateOfSendingBooks, List<Book> books) {
		super();
		this.numBooks = numBooks;
		this.signupDuration = signupDuration;
		this.rateOfSendingBooks = rateOfSendingBooks;
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [numBooks=" + numBooks + ", signupDuration=" + signupDuration + ", rateOfSendingBooks="
				+ rateOfSendingBooks + ", books=" + books + "]";
	}

}
