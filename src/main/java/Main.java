public class Main {

    public static void main(String[] args) {
	   // work1
       double mark_salary = 5.2;
       float alice_salary = 3.21234567f;
        System.out.println(mark_salary + " " + alice_salary);

        // work2
        int mark_age = 10000;
        int alice_age = 20000;
        System.out.println(mark_age + " " + alice_age);

       // work3
        String mark_name = "Mark";
        String alice_name = "Alice";
        System.out.println(mark_name + " " + alice_name);

        // work4
        boolean mark_gender = true;
        boolean alice_gender = false;
        System.out.println(mark_gender + " " + alice_gender);

        // work5
        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);

        }

        // work6
        for (int i = 0; i < array.length; i++) {
            if (i < 5) {
                continue;
            }
            System.out.println(array[i]);
        }

         // work7
        String [] array1 = new String[10];
        String a = "Четный";
        String b = "Нечетный";

        int q = -1;

        for(int i = 0; i< array1.length; i++) {
              q = q + 1;
              if (q%2==0){
                  array1[i] = a;
              }
else {
                  array1[i] = b;
              }

            System.out.println(array1[i] + " " + q);


        }

    }


}
