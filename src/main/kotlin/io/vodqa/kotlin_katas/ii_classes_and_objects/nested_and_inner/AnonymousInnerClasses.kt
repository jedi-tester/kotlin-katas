package io.vodqa.kotlin_katas.ii_classes_and_objects.nested_and_inner

import java.awt.Frame
import java.awt.Window
import java.awt.event.ActionListener
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

/**
 * @author sergei.prodanov
 */

fun main(args: Array<String>) {
    val window = Window(Frame())

    // Anonymous inner class instances are created using an object expression:
    window.addMouseListener(object: MouseAdapter() {
        override fun mouseClicked(p0: MouseEvent?) {
            super.mouseClicked(p0)
        }

        override fun mouseEntered(p0: MouseEvent?) {
            super.mouseEntered(p0)
        }
    })

    // If the object is an instance of a functional Java interface (i.e. a Java interface with a single abstract method),
    // you can create it using a lambda expression prefixed with the type of the interface:
    val listener = ActionListener { println("clicked") }
}