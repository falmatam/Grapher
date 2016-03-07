import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;



class GraphDisplayer implements Displayer {

	public void setup(){}

	public void drawGraph() {}

	public void saveGraph(JFreeChart chart, Graph g) {
		try {
			//Edit path to save in desired directory
			String directory = "C:\\Users\\Public\\img" + g.getType() + g.title + ".jpg";
			ChartUtilities.saveChartAsJPEG(new File(directory), chart, 600, 350);
			System.out.println("Graph saved to " + directory);
		} catch (IOException e) {
			 System.err.println("Problem occurred creating chart.");
		 }
	}
}
