package com.mycompany.amstechconstructionbasic;

public class Estimation {

    public static void plotEstimation(Plot p) {
        System.out.println("Plot length : " + p.getLength());
        System.out.println("Plot width : " + p.getWidth());
        double area = p.getPlotArea();
        System.out.println("Plot Area : " + area);
        double totalPrice = Operation.totalPrice(area, 1);
        System.out.println("Total Price : " + totalPrice);
        System.out.println("Total Registry Charges : " + Operation.totalRegistryCharges(totalPrice));
        System.out.println("Total Green Tax : " + Operation.totalGreenTax(totalPrice));
        System.out.println("Total Society Development Charges : " + Rate.socityDevelopmentTax);
        System.out.println("==========================================");
        System.out.println("Final Costs : " + Operation.finalCost(totalPrice, 1));
    }

    public static void officeEstimation(Office p) {

        System.out.println("Office length : " + p.getLength());
        System.out.println("Office width : " + p.getWidth());

        double area = p.getOfficeArea();
        System.out.println("Office Area : " + area);
        double totalPrice = Operation.totalPrice(area, 2);
        System.out.println("Total Price : " + totalPrice);
        System.out.println("Total Registry Charges : " + Operation.totalRegistryCharges(totalPrice));
        System.out.println("Total Green Tax : " + Operation.totalGreenTax(totalPrice));
        System.out.println("Total Society Development Charges : " + Rate.socityDevelopmentTax);
        System.out.println("Final Costs : " + Operation.finalCost(totalPrice, 2));
    }

    public static void flatEstimation(Flat p) {
        double area = p.getArea();
        System.out.println("Flat Area: " + area);
        double totalPrice = Operation.totalPrice(area, 3);
        System.out.println("Total Price : " + totalPrice);
        System.out.println("Total Registry Charges : " + Operation.totalRegistryCharges(totalPrice));
        System.out.println("Total Green Tax : " + Operation.totalGreenTax(totalPrice));
        System.out.println("Total Society Development Charges : " + Rate.socityDevelopmentTax);
        System.out.println("Final Costs : " + Operation.finalCost(totalPrice, 3));
    }
}
