/**
 * Created by kevinschaeffer on 5/3/14.
 */
public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BillingModule());

        BillingService billingService = injector.getInstance(BillingService.class);

}
