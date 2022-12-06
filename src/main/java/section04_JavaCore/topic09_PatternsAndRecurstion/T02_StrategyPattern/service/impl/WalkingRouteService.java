package section04_JavaCore.topic09_PatternsAndRecurstion.T02_StrategyPattern.service.impl;

import section04_JavaCore.topic09_PatternsAndRecurstion.T02_StrategyPattern.service.RouteService;

public class WalkingRouteService implements RouteService {
    @Override
    public double calculateRouteTime(int startPoint, int endPoint) {
        return (double) (endPoint - startPoint) / 10;
    }
}
