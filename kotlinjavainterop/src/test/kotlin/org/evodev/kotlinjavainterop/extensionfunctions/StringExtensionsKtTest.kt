/* (C)2020 */
package org.evodev.kotlinjavainterop.extensionfunctions

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

internal class StringExtensionsKtTest {

    @Test
    fun getIntRepresentation() {
        assertEquals("123".getIntRepresentation(), 123)
        assertEquals("-123".getIntRepresentation(), -123)
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
