/**
 * @author Helmut Tischler
 * @since Februar 2021
 * @version 0.1
 */

package org.lecture;

public class CatDriverClass {

    /**
     * Output from Cat and Breed
     * @return
     */

    public static Object main() {
        Cat mitzi = new Cat();
        mitzi.setAge(3);
        mitzi.setName("Mitzi");
        mitzi.setBreed(Breed.LUCKYCAT);//Enum from Breed
        mitzi.bark();

        System.out.println(mitzi.toString());
        return mitzi.toString(); //for the CatTest
    }
}
