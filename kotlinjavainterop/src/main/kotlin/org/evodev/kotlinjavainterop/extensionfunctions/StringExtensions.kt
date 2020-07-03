/* (C)2020 */
package org.evodev.kotlinjavainterop.extensionfunctions

fun String.getIntRepresentation(): Int {
    return Integer.valueOf(this)
}
