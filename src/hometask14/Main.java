package hometask14;

public class Main {

    public static void main(String[] args) {
        FileData file1 = new FileData("file1", "C://ProgramFiles/files/3", 567);
        FileData file2 = new FileData("file2", "C://ProgramFiles/files/1", 58);
        FileData file3 = new FileData("file3", "C://ProgramFiles/files/3", 433);
        FileData file4 = new FileData("file4", "C://ProgramFiles/files/1", 1022);
        FileData file5 = new FileData("file5", "C://ProgramFiles/files/11", 86);
        FileData file6 = new FileData("file6", "C://ProgramFiles/files/11", 74);
        FileData file7 = new FileData("file7", "C://ProgramFiles/files/1", 300);
        FileData file8 = new FileData("file8", "C://ProgramFiles/files/2", 120);
        FileData file9 = new FileData("file9", "C://ProgramFiles/files/1", 42);
        FileData file10 = new FileData("file10", "C://ProgramFiles/files/5", 7);

        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add("C://ProgramFiles/files/3", file1);
        fileNavigator.add("C://ProgramFiles/files/1", file2);
        fileNavigator.add("C://ProgramFiles/files/3", file3);
        fileNavigator.add("C://ProgramFiles/files/1", file4);
        fileNavigator.add("C://ProgramFiles/files/11", file5);
        fileNavigator.add("C://ProgramFiles/files/11", file6);
        fileNavigator.add("C://ProgramFiles/files/1", file7);
        fileNavigator.add("C://ProgramFiles/files/2", file8);
        fileNavigator.add("C://ProgramFiles/files/1", file9);
        fileNavigator.add("C://ProgramFiles/files/5", file10);
        fileNavigator.add("C://ProgramFiles/files/10", file5);

        System.out.println(fileNavigator.find("C://ProgramFiles/files/1").toString());
        System.out.println(fileNavigator.filterBySize(400));
        System.out.println(fileNavigator.sortBySize());
        fileNavigator.remove("C://ProgramFiles/files/1");
        System.out.println(fileNavigator.find("C://ProgramFiles/files/1").toString());

    }
}
