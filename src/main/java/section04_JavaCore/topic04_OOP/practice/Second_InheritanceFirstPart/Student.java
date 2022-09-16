package section04_JavaCore.topic04_OOP.practice.Second_InheritanceFirstPart;

public class Student extends Person {
    private String favoriteSubject;


    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    public void setFavoriteSubject(String favoriteSubject) {
        this.favoriteSubject = favoriteSubject;
    }
}
