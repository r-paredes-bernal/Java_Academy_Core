package academy.core.session6.streams.peek;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HarryPotter {

	public HarryPotter() {
	}

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(
				new Book("Harry Potter", Book.Category.FICTION),
				new Book("Fast and Forious", Book.Category.ACTION )
		);
		
		books.stream()
					.peek( b -> System.out.println(b.getTitle()))
					.filter( b -> b.getCategory().equals(Book.Category.FICTION))
					.collect(Collectors.toList());
		
		// Collect, Count, Max, Min, Reduce
	}
	

}

class Book {
	private String title;
	private Category category;
	
	Book(String name, Category category ){
		this.title = name;
		this.category = category;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	static enum Category {
		FICTION, ACTION
	};
}
