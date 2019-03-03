package Question7;

import java.util.ArrayList;
import java.util.List;

public class HumanResourceDirectory implements Directory {

    List<Directory> humanResourceDirectory=new ArrayList<Directory>();

    @Override
    public void directoryDetails() {
        System.out.println("Human Resource Directory Detail");
        humanResourceDirectory.forEach(e->e.directoryDetails());
    }
}
