/**
 * Created by kevinschaeffer on 5/3/14.
 */
// https://code.google.com/p/google-guice/wiki/GettingStarted

public class BillingService {
    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;

    @Inject
    BillingService(CreditCardProcessor processor,
                   TransactionLog transactionLog) {
        this.processor = processor;
        this.transactionLog = transactionLog;
    }

    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
        // do something here!
    }

}
