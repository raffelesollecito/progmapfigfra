package kmeans;

class ContinuousAttribute extends Attribute {
	//attributi
	private double max;
	private double min;
	
	ContinuousAttribute(String name, int index, double min, double max){
		super(name,index);
		this.min = min;
		this.max = max;
	}
	
	double getScaledValue(double v) {
		return (v-min)/(max-min);
	}
	
}
