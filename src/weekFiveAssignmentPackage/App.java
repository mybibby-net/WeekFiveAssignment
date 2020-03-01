package weekFiveAssignmentPackage;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger astLogger = new AsteriskLogger();
		astLogger.log("LOG METHOD STRING");
		astLogger.error("ERROR METHOD STRING");
		
		SpacedLogger spcLogger = new SpacedLogger();
		spcLogger.log("LOG METHOD STRING");
		spcLogger.error("ERROR METHOD STRING");
		
	}

}
