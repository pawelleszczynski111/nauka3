package nauka3;

import java.util.ArrayList;
import java.util.List;

public class HDDDrive implements Drive {
    List<File>files= new ArrayList<>();

    @Override
    public void addfile(File file) {
        files.add(file);
    }

    @Override
    public void listFiles() {
//        files.forEach(System.out::println);
        for (File file: files){
            System.out.println(file);




        }
    }
}
