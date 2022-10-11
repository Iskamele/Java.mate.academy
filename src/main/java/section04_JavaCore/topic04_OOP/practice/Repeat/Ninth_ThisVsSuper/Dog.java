package section04_JavaCore.topic04_OOP.practice.Repeat.Ninth_ThisVsSuper;

public class Dog extends Animal {
    private String color;
    private String voice;
    private boolean destroyFurniture;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public boolean isDestroyFurniture() {
        return destroyFurniture;
    }

    public void setDestroyFurniture(boolean destroyFurniture) {
        this.destroyFurniture = destroyFurniture;
    }

    public Dog(String name, int age, int weigth, String color, String voice, boolean destroyFurniture) {
        super(name, age, weigth);
        this.color = color;
        this.voice = voice;
        this.destroyFurniture = destroyFurniture;
    }

    @Override
    public String toString() {
        return "Dog: " +
                "name = " + getName() + ", " +
                "age = " + getAge() + ", " +
                "weigth = " + getWeight() + ", " +
                "color = " + color + ", " +
                "voice = " + voice + ", " +
                "destroy furniture? = " + destroyFurniture;
    }
}
