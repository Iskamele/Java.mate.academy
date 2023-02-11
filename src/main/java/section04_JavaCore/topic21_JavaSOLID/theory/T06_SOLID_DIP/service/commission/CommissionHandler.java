package section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.service.commission;

import java.math.BigDecimal;

public interface CommissionHandler {
    BigDecimal getCommission(BigDecimal amount);
}
