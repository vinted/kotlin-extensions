package com.vinted

import org.junit.Test
import kotlin.test.assertEquals

class GeneralKtTest {

    @Test
    fun testTryGetDefaultValue() {
        val result = tryGet(0) { listOf(1)[1] }
        assertEquals(0, result)
    }

    @Test
    fun testTryGetResolvedValue() {
        val result = tryGet(0) { listOf(1, 2, 3)[2] }
        assertEquals(3, result)
    }
}