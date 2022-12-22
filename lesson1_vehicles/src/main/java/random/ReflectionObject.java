package random;

import enums.Modifier;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionObject {
    private String name;
    private String lastName;

    public ReflectionObject(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    private void printPerson() {
        System.out.println(this.name + " " + this.lastName);
    }

    public void getFieldsAndMethods() throws Exception {
        // declaring class field and methods array
        Field[] fields = this.getClass().getDeclaredFields();
        Method[] methods = this.getClass().getDeclaredMethods();

        // getting fields
        System.out.println("-----------------------------");
        System.out.println("--Fields--");
        for (Field field : fields) {
            System.out.println(Modifier.getModifier(field.getModifiers()) + " " + field.getName());
        }

        // getting constructor
        System.out.println();
        System.out.println("--Constructors--");
        for (Constructor constructor : this.getClass().getDeclaredConstructors()) {
            System.out.println(Modifier.getModifier(constructor.getModifiers()) + " " + constructor.getName());
        }

        // getting methods
        System.out.println();
        System.out.println("--Methods--");
        for (Method method : methods) {
            System.out.println(Modifier.getModifier(method.getModifiers()) + " " + method.getReturnType() +  " " + method.getName());
        }
    }
}
