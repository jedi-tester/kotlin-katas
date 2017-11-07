package io.vodqa.kotlin_katas.i_basics

import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import kotlin.test.assertFailsWith

/**
 * @author sergei.prodanov
 */

class CharsTest {

    @Test
    fun testCharToIntConversion() {
        assertThat(9, equalTo(charToInt('9')))
    }
}