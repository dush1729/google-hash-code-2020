package backtrackinblack.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import backtrackinblack.dto.Book;
import backtrackinblack.dto.HashCodeInput;
import backtrackinblack.dto.Library;

public class Main {
	public static void main(String[] args) throws IOException {
		HashCodeInput input = fetchInput("E:\\google-hash-code-2020\\src\\inputs\\a_example.txt");
		System.out.println(input.numBooks);
		System.out.println(input.numLibraries);
		System.out.println(input.scanDuration);
		input.libraries.forEach(System.out::println);
	}

	static HashCodeInput fetchInput(String inputFile) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int numBooks = Integer.parseInt(st.nextToken());
			int numLibraries = Integer.parseInt(st.nextToken());
			int scanDuration = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			List<Book> books = new ArrayList<>();
			for (int id = 0; id < numBooks; id++) {
				int score = Integer.parseInt(st.nextToken());
				books.add(new Book(id, score));
			}
			List<Library> libraries = new ArrayList<Library>();
			int cntr = numLibraries;
			while (cntr-- > 0) {
				st = new StringTokenizer(br.readLine());
				int totalBooks = Integer.parseInt(st.nextToken());
				int signupDuration = Integer.parseInt(st.nextToken());
				int rateOfSendingBooks = Integer.parseInt(st.nextToken());
				List<Book> booksInLibrary = new ArrayList<Book>();
				st = new StringTokenizer(br.readLine());
				while (st.hasMoreTokens()) {
					int id = Integer.parseInt(st.nextToken());
					booksInLibrary.add(books.get(id));
				}
				libraries.add(new Library(totalBooks, signupDuration, rateOfSendingBooks, booksInLibrary));
			}
			return new HashCodeInput(numBooks, numLibraries, scanDuration, libraries);
		}
	}

	static void printOutput(String res) throws IOException {
		final String outputFile = "E:\\java-ws-1\\myStuff\\src\\myStuff\\inputs\\out.txt";
		try (PrintWriter out = new PrintWriter(new FileWriter(outputFile))) {
			out.print(res);
			out.flush();
		}
	}
}
