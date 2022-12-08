package section04_JavaCore.topic09_PatternsAndRecurstion.practice.DiscountStrategy;


import section04_JavaCore.topic09_PatternsAndRecurstion.practice.DiscountStrategy.strategy.DiscountService;
import section04_JavaCore.topic09_PatternsAndRecurstion.practice.DiscountStrategy.strategy.impl.BirthdayDiscountService;
import section04_JavaCore.topic09_PatternsAndRecurstion.practice.DiscountStrategy.strategy.impl.BlackFridayDiscountService;
import section04_JavaCore.topic09_PatternsAndRecurstion.practice.DiscountStrategy.strategy.impl.DefaultDiscountService;
import section04_JavaCore.topic09_PatternsAndRecurstion.practice.DiscountStrategy.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday": {
                return new BirthdayDiscountService();
            }
            case "Black Friday": {
                return new BlackFridayDiscountService();
            }
            case "New Year": {
                return new NewYearDiscountService();
            }
            default:
                return new DefaultDiscountService();
        }
    }
}
