import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BarGraph extends Graph {

	List<Point> data;
	boolean standardOrientation = true;
	
	BarGraph() {
		data = new ArrayList<Point>();
		standardOrientation = true;
	}

	public void insertPoint (Point point) {
		data.add(point);
	}

	public List<Point> getData() {return data;}

	public String getType () {return "BarGraph";}
}
