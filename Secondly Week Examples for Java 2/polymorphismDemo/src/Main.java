import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
//		EmailLogger logger = new EmailLogger();
//		logger.Log("gkot4864e@hotmail.com");

//		BaseLogger[] loggers = new BaseLogger[] { new DatabaseLogger(), new FileLogger(), new EmailLogger(),
//				new ConsoleLogger() }; //plag and play : tak - �al��t�r.
//
//		for (BaseLogger baseLogger : loggers) {
//			baseLogger.Log("Log mesaj�");
//		}

		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
