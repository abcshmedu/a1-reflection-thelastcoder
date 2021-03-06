package edu.hm.thelastcoder.aufgabe1;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

/**
 * RenderMe Annotation.
 * Used for fields and methods that should be rendered.
 * @author Mark Tripolt
 * @author Patrick Kuntz
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RenderMe {
    /**
     *
     * @return String.
     */
    String with() default "";

}
