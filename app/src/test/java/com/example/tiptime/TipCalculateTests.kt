package com.example.tiptime

import org.junit.Test
import org.junit.Assert.assertEquals
import java.text.NumberFormat

class TipCalculateTests {

    @Test
    fun calculate_20PercentNoRound() {
        val amount = 10.0
        val tipPercent = 20.0
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount, tipPercent, false)

        assertEquals(expectedTip, actualTip)
    }
}