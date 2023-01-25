package hometask14;

import java.util.*;

public class FileNavigator {
    private Map<String, List<FileData>> fileBase = new HashMap<>();

    public void add (String path, FileData file){
        if(path.equals(file.path)){
            if(fileBase.containsKey(path)){
                fileBase.get(path).add(file);
            }
            else {
                List<FileData> list = new ArrayList<>();
                list.add(file);
                fileBase.put(path, list);
            }
        }
        else {
            System.err.println("Невозможно добавить файл по указоннаму адрессу!");
            System.err.println("Заданный адресс: " + path);
            System.err.println("Допустимый адресс файла: " + file.path);
        }
    }
    public List find (String path){
        if(fileBase.containsKey(path))
            return fileBase.get(path);
        List <String> noDataList = new ArrayList<>();
        noDataList.add("No Data");
        return noDataList;
    }
    public List filterBySize (int size){
        List<FileData> files = new ArrayList<>();
        for (Map.Entry<String,List<FileData>> map:
                fileBase.entrySet()) {
            for (FileData file :
                    map.getValue()) {
                if(file.size <=size)
                    files.add(file);
            }
        }
        return files;
    }
    public void remove (String path){
        fileBase.remove(path);
    }
    public List sortBySize () {
        List<FileData> files = new ArrayList<>();
        for (Map.Entry<String, List<FileData>> map :
                fileBase.entrySet()) {
            files.addAll(map.getValue());
        }
        Collections.sort(files);
        return files;
    }

}
