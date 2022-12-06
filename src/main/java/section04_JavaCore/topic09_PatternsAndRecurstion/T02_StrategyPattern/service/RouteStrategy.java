package section04_JavaCore.topic09_PatternsAndRecurstion.T02_StrategyPattern.service;

import section04_JavaCore.topic09_PatternsAndRecurstion.T02_StrategyPattern.service.impl.BikeRouteService;
import section04_JavaCore.topic09_PatternsAndRecurstion.T02_StrategyPattern.service.impl.CarRouteService;
import section04_JavaCore.topic09_PatternsAndRecurstion.T02_StrategyPattern.service.impl.PublicTransportRouteService;
import section04_JavaCore.topic09_PatternsAndRecurstion.T02_StrategyPattern.service.impl.WalkingRouteService;

public class RouteStrategy {
    public RouteService getRouteService(String transportType) {
        return switch (transportType) {
            case "bike" -> new BikeRouteService();
            case "walk" -> new WalkingRouteService();
            case "public" -> new PublicTransportRouteService();
            case "car", default -> new CarRouteService();
        };
    }
}
