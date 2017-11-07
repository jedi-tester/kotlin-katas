package io.vodqa.kotlin_katas.i_basics

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Test


/**
 * @author sergei.prodanov
 */

class StringsTest {

    @Test
    fun testStringIteration() {
        val str = "string"

        val strIterator = str.iterator()

        for (c in str) {
            assertThat(c, equalTo(strIterator.nextChar()))
        }
    }

}