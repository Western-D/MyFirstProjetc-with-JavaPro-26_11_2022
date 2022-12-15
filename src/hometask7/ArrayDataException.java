package hometask7;

import java.util.ArrayList;
public class ArrayDataException extends MyException {
    public ArrayDataException(String exceptionMessage) {
        super(exceptionMessage);
    }
    private static ArrayList<String> exceptionsLog = new ArrayList<>();
    static void setLog(String log){
        exceptionsLog.add(log);
    }
    static ArrayList<String> getExceptionsLog() {
        return exceptionsLog;
    }
    static void printExceptionLog(){
        for (String line :
                exceptionsLog) {
            System.out.println(line);
        }
    }
    static void clearLog(){
        exceptionsLog.clear();
    }
}
