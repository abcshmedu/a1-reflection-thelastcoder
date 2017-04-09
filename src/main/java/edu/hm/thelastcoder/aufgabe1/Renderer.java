package edu.hm.thelastcoder.aufgabe1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mark Tripolt
 * @author Patrick Kuntz
 */

public class Renderer {

    private Object object;

    public Renderer(Object object) {
        this.object = object;
    }

    public String render() throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Class< ? > cut = object.getClass();
        String result = "Instance of " + cut.getCanonicalName() + ":\n";
        Field[] attributes = cut.getDeclaredFields();
        for (Field field : attributes) {
            if (field.getAnnotation(RenderMe.class).with().equals("")) {
                String name = field.getName();
                Class type = field.getType();
                field.setAccessible(true);

                try {
                    result += name + " (Type " + type.getName() + "): " + field.get(object) + "\n";
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(Renderer.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                String rendi = field.getAnnotation(RenderMe.class).with();
                result += field.getName() + " (Type " + field.getType().getCanonicalName() + "): ";

                Class< ? > cutti = Class.forName(rendi);
                if (cutti != null) {
                    System.out.println("hier");
                    Object specRender = Class.forName(rendi).getConstructor().newInstance();
                    Object parameter = field.get(object);
                    Method method = cutti.getMethod("render", parameter.getClass());
                    result += (String) method.invoke(specRender, parameter) + "\n";
                } else {
                    //result += parameter.toString() + "\n";

                }
            }

            System.out.println(result);
        }
        return result;
    }
}


