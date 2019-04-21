package com.mohmedhassan.otleb;

public class SearchRestruantModel {

    int Restruant_photo;
    String Restruant_Name;

    public SearchRestruantModel(int imageView, String textView) {
        Restruant_photo = imageView;
        Restruant_Name = textView;
    }

    public SearchRestruantModel() {
    }

    public int getRestruant_photo() {
        return Restruant_photo;
    }

    public void setRestruant_photo(int restruant_photo) {
        Restruant_photo = restruant_photo;
    }

    public String getRestruant_Name() {
        return Restruant_Name;
    }

    public void setRestruant_Name(String restruant_Name) {
        Restruant_Name = restruant_Name;
    }


}
