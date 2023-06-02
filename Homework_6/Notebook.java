package Homework_6;

public class Notebook {
    private String brand;
    private String ram;
    private String hdd;
    private String os;
    private String color;

    public Notebook(String brand, String ram, String hdd, String os, String color){
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

@Override
public String toString() {
    return ("Бренд: " + this.brand + "; ОЗУ: " + this.ram + "; Объем жесткого диска: " + this.hdd + "; Операционная система: " + this.os + "; Цвет: " + this.color);
}

public String getBrandName() {
    return brand;
}

public String getColor() {
    return color;
}

public String getHdd() {
    return hdd;
}

public String getOs() {
    return os;
}

public String getRam() {
    return ram;
}


}
