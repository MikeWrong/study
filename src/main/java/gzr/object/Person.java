package gzr.object;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by gaozengrong on 16/11/22.
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -2569740845621051313L;

    public static final String message = "I am a good person";

    private int age;

    private String name;

    private String sex;


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
//        return String.valueOf(age) +"|" + String.valueOf(name) + "|" + String.valueOf(sex);
    }
}
