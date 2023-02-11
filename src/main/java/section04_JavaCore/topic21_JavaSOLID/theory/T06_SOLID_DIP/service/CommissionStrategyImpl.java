package section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.service;

import java.util.Map;
import section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.model.Account;
import section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.service.commission.CommissionHandler;

public class CommissionStrategyImpl implements CommissionStrategy {
    // Всем этим будет заниматься Spring
    private Map<Account.Type, CommissionHandler> commissionHandlerMap;

    public CommissionStrategyImpl(Map<Account.Type, CommissionHandler> commissionHandlerMap) {
        this.commissionHandlerMap = commissionHandlerMap;
    }

    @Override
    public CommissionHandler get(Account.Type type) {
        return commissionHandlerMap.get(type);
    }
}
