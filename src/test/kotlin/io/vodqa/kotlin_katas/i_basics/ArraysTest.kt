package io.vodqa.kotlin_katas.i_basics

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Test

/**
 * @author sergei.prodanov
 */

class ArraysTest {

    @Test
    fun testArrayGetterAndSetter() {
        val array = arrayOf(1, 2, 3, 4, 5)

        assertThat(array[0], equalTo(1))

        array[3] = 10

        assertThat(array[3], equalTo(10))
    }


}