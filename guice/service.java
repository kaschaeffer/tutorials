public interface Service {
  void go();
}

public class ServiceImpl implements Service {
  public void go() {
    // does something
  }
}

// for unit testing
public class MockService implements Service {
  private boolean gone = false;
  public void go() {
    gone = true;
  }
  public boolean isGone() {
    return gone;
  }
}

public class ServiceFactory {
  private ServiceFactory() {}

  private static Service instance = new ServiceImpl();
  public static Service getInstance() {
    return instance;
  }
  public static void setInstance(Service service) {
    instance = service;
  }
}


public class Client {
  public void go() {
    Service service = ServiceFactory.getInstance();
    service.go();
  }
}

public void testClient() {
  Service previous = ServiceFactory.getInstance();
  try {
    final MockService mock = new MockService();
    ServiceFactory.setInstance(mock);
    Client client = new Client();
    client.go();
    assertTrue(mock.isGone());
  }
  finally {
    ServiceFactory.setInstance(previous);
  }
}
