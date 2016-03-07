
class GraphDriver {

	GraphChooser 	chooser;
	Graph 			selectedGraph;
	DataReceiver 	receiver;
	Displayer 		visualizer;


	GraphDriver(){runCCC();}

	public void runCCC() {
		chooser = new ConsoleGraphChooser();
		selectedGraph = chooser.prompter();
		
		if (selectedGraph.getType().equals("BarGraph")) {
			receiver = new BarGraphDataIn(selectedGraph);
			visualizer = new BarGraphDisplayer(selectedGraph);
			System.out.println("BarGraph Created.");
		}
	}
}

