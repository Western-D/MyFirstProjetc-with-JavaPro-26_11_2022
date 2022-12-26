package hometask8;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        FileLoggerConfigurationLoader fileLoggerConfigurationLoaded = new FileLoggerConfigurationLoader("C:/Users/USER/Desktop/Configuration.txt");
        FileLogger fileLogger = new FileLogger(fileLoggerConfigurationLoaded);
        for (int i = 0; i < 60; i++) {
            if (i%2 == 0)
                fileLogger.toLogInDebug("some debug message");
            else
                fileLogger.toLogInInfo("some info message");
            Thread.sleep(20);
        }
    }
}
