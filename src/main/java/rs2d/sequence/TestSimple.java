package rs2d.sequence;

import java.util.*;

import rs2d.spinlab.sequenceGenerator.*;
import rs2d.spinlab.sequenceGenerator.auto.*;
import rs2d.spinlab.sequenceGenerator.util.*;
import rs2d.spinlab.instrument.*;
import rs2d.spinlab.instrument.probe.*;
import rs2d.spinlab.instrument.util.*;
import rs2d.spinlab.sequence.*;
import rs2d.spinlab.sequence.channel.*;
import rs2d.spinlab.sequence.element.*;
import rs2d.spinlab.sequence.table.*;
import rs2d.spinlab.tools.param.*;
import rs2d.spinlab.tools.table.*;
import rs2d.spinlab.tools.utility.*;
import rs2d.spinlab.exception.*;

import static rs2d.sequence.U.*;
import static rs2d.sequence.S.*;

public class TestSimple extends AutoSequenceGenerator {
    public TestSimple() {
        // Optionally, set generator options
        //options.disableAutomaticUserParamCreation();
    }

    @Override
    protected void validateUserParams() throws SpinlabException {
        // Optionally, check user parameters
    }

    @Override
    protected void computeSequenceParams() throws SpinlabException {
        // Set computed sequence parameter values
    }

    //-- generated code, will be overwritten at each recompilation
    //<editor-fold defaultstate="collapsed" desc="Generated Code (RS2D)">
    protected void addUserParams() {
        addMissingUserParams(U.values());
    }

    public String getName() {
        return "test_simple";
    }

    public String getVersion() {
        return "3";
    }
    //</editor-fold>
}
