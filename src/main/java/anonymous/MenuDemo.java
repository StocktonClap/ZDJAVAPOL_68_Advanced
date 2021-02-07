package anonymous;

import java.util.Scanner;

public class MenuDemo {
    static Scanner scanner = new Scanner(System.in);
    static int var1;
    static int var2;

    public static void main(String[] args) {

        MenuItem loadItem1 = new MenuItem("Wczytaj piewszą zmienną", 1);
        MenuItem loadItem2 = new MenuItem("Wczytaj drugą zmienną", 2);
        MenuItem calcItem = new MenuItem("Oblicz sumę zmiennych", 3);
        MenuItem endItem = new MenuItem("Koniec", 0);
        Callback loadVar1Callback = new Callback() {
            @Override
            public void action() {
                System.out.println("Podaj liczbę nr 1");
                var1 = scanner.nextInt();
            }
        };
        loadItem1.setCallback(loadVar1Callback);

        Callback loadVar2Callback = new Callback() {
            @Override
            public void action() {
                System.out.println("Podaj liczbę nr 2");
                var2 = scanner.nextInt();
            }
        };
        loadItem2.setCallback(loadVar2Callback);

        calcItem.setCallback(new Callback() {
            @Override
            public void action() {
                System.out.println("Suma obu zmiennych: " + (var1+var2));
            }
        });

        Callback endCallback = new Callback() {
            @Override
            public void action() {
                System.exit(0);
            }
        };
        endItem.setCallback(endCallback);
        Menu menu = new Menu(new MenuItem[]{loadItem1, loadItem2, calcItem, endItem});
        while(true) {
        menu.print();
        int itemNumber = scanner.nextInt();
        menu.process(itemNumber);
    }

}
}

//       Menu menu = new Menu(new MenuItem[]{
//         new MenuItem("Polecenie 1", 1),
//        new MenuItem("Polecenie 2", 2),
//        new MenuItem("Koniec", 0)
// }
//     );