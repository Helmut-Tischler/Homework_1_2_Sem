package org.lecture.cat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lecture.CatDriverClass;

public class CatTest {

    @Test

    public void main() {
        Assertions.assertEquals("My name is Mitzi and i´am a LUCKYCAT, i´m 3 years old. Rrrrrr", CatDriverClass.main());
    }

}
