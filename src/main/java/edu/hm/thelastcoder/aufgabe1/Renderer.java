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

    /**
     * Renderer Constructor.
     *
     * @param object rendered object
     */
    public Renderer(Object object) {
        this.object = object;
    }

    /**
     * render method to render classes with RenderMe Annotations.
     *
     *
     * @return String with all fields and methods which are declared with
     * RenderMe
     *
     * @throws ClassNotFoundException when an application tries to load in a
     * class through its sting name.
     * @throws NoSuchMethodException when a particular method cannot be found.
     * @throws SecurityException when a security violation occurred.
     * @throws IllegalAccessException when an application tries to reflectively
     * access a field or method without having access.
     * @throws NoSuchFieldException when there is no field with that name.
     * @throws IllegalArgumentException when a illegal argument was passed.
     * @throws InvocationTargetException when an exception is thrown my invoking
     * a method or constructor.
     * @throws InstantiationException when an application tries to create an
     * instance of a class using the newInstance method.
     */
    public String render() throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Class< ? > cut = object.getClass();
        String result = "Instance of " + cut.getCanonicalName() + ":\n";
        Field[] attributes = cut.getDeclaredFields();
        Method[] methodes = cut.getDeclaredMethods();
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
                result += field.getName() + " (Type " + field.getType().getCanonicalName() + ") ";

                Class< ? > cutti = Class.forName(rendi);
                Object specRender = Class.forName(rendi).getConstructor().newInstance();
                Object parameter = field.get(object);
                Method method = cutti.getMethod("render", parameter.getClass());
                result += (String) method.invoke(specRender, parameter) + "\n";

            }
        }
        for (Method method : methodes) {
            result += method.getName() + " (Type " + method.getReturnType() + ") " + method.invoke(null,null) + "\n";
        }
        return result;
    }
}
