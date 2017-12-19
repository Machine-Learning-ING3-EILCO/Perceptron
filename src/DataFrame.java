import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataFrame {
	ArrayList<Data> exemples;

	

	public DataFrame() {
		
    	exemples = new ArrayList<Data>();
    	
	}
	
	public DataFrame(String nomFichier) {
    	
    	exemples = new ArrayList<Data>();
    	
    	try {
    	    File f = new File(nomFichier);
    	    Scanner scanner = new Scanner(f);
    	    
    			
    	    // les suivantes pour lire les exemples
    	    double v;
    	    while(scanner.hasNext()) {
    		Scanner sc = new Scanner(scanner.nextLine());
    		Data exemple = new Data();
    		ArrayList<Double> lireX = new ArrayList<Double>();

		// une boucle pour récupérer les valeurs des attributs 
    		while(sc.hasNext()) {
    			
    			for (int i = 0; i < 3; i++) {
    				if(i<2) {
        				v = sc.nextDouble();
        				lireX.add(v);
    				}
    				else if(i==2){
    					v = sc.nextDouble();
            		    exemple.setY((int)v);
    				}
    				exemple.setX(lireX);
				}
    			
    			/* General
    			v = sc.nextDouble();
				lireX.add(v);*/
    		    
    		}
    		/*General 2
    		exemple.setY((int) exemple.getX().get(exemple.getX().size() - 1));
    		exemple.X.remove(exemple.getX().size() - 1);*/
    		sc.close();
    		exemples.add(exemple);
    	    }
    	    
    	    scanner.close();

    	} catch (FileNotFoundException exception) {
    	    System.out.println("File not found");
    	}
    	
    	
        }


	
	public ArrayList<Data> getExemples() {
		return exemples;
	}

	public void setExemples(ArrayList<Data> exemples) {
		this.exemples = exemples;
	}

	@Override
	public String toString() {
		return "DataFrame [exemples=" + exemples + "]";
	}
	
	
}
