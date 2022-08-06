package section02_JavaBasicsExtended.topic04_SwitchCase.prectice;

public class GetScoreMessage {
    public static void main(String[] args) {
        System.out.println(getScoreMessage(1));;
    }
    public static String getScoreMessage(int place) {
        switch (place){
            case (1) :
                return "Congratulations, you won golden medal";
            case (2) :
                return "Great job, you won silver medal";
            case (3) :
                return "Cool, you won bronze medal";
            default :
                return "Don't worry, you'll win next time";
        }
    }
}
