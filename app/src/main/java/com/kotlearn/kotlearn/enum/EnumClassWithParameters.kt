package com.kotlearn.kotlearn.enum


interface ICardCashBack {
    fun getCashbackValue(): Float
}

enum class EnumClassWithParameters(color: String, number: Int = 10000) : ICardCashBack {
    SILVER("silver", 50000) {
        override fun getCashbackValue(): Float = 0.02f
    }, //silver , 50000
    GOLD("gold") {
        override fun getCashbackValue(): Float {
            return 0.04f
        }
    }, //gold , 10000
    PLATINUM("black") {
        override fun getCashbackValue(): Float {
            return 0.06f
        }
    } //black, 10000
}