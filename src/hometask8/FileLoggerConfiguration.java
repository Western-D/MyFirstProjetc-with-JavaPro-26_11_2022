package hometask8;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLoggerConfiguration {
    private String fileName;
    private LoggingLevel fileLoggingLevel = LoggingLevel.INFO;
    private int fileMaxSize = 1024;
    private String format = "%s \t(%s)\tmessage: %s\n";
    private String logsPath = "C:/Users/USER/IdeaProjects/MyFirstProjetc_with_JavaPro-26_11_2022/Logs/";


    public FileLoggerConfiguration() {
        setFileName();
    }
    public FileLoggerConfiguration(LoggingLevel fileLoggingLevel) {
        setFileName();
        this.fileLoggingLevel = fileLoggingLevel;
    }
    public FileLoggerConfiguration(int fileMaxSize, LoggingLevel loggingLevel) {
        setFileName();
        this.fileMaxSize = fileMaxSize;
        this.fileLoggingLevel = loggingLevel;
    }
    public FileLoggerConfiguration(FileLoggerConfigurationLoader fileLoggerConfigurationLoader) {
        this.logsPath = fileLoggerConfigurationLoader.getLogsPath();
        checkAndCreateFolder(logsPath);
        this.fileMaxSize = fileLoggerConfigurationLoader.getFileMaxSize();
        this.format = fileLoggerConfigurationLoader.getFormat();
        setFileLoggingLevel(fileLoggerConfigurationLoader.getFileLoggingLevel());
        setFileName();
    }


    public String getFileName() {
        return fileName;
    }
    public LoggingLevel getFileLoggingLevel() {
        return fileLoggingLevel;
    }
    public int getFileMaxSize() {
        return fileMaxSize;
    }
    protected String getActualPath()
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String actualPath = logsPath + getDate() + "/";
        checkAndCreateFolder(actualPath);
        return actualPath;
    }
    private String getTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH-mm-ss");
        return simpleDateFormat.format(new Date());
    }
    private String getDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(new Date());
    }

    public String getLogsPath() {
        return logsPath;
    }
    private void checkAndCreateFolder(String actualPath)
    {
        File folder = new File(actualPath);
        if (!folder.exists())
            folder.mkdir();
    }
    protected void createNewLogFile()
    {
        setFileName();
    }
    private void setFileName()
    {
        this.fileName = "Log_" + getTime();
    }

    public void setFileLoggingLevel(String fileLoggingLevel)
    {
        this.fileLoggingLevel = fileLoggingLevel.equals("INFO") ? LoggingLevel.INFO : LoggingLevel.DEBUG;
    }

    protected boolean checkFileMaxSize(){
        File file = new File(getActualPath() + fileName);
        return file.length() >= fileMaxSize;
    }

    protected String fileFormatToString(LoggingLevel loggingLevel, String message){
        return String.format(format+"\n", loggingLevel, getTime(), message);
    }
}

