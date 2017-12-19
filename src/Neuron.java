import java.util.ArrayList;
import java.util.Arrays;

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
	
	public double errorRate(DataFrame df) {
		double error=0; double errorRate=0;
		int cpt=0; //nbr d'erreur
		//appeler pour chaque ligne d'entrée du df la fonction predict
		//comparer le return de predict avec la valeur y correspondante dans le fichier csv

		for (int index = 0; index <df.getExemples().size(); index++) {
			if(predict(df.getExemples().get(index).getX()) != df.getExemples().get(index).getY()) {
				error= predict(df.getExemples().get(index).getX()) - df.getExemples().get(index).getY();
				cpt++;
			}
			errorRate=cpt/df.getExemples().size();
		}
		
		return errorRate;
	}
	@Override
	public String toString() {
		return "Neuron [W=" + Arrays.toString(W) + ", threshold=" + threshold + ", output=" + output + "]";
	}
	
}
