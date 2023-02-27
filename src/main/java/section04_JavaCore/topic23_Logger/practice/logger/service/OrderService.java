package section04_JavaCore.topic23_Logger.practice.logger.service;

import section04_JavaCore.topic23_Logger.practice.logger.model.Order;

public interface OrderService {
    Order completeOrder(Long userId);
}
