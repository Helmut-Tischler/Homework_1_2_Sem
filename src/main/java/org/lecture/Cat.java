/**
 * @author Helmut Tischler
 * @since Februar 2021
 * @version 0.1
 */

package org.lecture;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Cat {

    @EqualsAndHashCode.Include
    private String name;
    @EqualsAndHashCode.Include
    private Breed breed;

    private int age;
    private double height;
    private double weight;
    private boolean barfed;

    /**
     * Output to CatDriverClass
     */
    public void bark() {
        System.out.println("Miow, Rrrrrr");
    }

    /**
     *
     * @param name from CatDriverClass Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return Output to CatDriverClass
     */
    @Override
    public String toString() {
        return "My name is " + this.name + " and i´am a " + this.breed + ", i´m " + this.age + " years old. Rrrrrr";
    }

}
