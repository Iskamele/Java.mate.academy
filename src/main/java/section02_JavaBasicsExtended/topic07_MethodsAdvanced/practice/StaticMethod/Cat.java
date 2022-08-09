package section02_JavaBasicsExtended.topic07_MethodsAdvanced.practice.StaticMethod;

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printInfoAboutAllCats(){
        System.out.println("All cats are cute and funny!");
    }

    public void feedTheCat(String food){
        System.out.println(name + " is eating " + food + "!");
    }
}