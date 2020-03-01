package weekFiveAssignmentPackage;

public class AsteriskLogger implements Logger {
	
	private String log;
	private String error;
	private StringBuilder asteriskBox;
	private StringBuilder asteriskErrorString;
	
	@Override
	public void log(String log) {
		this.log = log;
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		this.error = error;
		asteriskBox = new StringBuilder("\n*");
		asteriskErrorString = new StringBuilder("ERROR: ");
		asteriskErrorString.append(error);
		
		for (int i = 0; i < asteriskErrorString.length() + 5; i++) {
			asteriskBox.append('*');	
		}
		
		asteriskBox.append("\n");
		System.out.println(asteriskBox + "***" + asteriskErrorString + "***" + asteriskBox);
		
	}
	
	public String getLog() {
		return log;
	}
	
	public String getError() {
		return error;
	}
	
	
}
