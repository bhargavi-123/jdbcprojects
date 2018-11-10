package com.training.client;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Colunm {
String name();
int size();
boolean notNull();

}
