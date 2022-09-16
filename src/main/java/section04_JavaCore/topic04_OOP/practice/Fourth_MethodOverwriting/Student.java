package section04_JavaCore.topic04_OOP.practice.Fourth_MethodOverwriting;

public class Student extends Person {
    private String favoriteSubject;

    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    public void setFavoriteSubject(String favoriteSubject) {
        this.favoriteSubject = favoriteSubject;
    }

    @Override
    public String getPersonalInfo() {
        return super.getPersonalInfo() + ", favorite subject: " + getFavoriteSubject();
    }
}
