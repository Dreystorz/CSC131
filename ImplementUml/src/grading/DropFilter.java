package grading;

public class DropFilter implements Filter{
	private boolean shouldDropLowest;
	private boolean shouldDropHighest;
	
	public DropFilter() { }
	public DropFilter(boolean shouldDropLowest, boolean shouldDropHighest) { }
	public java.util.List<Grade> apply(java.util.List<grading.Grade> Grades) throws SizeException { return new java.util.LinkedList<Grade>();}
}
