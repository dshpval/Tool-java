package managers;

import models.Tool;

import java.util.List;

public interface ToolManagerFucntional {

    public List<Tool> sortToolsByPrice(boolean reverse);

    public List<Tool> findByWeight( double weight);

    public  List<Tool> findByMaterial( String material);

}
