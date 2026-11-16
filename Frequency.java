class Frequency {

    public static void main(String[] args) {

        int arr[] = {1,1,1,3,5,6,2};

        int n = arr.length;
        int maxcount = 0;
        int maxelement = arr[0];

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxcount) {
                maxcount = count;
                maxelement = arr[i];
            }
        }

        if (maxcount > n / 2) {
            System.out.println("Frequency = " + maxcount);
            System.out.println("Element = " + maxelement);
        } else {
            System.out.println("The frequency is less than n/2");
        }
    }
}