package section04_JavaCore.topic04_OOP.practice.Third_InheritanceSecondPart;

public class Student extends Person {
    private String favoriteSubject;


    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    public void setFavoriteSubject(String favoriteSubject) {
        this.favoriteSubject = favoriteSubject;
    }
}
