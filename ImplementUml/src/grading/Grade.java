package grading;

public class Grade implements Comparable<grading.Grade>{
	private java.lang.String key;
	private java.lang.Double value;
	
	public Grade(java.lang.String key) throws IllegalArgumentException { }
	public Grade(java.lang.String key, double value) throws IllegalArgumentException { }
	public Grade(java.lang.String key, java.lang.Double value) throws IllegalArgumentException { }
	public java.lang.String getKey() { return key;}
	public java.lang.Double getValue() { return value;}
	public java.lang.String toString() { return key;}
	public int compareTo(grading.Grade other) { return 0;}
}
