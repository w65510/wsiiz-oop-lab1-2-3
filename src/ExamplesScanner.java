import Examples.IExample;

import java.io.File;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamplesScanner
{
    public static List<IExample> getAllExamples(Scanner _scanner) throws Exception
    {
        List<IExample> exampleList = new ArrayList<>();

        ClassLoader classLoader = IExample.class.getClassLoader();
        String packageName = "Examples";
        String packagePath = packageName.replace(".", "/");
        URL packageUrl = classLoader.getResource(packagePath);
        File packageDir = new File(packageUrl.getFile());

        List<Class> classes = findClasses(packageDir, packageName);

        for (Class exClass : classes)
        {
            if (!IExample.class.isAssignableFrom(exClass))
                continue;

            if (Modifier.isAbstract(exClass.getModifiers()))
                continue;

            var constructor = exClass.getConstructor(Scanner.class);

            IExample example = (IExample) constructor.newInstance(_scanner);
            exampleList.add(example);
        }

        return exampleList;
    }

    private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException
    {
        List<Class> classes = new ArrayList<>();
        if (!directory.exists())
        {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files)
        {
            if (file.isDirectory())
            {
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            }
            else if (file.getName().endsWith(".class"))
            {
                String className = file.getName().substring(0, file.getName().length() - 6);
                classes.add(Class.forName(packageName + "." + className));
            }
        }
        return classes;
    }
}
