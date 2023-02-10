package section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.service.commission;

import java.math.BigDecimal;

public class UltraCommissionHandler implements CommissionHandler {
    @Override
    public BigDecimal getCommission(BigDecimal amount) {
        return new BigDecimal(100);
    }
}
