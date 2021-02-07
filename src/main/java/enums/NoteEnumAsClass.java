package enums;
// tworzenie klasy jako Enum
public class NoteEnumAsClass {
    public final static NoteEnumAsClass C = new NoteEnumAsClass("C", 261.6);
    public final static NoteEnumAsClass D = new NoteEnumAsClass("D", 293.7);
    public final static NoteEnumAsClass E = new NoteEnumAsClass("E", 329.6);
    public final static NoteEnumAsClass F = new NoteEnumAsClass("F", 349.2);

    private final String name;
    private final double frequency;

    private NoteEnumAsClass(String name, double frequency){
        this.name = name;
        this.frequency = frequency;
    }

    public String name () {
        return name;
    }

    public double getFrequency() {
        return frequency;
    }

    public static NoteEnumAsClass[] values(){
        return new NoteEnumAsClass[]{C, D, E, F};

    }

}
