package org.example

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class KtClass1Test {

    @Test
    fun isEvenNumber() {
        val class1 = KtClass1()
        assertTrue(class1.isEvenNumber(2))
        assertFalse(class1.isEvenNumber(3))
        assertTrue(class1.isEvenNumber(4))
        assertFalse(class1.isEvenNumber(5))
    }
}