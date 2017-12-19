import java.util.*;
public class Data {
	ArrayList<Double> X;
	int Y;
	public ArrayList<Double> getX() {
		return X;
	}
	public void setX(ArrayList<Double> x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	public Data(ArrayList<Double> x, int y) {
		super();
		X = x;
		Y = y;
	}
	public Data() {
		super();
	}
	@Override
	public String toString() {
		return "Data [X=" + X + ", Y=" + Y + "]";
	}
	
	
}
