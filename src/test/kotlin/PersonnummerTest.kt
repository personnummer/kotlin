package personnummer.tests

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PersonnummerTest {
    private val pnr: personnummer.Personnummer = personnummer.Personnummer()

    @Test
    fun testWithControlDigit() {
        assertTrue { pnr.valid("6403273813") }
        assertTrue { pnr.valid("510818-9167") }
        assertTrue { pnr.valid("19900101-0017") }
        assertTrue { pnr.valid("19130401+2931") }
        assertTrue { pnr.valid("196408233234") }
        assertTrue { pnr.valid("0001010107") }
        assertTrue { pnr.valid("000101-0107") }
        assertTrue { pnr.valid(6403273813L) }
        assertTrue { pnr.valid(5108189167L) }
        assertTrue { pnr.valid(199001010017L) }
        assertTrue { pnr.valid(191304012931L) }
        assertTrue { pnr.valid(196408233234L) }
    }

    @Test
    fun testWithoutControlDigit() {
        assertFalse { pnr.valid(640327381L) }
        assertFalse { pnr.valid(510818916L) }
        assertFalse { pnr.valid(19900101001L) }
        assertFalse { pnr.valid(100101001L) }
        assertFalse { pnr.valid("640327-381") }
        assertFalse { pnr.valid("510818-916") }
        assertFalse { pnr.valid("19900101-001") }
        assertFalse { pnr.valid("100101+001") }
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
        assertTrue { pnr.valid("701063-2391") }
        assertTrue { pnr.valid("640883-3231") }
        assertTrue { pnr.valid(7010632391L) }
        assertTrue { pnr.valid(6408833231L) }
    }

    @Test
    fun testWithBadCoordinationNumbers() {
        assertFalse { pnr.valid(9001610017L) }
        assertFalse { pnr.valid(6408933231L) }
        assertFalse { pnr.valid("900161-0017") }
        assertFalse { pnr.valid("640893-3231") }
    }
}