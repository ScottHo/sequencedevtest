//-- generated code, will be overwritten at each recompilation

package rs2d.sequence;

import rs2d.spinlab.sequenceGenerator.GeneratorSequenceParamEnum;

public enum S implements GeneratorSequenceParamEnum {
    Async_90_width("Async_90_width"),
    Nb_1d("Nb_1d"),
    Nb_2d("Nb_2d"),
    Nb_3d("Nb_3d"),
    Nb_4d("Nb_4d"),
    PatternDuration("PatternDuration"),
    Pre_scan("Pre_scan"),
    r_width("r_width"),
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
