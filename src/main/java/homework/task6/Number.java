package homework.task6;

/**
 * Obiekt <code>Number</code> reprezentuje abstrakcyjny numer.
 * Służy do tworzenia dokładniejszeych klas numerów np. Pesel, Regon, NIP, IBAN
 */
public abstract class Number {

    private String number;    // Wartość numeru konkretnego numeru w postaci String
    private boolean validated;      // czy poprawność numeru była sprawdzana
    private boolean correct;        // czy numer jest poprawny

    /**
     * Podstawowy konstruktor
     *
     * @param number numer w postaci <code>String</code>
     */
    public Number(String number) {
        this.number = prepareNumber(number);
        this.validated = false;
        this.correct = false;
    }

    /** Przygotowanie i wyczyszczenie Stringa
     *
     * @param number
     * @return przygotowany String
     */

    private String prepareNumber(String number) {  // "przygotowanie i wyczyszczenie" Stringa
        number = number.trim();
        number = number.replaceAll("\\s+", "");
        number = number.toUpperCase();
        StringBuilder builder = new StringBuilder();
        for (char c : number.toCharArray()) {
            if (Character.isLetterOrDigit(c)) builder.append(c);
        }
        return builder.toString();
    }

    /**
     * Sprawdza poprawność numeru.
     */
    public abstract void validate();

    /**
     * Sprawdza czy numer ma poprawną strukturę: długość, odpowiednie znaki itp
     *
     * @return true jeśli ma poprawną strukturę
     */
    public abstract boolean isGood();

    /**
     * Zwraca informacje które można wywnioskować na podstawie numeru.
     *
     * @return informacje w postaci String
     */
    public abstract String getAdditionalInfo();

    /**
     * Ustawia i sprawdza numer.
     *
     * @param number
     */
    public void setNumber(String number) {
        this.number = prepareNumber(number);
        this.validated = false;
        this.correct = false;
    }

    /**
     * Zwraca numer.
     *
     * @return numer w postaci String
     */
    public final String getNumber() {
        return number;
    }

    /**
     * Ustawia czy numer był sprawdzany.
     * Do wykorzystania w podklasach.
     */
    protected void setValidated() {
        this.validated = true;
    }

    /**
     * Zwraca informację o tym czy poprawność numeru jest sprawdzona.
     *
     * @return <code>true</code> jeśli poprawność jest sprawdzona.
     */
    public boolean isValidated() {
        return validated;
    }

    /**
     * Ustawia poprawność numeru.
     * Do wykorzystania w podklasach.
     *
     * @param correct czy numer jest poprawny
     */
    protected void setCorrect(boolean correct) {
        this.correct = correct;
    }

    /**
     * Zwraca informację o tym czy numer jest poprawny.
     *
     * @return <code>true</code> jeśli numer jest poprawny.
     */
    public final boolean isCorrect() {
        return correct;
    }
}
