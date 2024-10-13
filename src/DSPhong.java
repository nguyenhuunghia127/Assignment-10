
package assignment.pkg12;

import java.util.ArrayList;
import java.util.List;


public class DSPhong {
    private List<Phong> list;

    public DSPhong(List<Phong> list) {
        this.list = list;
    }

    public DSPhong() {
        this.list=new ArrayList<>();
    }
    public void themPhong(Phong phong){
        list.add(phong);
    }
}
