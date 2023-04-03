package section06_JavaJDBC.topic03_DAOVsService.theory.T01_NTierArchitecture.service.impl;

import java.math.BigDecimal;
import java.util.Optional;
import section06_JavaJDBC.topic03_DAOVsService.theory.T01_NTierArchitecture.dao.BankAccountDao;
import section06_JavaJDBC.topic03_DAOVsService.theory.T01_NTierArchitecture.model.BankAccount;
import section06_JavaJDBC.topic03_DAOVsService.theory.T01_NTierArchitecture.service.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService {
    private BankAccountDao bankAccountDao;

    // Dependency Injection
    public BankAccountServiceImpl(BankAccountDao bankAccountDao) {
        this.bankAccountDao = bankAccountDao;
    }

    @Override
    public void transfer(String fromAccount, String toAccount, BigDecimal amount) {
        Optional<BankAccount> senderAccount = bankAccountDao.findByAccountNumber(fromAccount);
        Optional<BankAccount> receiverAccount = bankAccountDao.findByAccountNumber(toAccount);

        if (senderAccount.isEmpty() || receiverAccount.isEmpty()) {
            throw new RuntimeException("Can't find account.");
        }

        senderAccount.get().setAmount(senderAccount.get().getAmount().subtract(amount));
        receiverAccount.get().setAmount(receiverAccount.get().getAmount().add(amount));

        bankAccountDao.update(senderAccount.get());
        bankAccountDao.update(receiverAccount.get());
    }

    @Override
    public BankAccount create(BankAccount bankAccount) {
        return bankAccountDao.create(bankAccount);
    }
}
