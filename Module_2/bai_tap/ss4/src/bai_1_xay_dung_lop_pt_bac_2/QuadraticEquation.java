package bai_1_xay_dung_lop_pt_bac_2;

public class QuadraticEquation {
    int a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //tinh delta = b^2 -4ac
    public double getDiscriminant(int a, int b, int c) {
        return (Math.pow(this.b, 2) - 4 * this.a * this.c);
    }
    public String display (){
        return "Phuong trinh{" + " a=" + a + ", b=" + b+ " , c=" + c + " }";
    }

    // giai phuong trinh
    public void getSolveTheEquation() {
        if (getDiscriminant(a, b, c) > 0) {
            System.out.println("Phuong trinh co hai nghiem phan biet");
            double root1 = (-b + Math.sqrt(getDiscriminant(a, b, c))) / (2 * a);
            double root2 = (-b - Math.sqrt(getDiscriminant(a, b, c))) / (2 * a);
            System.out.println("Nghiem 1:" + root1);
            System.out.println("Nghiem 2:" + root2);
        } else if (getDiscriminant(a, b, c) == 0) {
            System.out.println("Phuong trinh co nghiem kep ");
            double root1 = (double) -b / (2 * a);
            System.out.println("Nghiem :" + root1);
        } else {
            System.out.println("Phuong trinh vo nghiem:");
        }
    }
}
