import java.util.ArrayList;
import java.util.List;

class MakeAGraph {

	static GraphDriver driver;
	static List<String> graphTypes;

	public static void main(String[] args) {
		graphTypes = new ArrayList<String>();
		graphTypes.add("BarGraph");


		System.out.println("Enter '"+ graphTypes.get(0) + "' to begin: ");
		
		driver = new GraphDriver();
	}

}
