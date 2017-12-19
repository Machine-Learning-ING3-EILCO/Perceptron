
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataFrame df= new DataFrame("Scripts/Data/ex1.csv");
		System.out.println(df);
		
		Perceptron p = new Perceptron();
		//khtar3 neuron
		Neuron n= new Neuron(df.exemples.get(0).getX().size());
	
		System.out.println(n.toString());
		p.init(n);
		System.out.println(n.toString());
		p.train(n, df);
		System.out.println(n.toString());
		
		System.out.println(p);

	}

}
