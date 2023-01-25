package hometask14;

public class FileData implements Comparable<FileData>{
    String name, path;
    int size;

    @Override
    public String toString() {
        return "FileData{" +
                "name='" + name + '\'' +
                '}';
    }

    public FileData(String name, String path, int size) {
        this.name = name;
        this.path = path;
        this.size = size;
    }

    public int compareTo(FileData o) {
        if (o.size == this.size)
            return 0;
        if (o.size > this.size)
            return -1;
        return 1;
    }
}
