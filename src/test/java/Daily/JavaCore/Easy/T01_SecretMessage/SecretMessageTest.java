package Daily.JavaCore.Easy.T01_SecretMessage;

import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Easy.T01_SecretMessage.SecretMessage;

public class SecretMessageTest {
    @Test
    public void greet_helloToJohnny() {
        String name = "Johnny";
        String result = SecretMessage.greet(name);
        Assert.assertEquals(String.format("Should return a greeting \"%s\" for the person \"%s\"\n",
                result, name), result, SecretMessage.greet(name));
    }

    @Test
    public void greet_helloToNoOne() {
        String name = "";
        String result = SecretMessage.greet(name);
        Assert.assertEquals(String.format("Should return a greeting \"%s\" for the person \"%s\"\n",
                result, name), result, SecretMessage.greet(name));
    }

    @Test
    public void greet_helloToPerson() {
        String[] names = new String[]{"Bohdan", "Iryna", "Kseniia", "Daria", "Max", "Vlad", "Roman", "Sofia", "Kate"};
        int randomName = (int) Math.floor(Math.random() * names.length);
        String result = SecretMessage.greet(names[randomName]);
        Assert.assertEquals(String.format("Should return a greeting \"%s\" for the person \"%s\"\n",
                result, names[randomName]), result, SecretMessage.greet(names[randomName]));
    }
}
