package co.com.example.factories;

import co.com.example.models.ItemModel;

import java.util.List;

public class ItemsFactory {

    public static ItemModel withData(List<String> data) {
        ItemModel item = new ItemModel();
        item.setName(data.get(0));
        item.setValue(data.get(1));
        item.setDescription(data.get(2));
        return item;
    }

}
