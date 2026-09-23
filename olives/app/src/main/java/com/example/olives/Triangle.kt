package com.example.olives

class Triangle (
    x: Int,
    y: Int,
    color: String,
    sideType: String = "equilateral",
    angleType: String = "acute",
    sideLengthA: Int,
    sideLengthB: Int,
    sideLengthC: Int,
) : Shape(x,y,color) {
}