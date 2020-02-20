package backtrackinblack.dto;

import java.util.List;

public class HashCodeInput {
	public int numBooks;
	public int numLibraries;
	public int scanDuration;
	public List<Library> libraries;

	public HashCodeInput(int numBooks, int numLibraries, int scanDuration, List<Library> libraries) {
		super();
		this.numBooks = numBooks;
		this.numLibraries = numLibraries;
		this.scanDuration = scanDuration;
		this.libraries = libraries;
	}

}
