package Question7;

import java.util.ArrayList;
import java.util.List;

public class EngineerDirectory implements Directory {

    List<Directory> engineerDirectory = new ArrayList<Directory>();
    @Override
    public void directoryDetails() {
        System.out.println("Engineer diretory");
        engineerDirectory.forEach(e->e.directoryDetails());
    }
}
