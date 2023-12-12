package model;

public class Drink {

    private String band;
    private String origin;
    private String cap;
    private String type;
    private double price;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "band='" + band + '\'' +
                ", origin='" + origin + '\'' +
                ", cap=" + cap +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
