package Daily.JavaCore.Normal.T04_ResponsibleDrinking;

import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Normal.T04_ResponsibleDrinking.Drinking;

public class DrinkingTest {
    @Test
    public void hydrate_zeroDrinks() {
        Assert.assertEquals("Method should return a correct string for no drinks\n",
                "0 glasses of water", Drinking.hydrate("We will not drink today :("));
    }

    @Test
    public void hydrate_oneDrink() {
        Assert.assertEquals("Method should return a correct string for one standard drink\n",
                "1 glass of water", Drinking.hydrate("1 beer"));
    }

    @Test
    public void hydrate_twoDrinks() {
        Assert.assertEquals("Method should return a correct string for two standard drinks\n",
                "2 glasses of water", Drinking.hydrate("2 jars of whiskey"));
    }

    @Test
    public void hydrate_twoDifferentDrinks() {
        Assert.assertEquals("Method should return a correct string for two different standard drinks\n",
                "2 glasses of water", Drinking.hydrate("1 bottle of champagne and 1 shot"));
    }

    @Test
    public void hydrate_severalDifferentDrinks() {
        Assert.assertEquals("Method should return a correct string for several different standard drinks\n",
                "8 glasses of water", Drinking.hydrate("1 glasses of wine, 4 liters of cider and 3 tequilas"));
    }
}
