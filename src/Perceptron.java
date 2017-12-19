
public class Perceptron {
	
	
	
	public Perceptron() {
	}

	public void init(Neuron n) {
		n.setThreshold(0.5);
		double rands[] = new double[n.getW().length];
		for (int i = 0; i < n.getW().length; i++) {
			rands[i] = Math.random();
		}
		n.setW(rands);
	}
	
	public void train(Neuron n, DataFrame df) {
		double alpha = 0.1;
		double errorRate =n.errorRate(df);
		while(errorRate!=0) {
		Data exemple=df.getExemples().get((int)(Math.random())*df.getExemples().size());
		n.predict(exemple.getX());
		if(n.output != exemple.getY()) {
			for (int i = 0; i < n.W.length; i++) {
				n.W[i] = n.W[i] + alpha*(exemple.getY() - n.getOutput()) * exemple.getX().get(i);
				//A regler : le taux d'erreur delta W = Y - hwX
			}
			n.threshold = n.threshold + alpha*(exemple.getY()- n.getOutput());
		}
		}errorRate = n.errorRate(df);
	}

	@Override
	public String toString() {
		return "Perceptron [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
