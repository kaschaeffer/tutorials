/**
 * Created by kevinschaeffer on 5/3/14.
 */
public class BillingModule extends AbstractModule {
    @Override
    protected void configure() {
        /*
         * This tells guice that whenver it sees a dependency on a TransactionLog,
         * it should satisfy the dependency using a DAtabaseTransactionLog.
         */
        bind(TransactionLog.class).to(DatabaseTransactionLog.class);
        bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
    }
}
