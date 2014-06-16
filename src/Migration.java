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

        URL url = new URL(PATH_TO_JAR);

        List<URL> urls = new ArrayList<URL>();
        urls.add(url);

        CustomClassLoader clsLoader = new CustomClassLoader(urls);
                // new URL[]{new URL(PATH_TO_JAR)});
        Class cls = clsLoader.loadClass("RandomNumberGenerator");
        Method method = cls.getMethod("foo");//, String[].class);
        //String[] params = new String[2];
        method.invoke(null);
    }
    //*/

}