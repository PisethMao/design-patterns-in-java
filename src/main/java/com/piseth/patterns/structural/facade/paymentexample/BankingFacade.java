package com.piseth.patterns.structural.facade.paymentexample;

public class BankingFacade {
    private final AccountService accountService;
    private final BalanceService balanceService;
    private final FeeService feeService;
    private final AmlService amlService;
    private final TransferService transferService;
    private final TransactionService transactionService;
    private final NotificationService notificationService;

    public BankingFacade(){
        this.accountService = new AccountService();
        this.balanceService = new BalanceService();
        this.feeService = new FeeService();
        this.amlService = new AmlService();
        this.transferService = new TransferService();
        this.transactionService = new TransactionService();
        this.notificationService = new NotificationService();
    }

    public void transferMoney(String source, String destination, Double amount){
        if(!accountService.validateAccount(source)){
            throw new RuntimeException("Invalid source account");
        }
        if(!balanceService.hasEnoughBalance(source, amount)){
            throw new RuntimeException("Insufficient balance");
        }
        if(!amlService.checkTransaction(source, amount)){
            throw new RuntimeException("AML violation");
        }
        Double fee = feeService.calculateFee(amount);
        transferService.transfer(source, destination, amount + fee);
        transactionService.saveTransaction();
        notificationService.sendNotification();
    }
}
