package section02_JavaBasicsExtended.topic07_MethodsAdvanced.practice.ShoeManiac;

class Shoes {
    private String color;
    private int size;
    public static int shoesNumber;

    public Shoes(String color, int size){
        this.color = color;
        this.size = size;
        shoesNumber++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
