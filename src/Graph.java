import java.util.List;


abstract class Graph {

	String title;
	String xaxisLabel;
	String yaxisLabel;
	List<Point> data;

	public void insertPoint (Point point) {}

	public List<Point> getData() {return null;}

	public String getType() {return null;}

}
