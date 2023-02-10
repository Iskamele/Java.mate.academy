package section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.service;

import section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.model.Account;
import section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.service.commission.CommissionHandler;

public interface CommissionStrategy {
    CommissionHandler get(Account.Type type);
}
