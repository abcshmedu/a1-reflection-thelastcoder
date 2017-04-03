package edu.hm.thelastcoder.aufgabe1;

/**
 * Created by isigoing on 03.04.2017.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RenderMe{
    String with() default "";
}
