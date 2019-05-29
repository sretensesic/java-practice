package day_49_inheritance02;

public class AudioBook extends Book {
	private double length;
	public String narrator;
	
	public void listen() {
		//listen to Java book by sawitch and narrated by Murifjon
		System.out.println("Listening "+getTitle()+" by "+ getAuthor()+"  and narrated by "+ getNarrator());
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getNarrator() {
		return narrator;
	}
	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}
	@Override
	public String toString() {
		return "AudioBook [length=" + length + ", narrator=" + narrator + "]";
	}
	
}
