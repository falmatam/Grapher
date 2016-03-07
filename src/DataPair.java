import java.util.ArrayList;
import java.util.List;


class DataPair implements Point {

	String xaxisLabel;
	String yaxisLabel;

	public List<String> getPoint() {
		List<String> list = new ArrayList<String>();
		list.add(0, xaxisLabel);
		list.add(1, yaxisLabel);
		return list;
	}

	@Override
	public String getXAxis() {	return xaxisLabel;}

	@Override
	public String getYAxis() {	return yaxisLabel;}
}
