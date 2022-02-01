//-- generated code, will be overwritten at each recompilation

package rs2d.sequence;

import rs2d.spinlab.sequenceGenerator.GeneratorSequencePulseEnum;

public enum P implements GeneratorSequencePulseEnum {
    r("r");

    //--

    private final String name;

    private P(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
