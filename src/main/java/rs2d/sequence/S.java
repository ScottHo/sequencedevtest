//-- generated code, will be overwritten at each recompilation

package rs2d.sequence;

import rs2d.spinlab.tools.param.*;
import rs2d.spinlab.tools.table.*;
import rs2d.spinlab.tools.role.RoleEnum;
import rs2d.spinlab.sequenceGenerator.GeneratorSequenceParamEnum;

import java.util.List;
import static java.util.Arrays.asList;

public enum S implements GeneratorSequenceParamEnum {
    _width66("_width66"),
    _width67("_width67"),
    _width68("_width68"),
    _width69("_width69"),
    _width70("_width70"),
    _width71("_width71"),
    _width72("_width72"),
    _width73("_width73"),
    Nb_1d("Nb_1d"),
    Nb_2d("Nb_2d"),
    Nb_3d("Nb_3d"),
    Nb_4d("Nb_4d"),
    P2_width("P2_width"),
    P3_width("P3_width"),
    P4_width("P4_width"),
    p_width("p_width"),
    p_width2("p_width2"),
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