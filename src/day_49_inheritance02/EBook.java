package day_49_inheritance02;

public class EBook extends Book {

	public int pages;
	private int size;
	
	public void readEBook(int pageNum) {
		//Reading java book by Savitch at page 10
		System.out.println("Reading "+ getTitle()+"by "+getAuthor()+"at page "+pageNum);
	}
	
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "AudioBook [pages=" + pages + ", size=" + size + "]";
	}
	
	
	
}
