import com.chetty.service.MathClient;
import com.chetty.service.MathModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by kevinschaeffer on 5/3/14.
 */
public class MathApp {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MathModule());

        MathClient mathClient = injector.getInstance(MathClient .class);
        mathClient.sumOfAllConsecutiveNumbers(1000);
    }
}
