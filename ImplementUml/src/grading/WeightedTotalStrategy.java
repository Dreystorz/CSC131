package grading;

public class WeightedTotalStrategy implements GradingStrategy{
	private java.util.Map<java.lang.String, java.lang.Double> weights;
	
	public WeightedTotalStrategy() { }
	public WeightedTotalStrategy(java.util.Map<java.lang.String, java.lang.Double> weights) { }
	public grading.Grade calculate(String key, java.util.List<grading.Grade> grades) throws SizeException { return new grading.Grade("temp");}
}
