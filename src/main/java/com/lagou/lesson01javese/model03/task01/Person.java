package com.lagou.lesson01javese.model03.task01;

import java.util.Objects;

public class Person {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj instanceof Person ){
            Person p = (Person)obj;
            return this.getId() == p.getId();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
