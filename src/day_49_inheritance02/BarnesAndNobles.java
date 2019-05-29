package day_49_inheritance02;

public class BarnesAndNobles {
	public static void main(String[] args) {
		EBook ebook = new EBook();
		ebook.setTitle("Introduction to Java");
		ebook.setAuthor("Savich");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Tech book"); 
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		System.out.println(ebook.getPrice());
		
		ebook.readEBook(10);
		ebook.readEBook(621);
		
		
		AudioBook audiobook = new AudioBook();
		audiobook.setTitle("OCA preparation");
		audiobook.setAuthor("Jeanne");
		audiobook.setNarrator("Murufjon");
		audiobook.listen();
		
		PaperBack pb = new PaperBack();
		pb.setAuthor("Malcolm Gladwell");
		pb.setTitle("Bitches");
		pb.toString();
		
		}
}
