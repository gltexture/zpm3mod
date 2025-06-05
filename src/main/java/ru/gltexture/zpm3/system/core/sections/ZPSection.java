package ru.gltexture.zpm3.system.core.sections;

import org.jetbrains.annotations.NotNull;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ZPSection {
    @NotNull String name();
    @NotNull Section section();
    int priority() default 0;
}
