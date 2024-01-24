package designpatterns;

abstract class Logger{
	public static int OUTPUTINFO =1;
	public static int ERRORINFO = 2;
	public static int DEBUGINFO = 3;

int level;
Logger nextLevelLogger;
public Logger getNextLevelLogger() {
	return nextLevelLogger;
	
}
public void setNextLevelLogger(Logger nextLevelLogger) {
	 this.nextLevelLogger = nextLevelLogger;
}
public void logMessage(int level,String msg) {
	if(this.level<=level) {
		displayLogInfo(msg);
	}
	if(nextLevelLogger!= null) {
		nextLevelLogger.logMessage(level, msg);
	}
}
protected abstract void displayLogInfo(String msg);
}
class ConsoleBasedLogger extends Logger{
	public ConsoleBasedLogger(int level) {
		this.level = level;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("Console log info : "+msg);
		
	}
}
class ErrorBasedLogger extends Logger{
	public ErrorBasedLogger(int level) {
		this.level = level;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("Error log info : "+msg);
		
	}
}
class DebugBasedLogger extends Logger{
	public DebugBasedLogger(int level) {
		this.level = level;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("Debug log info : "+msg);
		
	}
}
public class ChainOfResponsibilityEx {
	
	static Logger doChaining() {
		Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);
		
		Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
		consoleLogger.setNextLevelLogger(errorLogger);
		
		Logger debugLogger = new DebugBasedLogger(Logger.ERRORINFO);
		errorLogger.setNextLevelLogger(debugLogger);
	    
		return consoleLogger;
	}

	public static void main(String[] args) {
		Logger chainLogger = doChaining();
		chainLogger.logMessage(Logger.OUTPUTINFO,"sucessfully completed");
		chainLogger.logMessage(Logger.ERRORINFO,"An error occured");
		chainLogger.logMessage(Logger.DEBUGINFO,"debugging is completed");
	}

}
