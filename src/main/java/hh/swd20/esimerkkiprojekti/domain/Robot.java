package hh.swd20.esimerkkiprojekti.domain;

public class Robot {

	private String robotModel;
	private int robotSerial;
	
	public Robot() {
		super();
		this.robotModel = null;
		this.robotSerial = 0;
	}
	
	public Robot(String robotModel, int robotSerial) {
		super();
		this.robotModel = robotModel;
		this.robotSerial = robotSerial;
	}

	public void setRobotModel(String robotModel) {
		this.robotModel = robotModel;
	}

	public void setRobotSerial(int robotSerial) {
		this.robotSerial = robotSerial;
	}

	public String getRobotModel() {
		return robotModel;
	}

	public int getRobotSerial() {
		return robotSerial;
	}

	@Override
	public String toString() {
		return "Robot [robotModel=" + robotModel + ", robotSerial=" + robotSerial + "]";
	}
	
}
