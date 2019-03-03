package Question7;

import java.util.ArrayList;
import java.util.List;

public class DepartmantDirectory implements Directory {
    List<Directory> departmantDirectory = new ArrayList<Directory>();

    @Override
    public void directoryDetails() {
        System.out.println("Department Details");
        departmantDirectory.forEach(e -> e.directoryDetails());
    }
}
