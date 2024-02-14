package com.gmtz.notesappandroid.domain

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}