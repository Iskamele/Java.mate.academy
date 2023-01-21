package section04_JavaCore.topic18_JavaJUnit.theory.T03_HowToWriteUnitTest.JUnit.practice.example.service;

public class GmailValidator implements EmailValidator {

    @Override
    public boolean isValid(String email) {
        if (!Character.isLetter(email.charAt(0))) {
            return false;
        }

        if (!email.contains("@")) {
            return false;
        }
        return true;
    }
}
