package com.syntax.syntax21THISs;
public class StaticDoubleReturn2 {

static double area (double length, double height) {
double areaRectangle=length*height;
return areaRectangle;
}

static double area (double length) {
double areaSquare=length*length;
return areaSquare;
}

static double area (double length, double width, double height) {
double areaBox=2*(length*width+height*height+width*height);
return areaBox;
}}