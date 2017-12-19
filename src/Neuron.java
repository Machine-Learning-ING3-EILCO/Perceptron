import java.util.ArrayList;

public class Neuron {
	double []  W;
	double threshold;
	int output;
	
	
	public Neuron(int nbEntree) { //nbEntrée reflète le nbr d'élement de X
		this.W= new double[nbEntree];
	}
	public double[] getW() {
		return W;
	}
	public void setW(double[] w) {
		W = w;
	}
	public double getThreshold() {
		return threshold;
	}
	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}
	public int getOutput() {
		return output;
	}
	public void setOutput(int output) {
		this.output = output;
	}
	
	public int predict(ArrayList<Double> X) {
	
		//implémentation de hw(x)
		int predict=-1;
		double hwX=0;
		//hwx=X*W;
		for (int i = 0; i < W.length; i++) {
			hwX=hwX+X.get(i)*W[i];
		}
		
		if(hwX<threshold) {
			predict=0;
		}
		else if(hwX>=threshold) {
			predict=1;
		}
		return  predict;
	}
	
	
	
}
