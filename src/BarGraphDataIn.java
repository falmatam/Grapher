import java.util.Scanner;


class BarGraphDataIn extends ConsoleDataReceiver {
	
	Graph graph;

	BarGraphDataIn(Graph graph) {
		this.graph = graph;
		receiveData();
	}

	public void displayOptions(){};


	public void receiveData() {
		@SuppressWarnings("resources")
		Scanner scanInput = new Scanner(System.in);
		graph.title 		= "Assignment 4";
		graph.xaxisLabel 	= "Date";
		graph.yaxisLabel 	= "Score";
		
		String n = "";
		while (n.equalsIgnoreCase("end")!=true) {
			DataPair dataPair = new DataPair();
			System.out.println("Insert x-value (Ex: Date as MM/DD/YYYY). Type 'end' when done: ");
			n = scanInput.nextLine();
			if (n.equalsIgnoreCase("end"))
				break;
			dataPair.xaxisLabel = n;
			System.out.println("Insert y-value (Ex: Score): ");
			dataPair.yaxisLabel = scanInput.nextLine();
			graph.insertPoint((Point)dataPair);
		}
	}
}
