package exceptions;

import java.util.Scanner;

/*
 komibacje klauzul try ... catch ... finally:
    - try ... catch
    - try ... catch ... finally
    - try ... finally
    Liczba catch dowolona np.
    try {
    } catch (...){
    } catch (...){
    } catch (...){
    }...
    catch()
 */

public class FinallyExample {
    public static int parse (String str) {
        try {
           return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
            // blok finally dominuje nad wszystkimi terurnami w metodzie
            // i tylko jego return zwróci wartość z metody !!!
            // FINALLY zawsze się wykonuje!!
        } finally {
            System.out.println("KONIEC");
            return -1;    // !!!
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        // PART 1
        System.out.println("PART 1");
        try {
            int number = Integer.parseInt(str);
            System.out.println("koniec " + number);
        } catch (NumberFormatException e) {
            System.out.println("Nieporawna liczba.");
        }
        finally {
            System.out.println("KONIEC");
        }

        // PART 2
        System.out.println("PART 2");
        System.out.println(parse(str));
    }
}