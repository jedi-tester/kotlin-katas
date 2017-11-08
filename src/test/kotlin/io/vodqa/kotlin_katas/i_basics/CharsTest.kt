package io.vodqa.kotlin_katas.i_basics

import io.vodqa.kotlin_katas.i_basics.data_types.charToInt
import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

/**
 * @author sergei.prodanov
 */

class CharsTest {

    @Test
    fun testCharToIntConversion() {
        assertThat(9, equalTo(charToInt('9')))
    }
}