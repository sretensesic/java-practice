package day_53_inheritance06;

public class Capital extends City {
	
	private long population;
	public int count = 1;
	
	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public Capital(int id, String name, long population) {
		super(id, name);
		this.population = population;
	}
	
	public void displayCount() {
		System.out.println("City count: "+super.count);
		System.out.println("Capital count: "+count);
	}
	
	public String toString() {
		return super.toString() + " |  population: " + population+ " count:"+ count;
	}
	

}
