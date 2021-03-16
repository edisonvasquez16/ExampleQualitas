package co.com.example.factories;

import co.com.example.models.ItemModel;
import org.openqa.selenium.NotFoundException;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static io.restassured.path.json.JsonPath.from;

public class ItemsFactory {

    private static final String ITEMS_PATH_JSON = "json/items.json";

    public static ItemModel withData(List<String> data) {
        ItemModel item = new ItemModel();
        item.setName(data.get(0));
        item.setValue(data.get(1));
        item.setDescription(data.get(2));
        return item;
    }

    public static ItemModel withCode(String code) throws FileNotFoundException {
        return getItems()
                .stream()
                .filter(item -> item.getCode() == Integer.parseInt(code))
                .findFirst()
                .orElseThrow(() -> new NotFoundException("Item not found with code: " + code));
    }

    private static List<ItemModel> getItems() throws FileNotFoundException {
        return Arrays.asList(from(getItemsFile()).getObject("items", ItemModel[].class));
    }

    private static URL getItemsFile() throws FileNotFoundException {
        URL filePath = ItemsFactory.class.getClassLoader().getResource(ITEMS_PATH_JSON);
        if (filePath == null)
            throw new FileNotFoundException("File not found: " + ITEMS_PATH_JSON);
        return filePath;
    }
}
