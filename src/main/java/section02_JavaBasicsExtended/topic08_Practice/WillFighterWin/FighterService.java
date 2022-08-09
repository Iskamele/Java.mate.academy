package section02_JavaBasicsExtended.topic08_Practice.WillFighterWin;

public class FighterService {
    public boolean willFighterWin(Fighter firstFighter, Fighter secondFighter, int hits) {
        return secondFighter.getHealth() <= (firstFighter.getDamagePerHit() * hits);
    }
}
