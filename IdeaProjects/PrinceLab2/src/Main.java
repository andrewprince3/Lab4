
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner width = new Scanner(System.in);
        Scanner length = new Scanner(System.in);
        Scanner scnr = new Scanner(System.in);
        Scanner aSide = new Scanner(System.in);
        Scanner bSide = new Scanner(System.in);
        Scanner cSide = new Scanner(System.in);
        Scanner rSphere = new Scanner(System.in);
        Scanner diameter = new Scanner(System.in);
        Scanner rpHeight = new Scanner(System.in);
        Scanner rpWidth = new Scanner(System.in);
        Scanner cylHeight = new Scanner(System.in);
        Scanner cylRadius = new Scanner(System.in);

        double widthRec = 0;
        double lengthRec = 0;
        double radiusCir = 0;
        double sideA = 0;
        double sideB = 0;
        double sideC = 0;
        double radiusSphere = 0;
        double diameterRP = 0;
        double heightRP = 0;
        double widthRP = 0;
        double heightCyl = 0;
        double radiusCyl = 0;

        double areaRec = 0, areaCir = 0, circumCir = 0;
        double perimiterRec = 0, areaTri = 0, perimiterTri = 0;
        double surfaceAreaSphere = 0, volumeSphere = 0, surfaceAreaRP = 0;
        double volumeRP = 0, surfaceAreaCyl = 0, volumeCyl = 0;

        System.out.println("Enter length of rectangle (positive integer): ");
        lengthRec = length.nextDouble();

        System.out.println("Enter width of rectangle (positive integer): ");
        widthRec = width.nextDouble();

        areaRec = (widthRec * lengthRec);
        System.out.println("Area of rectangle: " + areaRec);

        perimiterRec = (2 * lengthRec + 2 * widthRec);
        System.out.println("Perimeter of rectangle: " + perimiterRec);

        System.out.println("Now enter the radius of the circle (positive integer):  ");
        radiusCir = scnr.nextDouble();

        areaCir = (3.14 * radiusCir * radiusCir);
        System.out.println("Area of circle: " + areaCir);

        circumCir = (2 * 3.14 * radiusCir);
        System.out.println("Circumference of circle: " + circumCir);

        System.out.println("Enter side A of triangle (positive integer): ");
        sideA = aSide.nextDouble();

        System.out.println("Enter side B of triangle (positive integer): ");
        sideB = bSide.nextDouble();

        System.out.println("Enter side C of triangle (positive integer): ");
        sideC = cSide.nextDouble();

        double S = ((sideA + sideB + sideC) / 2.0);

        areaTri = Math.sqrt((S) * (S - sideA) * (S - sideB) * (S - sideC));
        System.out.println("Area of triangle: " + areaTri);

        perimiterTri = (sideA + sideB + sideC);
        System.out.println("Perimeter of triangle: " + perimiterTri);

        System.out.println("Enter the radius of the sphere: ");
        radiusSphere = rSphere.nextDouble();

        surfaceAreaSphere = (4 * 3.14 * radiusSphere * radiusSphere);
        System.out.println("The surface area of the sphere is: " + surfaceAreaSphere);

        volumeSphere = (1.3333333333333 * 3.14 * radiusSphere * radiusSphere * radiusSphere);
        System.out.println("The volume of the sphere is: " + volumeSphere);

        System.out.println("Enter the diameter of the rectangular prism:  ");
        diameterRP = diameter.nextDouble();
        System.out.println("Enter the height of the rectangular prism: ");
        heightRP = rpHeight.nextDouble();
        System.out.println("Enter the width of the rectangular prism: ");
        widthRP = rpWidth.nextDouble();


        surfaceAreaRP = (2 * ((heightRP * diameterRP) + (heightRP * widthRP) + (diameterRP * widthRP)));
        volumeRP = (heightRP * diameterRP * widthRP);
        System.out.println("The surface area of the rectangular prism is: " + surfaceAreaRP);
        System.out.println("The volume of the rectangular prism is: " + volumeRP);

        System.out.println("Enter the height of the cylinder: ");
        heightCyl = cylHeight.nextDouble();
        System.out.println("Enter the radius of the cylinder: ");
        radiusCyl = cylRadius.nextDouble();

        surfaceAreaCyl = (6.28 * radiusCyl * heightCyl + 6.28 * radiusCyl * radiusCyl);
        volumeCyl = (3.14 * radiusCyl * radiusCyl * heightCyl);

        System.out.println("The surface area of the cylinder is: " + surfaceAreaCyl);
        System.out.println("The volume of the cylinder is: "+ volumeCyl);

    }
}