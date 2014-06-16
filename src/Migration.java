import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Migration {

    private static final String PATH_TO_JAR =
            "file:/home/bresiu/Sonda/Prevayler/out/artifacts/Prevayler_jar/Prevayler.jar";

    ///*
    public static void go() throws MalformedURLException, ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {

        // 1. make List of URLs to pass to CustomClassLoader class
        URL url = new URL(PATH_TO_JAR);
        List<URL> urls = new ArrayList<URL>();
        urls.add(url);

        // 2. Use CustomLoaderClass, to make sure, that loaded classes/methods are not from current project,
        // but from the jar specified in URL, since Java class loaders (including URLClassLoader)
        // first ask to load classes from their parent class loader.
        CustomClassLoader clsLoader = new CustomClassLoader(urls);
        Class cls = clsLoader.loadClass("RandomNumberGenerator");
        Method method = cls.getMethod("foo");

        // 3. foo method just simply print out "bar" in console.
        method.invoke(null);
    }
    //*/

}