void main () {
    System.out.println("Задача 1");
    int[] masiv0 = new int[3];
    masiv0[0] = 1;
    masiv0[1] = 2;
    masiv0[2] = 3;
    double[] masiv1 = {1.57, 7.654, 9.986};
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    System.out.println("Задача 2");
    System.out.println(Arrays.toString(masiv0));
    System.out.println(Arrays.toString(masiv1));
    System.out.println(Arrays.toString(arr));
    System.out.println("Задача 3");
    for (int index = masiv0.length - 1; index >= 0; index-- ) {
        System.out.print(masiv0[index]);
        if (index > 0) {
            System.out.print(", ");
        }
   }
    System.out.println();
    for (int i = masiv1.length - 1; i >= 0; i--) {
        System.out.print(masiv1[i]);
        if (i > 0) {
            System.out.print(", ");
        }
    }
    System.out.println();
    for (int in = arr.length - 1; in >= 0; in--) {
        System.out.print(arr[in]);
        if (in > 0) {
            System.out.print(", ");
        }
    }
    System.out.println();
   System.out.println("Задача 4");
    int i = 0;
    while (i < masiv0.length) {
        if (masiv0[i] % 2 == 0) {
            masiv0[i] += 0;
        } else {
            masiv0[i]++;
        }
        i++;
    }
    System.out.println(Arrays.toString(masiv0));
}