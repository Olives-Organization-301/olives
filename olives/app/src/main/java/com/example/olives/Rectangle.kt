package com.example.olives

class Rectangle(
    var length: Int,
    var width: Int,
    x: Int,
    y: Int,
): Shape(x, y) {

    fun isSquare(): Boolean {
        return length == width
    }

    fun area(): Int {
        return length * width
    }

}