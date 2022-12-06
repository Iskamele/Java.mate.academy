package section04_JavaCore.topic09_PatternsAndRecurstion.theory.T02_StrategyPattern.service.impl;

import section04_JavaCore.topic09_PatternsAndRecurstion.theory.T02_StrategyPattern.service.RouteService;

public class PublicTransportRouteService implements RouteService {

    @Override
    public double calculateRouteTime(int startPoint, int endPoint) {
        return (double) (endPoint - startPoint) / 35;
    }
}
