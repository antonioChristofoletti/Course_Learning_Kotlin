package `7_basic_kotlin_exercises`

import org.junit.Assert
import org.junit.Test

class ReverseStringTest{

    @Test fun reverseUsingDB(){
        Assert.assertEquals("bs niltok", reverseUsingDB("kotlin sb"))
    }

    @Test fun reverseUsingLoop(){
        Assert.assertEquals("bs niltok", reverseUsingLoop("kotlin sb"))
    }
}