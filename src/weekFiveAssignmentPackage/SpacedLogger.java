package weekFiveAssignmentPackage;

public class SpacedLogger implements Logger{
	
	private String log;
	private String error;
	private StringBuilder spacedError;
	
	@Override
	public void log(String log) {
		this.log = log;
		System.out.println(log.replace("", " "));
	}
	
	@Override
	public void error(String error) {
		this.error = error;
		spacedError = new StringBuilder("ERROR: ");
		spacedError.append(error.replace("", " "));
		System.out.println(spacedError);
	}
	
	public String getLog() {
		return log;
	}
	
	public String getError() {
		return error;
	}

	
	
}
