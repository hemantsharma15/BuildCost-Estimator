
package com.mycompany.amstechconstructionbasic;

public class Plot {
    private double length;
    private double width;

    public Plot(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getPlotArea()
    {
        return length * width;
    }
}
