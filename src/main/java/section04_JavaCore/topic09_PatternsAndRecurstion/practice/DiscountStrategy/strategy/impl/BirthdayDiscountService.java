package section04_JavaCore.topic09_PatternsAndRecurstion.practice.DiscountStrategy.strategy.impl;

import section04_JavaCore.topic09_PatternsAndRecurstion.practice.DiscountStrategy.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private static final double DISCOUNT = 33.0;

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}
