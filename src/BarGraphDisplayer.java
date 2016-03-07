import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


class BarGraphDisplayer extends GraphDisplayer {

	BarGraph graph;
	DefaultCategoryDataset dataset;

	BarGraphDisplayer(Graph graph) {
		this.graph = (BarGraph) graph;
		dataset = new DefaultCategoryDataset();

		run();
	}

	public void run() {
		for(int i = 0; i < graph.getData().size(); i++) {
            dataset.setValue(Integer.valueOf(graph.getData().get(i).getYAxis()), graph.yaxisLabel,graph.getData().get(i).getXAxis());
        }

		drawGraph(PlotOrientation.VERTICAL);

	}

	private void drawGraph(PlotOrientation p) {
		JFreeChart chart = ChartFactory.createBarChart(graph.title, graph.xaxisLabel, graph.yaxisLabel, dataset, p, false, false, false);
		saveGraph(chart, graph);
	}

}
