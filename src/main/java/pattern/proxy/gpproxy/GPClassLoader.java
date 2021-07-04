package pattern.proxy.gpproxy;

public class GPClassLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return null;
    }
}
