package com.github.hadasbro.javautils.test.classes;

import com.github.hadasbro.javautils.DtoObject;

@SuppressWarnings({"unused", "WeakerAccess"})
public class GameDto implements DtoObject {
    public String name;

    @Override
    public String toString() {
        return "GameDto{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
