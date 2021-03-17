package co.com.example.factories;

import co.com.example.models.ElectronicItemModel;

import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static io.restassured.path.json.JsonPath.from;

public class ElectronicItemsFactory {

    private static final String ELECTRONIC_ITEMS = "json/electronic-items.json";

    public static URL getElectronicItemsFile() {
        return ElectronicItemsFactory.class.getClassLoader().getResource(ELECTRONIC_ITEMS);
    }

    public static List<ElectronicItemModel> getElectronicItems() {
        return Arrays.asList(from(getElectronicItemsFile()).getObject("electronics", ElectronicItemModel[].class));
    }

    public static ElectronicItemModel getElectronicItem(String code) {
        return getElectronicItems()
                .stream()
                .filter(electronicItems
                        -> electronicItems.getCode() == Integer.parseInt(code))
                .findFirst()
                .orElseThrow();
    }

}
