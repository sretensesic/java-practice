package day_47_blocks;

public class AllBlocksTest {
	public static void main(String[] args) {
		AllBlocks all1 = new AllBlocks();
		AllBlocks all2 = new AllBlocks();
		System.out.println(all1.nonStaticInt);
		System.out.println(all2.staticInt);
		
		System.out.println(all1.nonStaticInt);
		System.out.println(all2.staticInt);
	}
}
