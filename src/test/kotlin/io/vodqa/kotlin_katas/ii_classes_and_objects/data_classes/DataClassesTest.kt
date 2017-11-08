package io.vodqa.kotlin_katas.ii_classes_and_objects.data_classes

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsEqual.*
import org.hamcrest.core.IsNot.*
import org.hamcrest.core.IsSame.*
import org.junit.Test

/**
 * @author sergei.prodanov
 */
class DataClassesTest {

    @Test
    fun testBasicDataClass() {
        val person = ImmutablePerson("John", "Doe", 25)

        assertThat(person.firstName, equalTo("John"))
        assertThat(person.lastName, equalTo("Doe"))
        assertThat(person.age, equalTo(25.toByte()))
    }

    @Test
    fun testDataClassSettersAndGetters() {
        val person = MutablePerson("Jack", "Daniels", 50)

        person.firstName = "Larry"
        person.lastName = "Crockett"

        assertThat(person.firstName, not(equalTo("Jack")))
        assertThat(person.firstName, equalTo("Larry"))
    }

    @Test
    fun testDataClassCopy() {
        val person1 = ImmutablePerson("Jack", "Daniels", 50)
        val person2 = person1.copy(age = 25)
        val person3 = person2.copy()

        assertThat(person1.firstName, equalTo(person2.firstName))
        assertThat(person1.age, not(equalTo(person2.age)))
        assertThat(person1, not(sameInstance(person2)))
        assertThat(person2, not(sameInstance(person3)))
    }

    @Test
    fun testDestructuringDeclarationsWithDataClasses() {
        val person = ImmutablePerson("Johnny", "Bravo", 18)
        val (firstName, lastName, age) = person

        assertThat(firstName, equalTo("Johnny"))
        assertThat(lastName, equalTo("Bravo"))
        assertThat(age, equalTo(18.toByte()))
    }

    @Test
    fun testPartiallyMutableClass() {
        val female = PartiallyMutablePerson("Anna", "Maria", 21, "female")
//        female.sex = "male" // does not compile

        val anotherFemale = female.copy()

        val male = female.copy(sex = "male") // can create new object from copy of 'female' and assign 'sex = "male"'
//        male.sex = "female" // does not compile

        assertThat(anotherFemale.sex, equalTo("female"))
        assertThat(male.sex, equalTo("male"))
    }
}