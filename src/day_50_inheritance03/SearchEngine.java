package day_50_inheritance03;

public class SearchEngine {
	public int search(String item) {
		System.out.println("Searching for item: "+ item);
		int resultsCount = item.length();
		return resultsCount;
	}
	protected void search(String item, String item2) {
		System.out.println("Searching for 2 items: "+ item);
		int resultsCount = item.length();
		System.out.println("Total count: "+ resultsCount);	
	}
	
	String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}

}
