package com.alma.classesproj.model;

public class Item {
    String id;
    String name;
    boolean lost;
    String position;
    String type;
    String date;
    String pic;
    String details;
    public Item(String name, String id, boolean lost, String position, String type, String date, String pic, String details) {
        this.name = name;
        this.id = id;
        this.lost = lost;
        this.position = position;
        this.type = type;
        this.date = date;
        this.pic = pic;
        this.details = details;
    }
    public Item() {
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLost() {
        return lost;
    }

    public void setLost(boolean lost) {
        this.lost = lost;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lost=" + lost +
                ", position='" + position + '\'' +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", pic='" + pic + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
