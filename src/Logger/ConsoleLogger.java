package Logger;

public class ConsoleLogger extends Logger{

    public ConsoleLogger(LoggerConfiguration loggerConfiguration) {
        super(loggerConfiguration);
    }

    public ConsoleLogger(LoggerConfigurationLoader LoggerConfigurationLoader) {
        super(LoggerConfigurationLoader);
    }

    public ConsoleLogger(LoggingLevel loggingLevel) {
        super(loggingLevel);
    }

    public ConsoleLogger() {
    }
}
