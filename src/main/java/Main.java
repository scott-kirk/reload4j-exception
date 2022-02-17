import org.slf4j.impl.Log4jMDCAdapter;

class Main {
    public static void main(String[] args) {
        Log4jMDCAdapter mdc = new Log4jMDCAdapter();
        mdc.clear();
    }
}