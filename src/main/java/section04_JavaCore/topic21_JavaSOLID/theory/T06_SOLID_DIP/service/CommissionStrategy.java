package section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.service;

import section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.model.Account;
import section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.service.commission.CommissionHandler;

public interface CommissionStrategy {
    CommissionHandler get(Account.Type type);
}
