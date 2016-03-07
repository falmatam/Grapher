import java.util.Scanner;


class ConsoleGraphChooser implements GraphChooser {

	@Override
	public Graph prompter() {
		Scanner scanInput = new Scanner(System.in);
		String graphType = scanInput.nextLine();
		if (graphType.equalsIgnoreCase("BarGraph"))
			return new BarGraph();
		else {
			System.out.println("Input BarGraph.");
			return null;
		}
	}
}