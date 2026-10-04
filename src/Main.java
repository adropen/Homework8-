void main () {
    System.out.println("Задача 1");
    int[] masiv0 = new int[3];
    masiv0[0] = 1;
    masiv0[1] = 2;
    masiv0[2] = 3;
    double[] masiv1 = {1.57, 7.654, 9.986};
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    System.out.println("Задача 2");
    System.out.println(masiv0[0] + ", " + masiv0[1] + ", " + masiv0[2]);
    System.out.println(masiv1[0] + ", " + masiv1[1] + ", " + masiv1[2]);
    System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + ", " + arr[4] + ", " + arr[5] + ", " + arr[6] + ", " + arr[7]);
    System.out.println("Задача 3");
    System.out.println(masiv0[2] + ", " + masiv0[1] + ", " + masiv0[0]);
    System.out.println(masiv1[2] + ", " + masiv1[1] + ", " + masiv1[0]);
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