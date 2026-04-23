
public class grade {

    public static void main(String[] args) {

        int[] grades = {85, 92, 45, 70, 88};
        String studentName = "azizli Meherrem";
        int sum = 0;
        int max = grades[0];
        String Name = studentName.toUpperCase();

        System.out.println("Telebe adi :" + Name);
        System.out.println("--------Butun Qiymetler---------");

        for  (int i = 0; i < grades.length; i++) {

            System.out.println("Qiymet " + (i + 1) + ": " + grades[i]);
            sum += grades[i];

            if (grades[i] > max) {
                max = grades[i];

        }
        System.out.println("------------------");

        double average = (double) sum / grades.length;

        System.out.println("En Yuksek Qiymet: " + max);
        System.out.println("Orta Bal: " + average);

        if (average >= 51) {
            System.out.println("Status: Keçdi");
        } else {
            System.out.println("Status: Qaldi");
        }

    }
}
}
