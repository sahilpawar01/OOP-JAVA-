import java.util.Scanner;

class Complex_op {
    float real, imag;

    // Default constructor
    Complex_op() {
        real = 0;
        imag = 0;
    }

    // Parameterized constructor
    Complex_op(float Comp1, float Comp2) {
        real = Comp1;
        imag = Comp2;
    }

    public void AddNumbers(Complex_op C1, Complex_op C2) {
        real = C1.real + C2.real;
        imag = C1.imag + C2.imag;
        System.out.println("Addition is: (" + real + ") + (" + imag + ")i");
    }

    public void SubNumbers(Complex_op C1, Complex_op C2) {
        real = C1.real - C2.real;
        imag = C1.imag - C2.imag;
        System.out.println("Subtraction is: (" + real + ") + (" + imag + ")i");
    }

    public void MulNumbers(Complex_op C1, Complex_op C2) {
        real = (C1.real * C2.real) - (C1.imag * C2.imag);
        imag = (C1.imag * C2.real) + (C1.real * C2.imag);
        System.out.println("Multiplication is: (" + real + ") + (" + imag + ")i");
    }

    public void DivNumbers(Complex_op C1, Complex_op C2) {
        float den = C2.real * C2.real + C2.imag * C2.imag;
        real = ((C1.real * C2.real) + (C1.imag * C2.imag)) / den;
        imag = ((C1.imag * C2.real) - (C1.real * C2.imag)) / den;
        System.out.println("Division is: (" + real + ") + (" + imag + ")i");
    }
}

// Complex class for user input and menu
public class Complex {
    public static void main(String[] args) {
        int m;
        char n;
        float num1, num2;
        Complex_op cal = new Complex_op();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the real part of the first number: ");
        num1 = input.nextFloat();
        System.out.print("Enter the imaginary part of the first number: ");
        num2 = input.nextFloat();
        Complex_op Object1 = new Complex_op(num1, num2);

        System.out.print("Enter the real part of the second number: ");
        num1 = input.nextFloat();
        System.out.print("Enter the imaginary part of the second number: ");
        num2 = input.nextFloat();
        Complex_op Object2 = new Complex_op(num1, num2);

        do {
            System.out.print("\nMENU:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\nEnter Your Choice: ");
            m = input.nextInt();
            switch (m) {
                case 1:
                    cal.AddNumbers(Object1, Object2);
                    break;
                case 2:
                    cal.SubNumbers(Object1, Object2);
                    break;
                case 3:
                    cal.MulNumbers(Object1, Object2);
                    break;
                case 4:
                    cal.DivNumbers(Object1, Object2);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("\nDo you want to continue? (y/n): ");
            n = input.next().charAt(0);
        } while (n == 'y');

        input.close();  // Close the scanner to prevent resource leak
    }
}