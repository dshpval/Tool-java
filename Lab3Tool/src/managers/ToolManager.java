package managers;

import models.Tool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ToolManager implements ToolManagerFucntional {

    private List<Tool> tools;

    public ToolManager(List<Tool> tools) {
        this.tools = tools;
    }

    @Override
    public List<Tool> sortToolsByPrice(boolean reverse) {
        if(!reverse){
            tools.sort(Comparator.comparingDouble((Tool o) -> o.getPrice()));
        }else {
            tools.sort(Collections.reverseOrder(Comparator.comparingDouble((Tool o) -> o.getPrice())));
        }
        return tools;
    }

    @Override
    public List<Tool> findByWeight(double weight) {
        List<Tool> foundList = new ArrayList<>();

        for(int i = 0;i < this.tools.size(); i++){
            if(this.tools.get(i).getWeight() == weight){
                foundList.add(this.tools.get(i));
            }
        }

        return foundList;
    }

    @Override
    public List<Tool> findByMaterial( String material) {
        List<Tool> foundList = new ArrayList<>();

        for(int i = 0;i < this.tools.size(); i++){
            if(this.tools.get(i).getMaterial() == material){
                foundList.add(this.tools.get(i));
            }
        }

        return foundList;
    }
}
