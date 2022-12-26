package hometask8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends FileLoggerConfiguration{

    public FileLogger(int fileMaxSize, LoggingLevel loggingLevel) {
        super(fileMaxSize, loggingLevel);
    }

    public FileLogger(FileLoggerConfigurationLoader fileLoggerConfigurationLoader) {
        super(fileLoggerConfigurationLoader);
    }

    public FileLogger(LoggingLevel loggingLevel) {
        super(loggingLevel);
    }

    public void toLogInInfo(String logMessage){
        writeLogMessage(logMessage,LoggingLevel.INFO);
    }
    public void toLogInDebug(String logMessage){
        if (getFileLoggingLevel() == LoggingLevel.DEBUG)
            writeLogMessage(logMessage,LoggingLevel.DEBUG);
    }
    private void writeLogMessage(String logMessage, LoggingLevel loggingLevelMessage){
        try (BufferedWriter logWriter = new BufferedWriter(new FileWriter(getActualPath() + getFileName(), true))){
            logWriter.write(fileFormatToString(loggingLevelMessage, logMessage));
            if (checkFileMaxSize())
                createNewLogFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
