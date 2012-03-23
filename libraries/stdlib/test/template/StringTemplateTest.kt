package test.template

import kotlin.template.*
import kotlin.test.assertEquals

import junit.framework.TestCase

class StringTemplateTest : TestCase() {
    fun testTemplate(): Unit {
        val name = "James"

        // Code generated by the following template expression:
        //
        // val actual = "hello $name!".toString()

        // TODO will use a tuple soon
        //val actual = StringTemplate(Tuple3<String,String,String>("hello ", name, "!"))).toString()
        val actual = StringTemplate(array("hello ", name, "!")).toString()

        assertEquals("hello James!", actual)
    }
}