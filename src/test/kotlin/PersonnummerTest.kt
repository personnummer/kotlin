package personnummer.tests

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PersonnummerTest {
    private val pnr: personnummer.Personnummer = personnummer.Personnummer()

    @Test
    fun testWithControlDigit() {
        assertTrue { pnr.valid(8507099805L) }
        assertTrue { pnr.valid("198507099805") }
        assertTrue { pnr.valid("198507099813") }
        assertTrue { pnr.valid("850709-9813") }
        assertTrue { pnr.valid("196411139808") }
        assertTrue { personnummer.Personnummer.valid("198507099805") }
        assertTrue { personnummer.Personnummer.valid(8507099805L) }
    }

    @Test
    fun testWithoutControlDigit() {
        assertFalse { pnr.valid("19850709980") }
        assertFalse { pnr.valid("19850709981") }
        assertFalse { pnr.valid("19641113980") }
    }

    @Test
    fun testWithInvalidValues() {
        assertFalse { pnr.valid("A string") }
        assertFalse { pnr.valid("Two") }
        assertFalse { pnr.valid("222") }
        assertFalse { pnr.valid(222L) }
    }

    @Test
    fun testCoordinationNumbers() {
        assertTrue { pnr.valid("198507699802") }
        assertTrue { pnr.valid("850769-9802") }
        assertTrue { pnr.valid("198507699810") }
        assertTrue { pnr.valid("850769-9810") }
    }

    @Test
    fun testWithBadCoordinationNumbers() {
        assertFalse { pnr.valid("198567099805") }
    }
}