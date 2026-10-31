class InvertedAlphaetTriangle{    
public static void p14(){


    for (char i = 'E'; i >= 'A'; i--) {
        for (char j = 'A'; j <= i; j++) {
            System.out.print(i);
        }
        System.out.println();
    }
}
}
