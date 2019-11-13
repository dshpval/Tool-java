package ua.lviv.iot;

import ua.lviv.iot.managers.ToolManager;
import ua.lviv.iot.models.Saw;
import ua.lviv.iot.models.Scrap;
import ua.lviv.iot.models.SmallInfantryShovel;
import ua.lviv.iot.models.Tool;
import ua.lviv.iot.models.SapperShovel;
import ua.lviv.iot.models.Purpose;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {

        SmallInfantryShovel smallInfantryShovel = new SmallInfantryShovel();
        Scrap scrap = new Scrap();
        Saw saw = new Saw();
        SapperShovel sapperShovel = new SapperShovel();

        smallInfantryShovel.setWeight(1.0);
        smallInfantryShovel.setPrice(10.20);
        smallInfantryShovel.setCountryOfOrigin("Ukraine");
        smallInfantryShovel.setManufacturer("Bell");
        smallInfantryShovel.setMaterial("Rubber");
        smallInfantryShovel.setYearsOfWarranty(3);
        smallInfantryShovel.setPurpose(Purpose.GROUND);
        smallInfantryShovel.setHandleLength(2);

        scrap.setWeight(2);
        scrap.setPrice(20.20);
        scrap.setCountryOfOrigin("Russia");
        scrap.setManufacturer("Algo");
        scrap.setMaterial("Wood");
        scrap.setYearsOfWarranty(4);
        scrap.setPurpose(Purpose.WOOD_AND_BRANCHES);

        saw.setWeight(3);
        saw.setPrice(120.50);
        saw.setCountryOfOrigin("America");
        saw.setManufacturer("Apple");
        saw.setMaterial("Poleulitan");
        saw.setYearsOfWarranty(1);
        saw.setPurpose(Purpose.SNOW);

        sapperShovel.setWeight(4);
        sapperShovel.setPrice(40.50);
        sapperShovel.setCountryOfOrigin("China");
        sapperShovel.setManufacturer("ChinaProd");
        sapperShovel.setMaterial("Plastic");
        sapperShovel.setYearsOfWarranty(10);
        sapperShovel.setPurpose(Purpose.GRASS);

        List<Tool> tools = new ArrayList<>();
        tools.add(sapperShovel);
        tools.add(scrap);
        tools.add(saw);
        tools.add(smallInfantryShovel);

        ToolManager toolManager = new ToolManager(tools);
        List<Tool> foundMaterial = toolManager.findByMaterial("Wood");
        for (int i = 0; i < foundMaterial.size(); i++) {
            System.out.println(foundMaterial.get(i).getMaterial());
        }

        List<Tool> foundWeight = toolManager.findByWeight(4);
        for (int i = 0; i < foundWeight.size(); i++) {
            System.out.println(foundWeight.get(i).getWeight());
        }

        List<Tool> sortedByPrice = toolManager.sortToolsByPrice(false);
        for (int i = 0; i < sortedByPrice.size(); i++) {
            System.out.println(sortedByPrice.get(i).getPrice());
        }

    }
}
