//-- generated code, will be overwritten at each recompilation

package rs2d.sequence;

import rs2d.spinlab.sequenceGenerator.GeneratorSequenceParamEnum;

public enum S implements GeneratorSequenceParamEnum {
    Nb_1d("Nb_1d"),
    Nb_2d("Nb_2d"),
    Nb_3d("Nb_3d"),
    Nb_4d("Nb_4d"),
    Pre_scan("Pre_scan"),
    Tx_nucleus("Tx_nucleus");

    //--

    private final String name;

    private S(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
