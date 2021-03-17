package co.com.example.models;

import lombok.Data;

@Data
public class ElectronicItemModel extends ItemModel{

    private int voltage;
    private String charge;
    private DetailsModel details;

}
