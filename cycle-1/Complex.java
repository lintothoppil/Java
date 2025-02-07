import java.util.Scanner;

class Complex {
    int real, img;

    Complex(int r, int i) {
        real = r;
        img = i;
    }

    void display() {
        System.out.println(real + "+" + img + "i");
    }

    public static Complex add(Complex n1, Complex n2) {
        return new Complex(n1.real + n2.real, n1.img + n2.img);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary part of first complex number: ");
        int real1 = sc.nextInt();
        int img1 = sc.nextInt();
        Complex c1 = new Complex(real1, img1);

        System.out.print("Enter real and imaginary part of second complex number: ");
        int real2 = sc.nextInt();
        int img2 = sc.nextInt();
        Complex c2 = new Complex(real2, img2);

        System.out.println("\nFirst Complex Number: ");
        c1.display();

        System.out.println("Second Complex Number: ");
        c2.display();

        Complex result = add(c1, c2);
        System.out.println("Addition of Two Complex Numbers: ");
        result.display();

        sc.close();
    }
}

