package enums;

public enum Note {
    // deklaracja stałej to jakby zapis Note C = new Note(frequency)
    C(261.6), Cis(261.6), D(293.7), Dis(293.7), E(329.6), F(349.2), Fis(349.2), G(391.9), Gis(391.9), A(440.0), Ais(440.0), H(493.9);

    private final double frequency;

    Note(double frequency) {
        this.frequency = frequency;
    }

    public double getFrequency(Octave octave) {
        return frequency * (octave.ordinal() +1);
    }
}
