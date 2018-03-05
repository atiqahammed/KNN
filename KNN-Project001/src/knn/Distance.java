package knn;

public class Distance {
	private double distance;
	private String ans;

	public Distance(double distance, String ans) {
		this.distance = distance;
		this.ans = ans;
	}

	public double getDistance() {
		return distance;
	}
	public String getAns() {
		return ans;
	}
}
