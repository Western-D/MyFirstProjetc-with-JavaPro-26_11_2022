package hometask8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLoggerConfigurationLoader{
    private String fileLoggingLevel;
    private int fileMaxSize;
    private String format;
    private String logsPath;
    public FileLoggerConfigurationLoader(String path) {
        Scanner configurationReader;
        try {
            configurationReader = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        logsPath = configurationReader.nextLine();

        fileLoggingLevel = configurationReader.nextLine();
        fileMaxSize = Integer.parseInt(configurationReader.nextLine());
        format = configurationReader.nextLine();
    }
    public String getFileLoggingLevel() {
        return fileLoggingLevel;
    }

    public int getFileMaxSize() {
        return fileMaxSize;
    }

    public String getFormat() {
        return format;
    }

    public String getLogsPath() {
        return logsPath;
    }
}
