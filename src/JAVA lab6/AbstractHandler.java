public interface Handler {
    void setNextHandler(Handler handler);
    void handleRequest(String request);
}

public abstract class AbstractHandler implements Handler {
    protected Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

public class ConcreteHandlerA extends AbstractHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("RequestA")) {
            System.out.println("ConcreteHandlerA handled the request.");
        } else {
            super.handleRequest(request);
        }
    }
}

public class ConcreteHandlerB extends AbstractHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("RequestB")) {
            System.out.println("ConcreteHandlerB handled the request.");
        } else {
            super.handleRequest(request);
        }
    }
}

public class ConcreteHandlerC extends AbstractHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("RequestC")) {
            System.out.println("ConcreteHandlerC handled the request.");
        } else {
            super.handleRequest(request);
        }
    }
}

public class Client {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        handlerA.handleRequest("RequestA");
        handlerA.handleRequest("RequestB");
        handlerA.handleRequest("RequestC");
        handlerA.handleRequest("UnknownRequest");
    }
}