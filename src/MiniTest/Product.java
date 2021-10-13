package MiniTest;

public class Product {
    public int code;
    public String name;
    public String type;
    public int usd;
    public String unit;

    public Product() {
    }

    public Product(int code, String name, String type, int usd, String unit) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.usd = usd;
        this.unit = unit;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUsd() {
        return usd;
    }

    public void setUsd(int usd) {
        this.usd = usd;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", usd=" + usd +
                ", unit='" + unit + '\'' +
                '}';
    }
}
