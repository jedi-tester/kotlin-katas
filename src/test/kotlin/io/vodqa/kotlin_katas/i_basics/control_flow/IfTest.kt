package io.vodqa.kotlin_katas.i_basics.control_flow

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Test

/**
 * @author sergei.prodanov
 */

class IfTest {

    @Test
    fun testIfConditions() {
        assertThat(5, equalTo(getMax(1, 5)))
        assertThat(10.11, equalTo(getMax(1.0, 10.11)))
        assertThat(10F, equalTo(getMax(1.0F, 10F)))
        assertThat(10L, equalTo(getMax(1L, 10L)))
    }
}