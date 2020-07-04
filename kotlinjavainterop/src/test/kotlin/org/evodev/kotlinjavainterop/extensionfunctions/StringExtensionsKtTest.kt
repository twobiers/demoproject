/* (C)2020 */
package org.evodev.kotlinjavainterop.extensionfunctions

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

internal class StringExtensionsKtTest {

    @Test
    fun getIntRepresentation() {
        assertEquals(123, "123".getIntRepresentation())
        assertEquals(-123, "-123".getIntRepresentation())
        assertThrows(NumberFormatException::class.java) {
            "".getIntRepresentation()
        }
        assertThrows(NumberFormatException::class.java) {
            "abc".getIntRepresentation()
        }
        assertThrows(NumberFormatException::class.java) {
            "123abc".getIntRepresentation()
        }
    }
}
