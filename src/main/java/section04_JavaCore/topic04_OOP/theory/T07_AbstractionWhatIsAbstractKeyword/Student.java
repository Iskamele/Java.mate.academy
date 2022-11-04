package section04_JavaCore.topic04_OOP.theory.T07_AbstractionWhatIsAbstractKeyword;

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

    @Override
    public String sayHello() {
        return "Hello";
    }
}
