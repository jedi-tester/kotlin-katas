package io.vodqa.kotlin_katas.i_basics

import org.hamcrest.CoreMatchers.isA
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

/**
 * @author sergei.prodanov
 */

class NumbersTest {

    @Test
    fun testNumberTypes() {
        assertThat(double, isA(Double::class.java))
        assertThat(float, isA(Float::class.java))
        assertThat(long, isA(Long::class.java))
        assertThat(int, isA(Int::class.java))
        assertThat(short, isA(Short::class.java))
        assertThat(byte, isA(Byte::class.java))
    }

    @Test
    fun testNumberConversions() {
        assertThat(number, isA(Int::class.java))

        val double = number.toDouble()
        assertThat(double, isA(Double::class.java))

        val long = number.toLong()
        assertThat(long, isA(Long::class.java))

        val short = double.toShort()
        assertThat(short, isA(Short::class.java))
    }

    @Test
    fun testComparisonOperationsOnNumbers() {
        val a = 10
        val b = 20
        val c = 5

        assertThat(a + b, equalTo(30))
        assertThat(a != b, equalTo(true))
        assertThat(a == b, equalTo(false))
        assertThat(a < b, equalTo(true))
        assertThat(a > b, equalTo(false))
        assertThat(a <= b, equalTo(true))
        assertThat(a >= b, equalTo(false))
        assertThat(c in a..b, equalTo(true))

        assertThat(a.equals(b), equalTo(false))
    }

}