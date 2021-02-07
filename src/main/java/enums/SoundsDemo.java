package enums;

import java.util.Scanner;

public class SoundsDemo {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Note sound = Note.D;
        Note[] song = new Note[]{Note.C, Note.E, Note.G};
        int count = 3;
        while (count-- > 0){
            String noteStr = scanner.nextLine();
           try {
               Note note = Note.valueOf(noteStr);
                  song[count] = note;
               } catch (IllegalArgumentException e) {
                   System.out.println("Nieznany dźwięk!");
               }
           }
        for (Note note : song) {
        switch (note) {
            case C:
                System.out.println("261,6 Hz");
                break;
            case E:
                System.out.println("329,6 Hz");
                break;
            case G:
                System.out.println("391,9 Hz");
                break;
        }
        }
    }
}

//  // values() zwraca tablice obiektow typu wyliczeniowego!
//            for(Note n : Note.values()) {
//                // metoda name() zwraca nazwę danej stałej
//                if (n.equals(noteStr)) {
//                    // valueOf() zwraca stałą wyliczeniową o nazwie w str
//                    Note note = Note.valueOf(noteStr);
//                    song[count] = note;
//                }
//            }