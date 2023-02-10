package section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.service.commission;

import java.math.BigDecimal;

public interface CommissionHandler {
    BigDecimal getCommission(BigDecimal amount);
}
