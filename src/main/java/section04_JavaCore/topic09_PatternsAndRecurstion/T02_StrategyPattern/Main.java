package section04_JavaCore.topic09_PatternsAndRecurstion.T02_StrategyPattern;

import section04_JavaCore.topic09_PatternsAndRecurstion.T02_StrategyPattern.service.RouteService;
import section04_JavaCore.topic09_PatternsAndRecurstion.T02_StrategyPattern.service.RouteStrategy;

public class Main {
    public static void main(String[] args) {
        /*
        Calculate the travel time between two points.
        Usually the point on map could be described in following format: 50.4435083 : 30.519013.
        The trip can be made:
            - by bike --> 20
            - on foot --> 10
            - by car --> 50
            - by public transport --> 35
        */
        RouteStrategy strategy = new RouteStrategy();
        RouteService RouteService = strategy.getRouteService("walk");
        double time = RouteService.calculateRouteTime(0, 50);
        System.out.println(time + " hours");
    }
}
