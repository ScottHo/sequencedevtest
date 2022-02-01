//-- generated code, will be overwritten at each recompilation

package rs2d.sequence;

import rs2d.spinlab.tools.param.*;
import rs2d.spinlab.tools.table.*;
import rs2d.spinlab.sequenceGenerator.GeneratorParamEnum;

import java.util.List;
import static java.util.Arrays.asList;

public enum U implements GeneratorParamEnum {
    ACCU_DIM("ACCU_DIM") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("ACCU_DIM");
            param.setDisplayedName("Accumulation Dimension");
            param.setDescription("Dimension on which averaging is performed by the Cameleon");
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("af6eb813-ea10-414b-94f3-7eb24389f372");
            param.setNumberEnum(NumberEnum.Integer);
            param.setMinValue(0);
            param.setMaxValue(3);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    ACQUISITION_MATRIX_DIMENSION_1D("ACQUISITION_MATRIX_DIMENSION_1D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("ACQUISITION_MATRIX_DIMENSION_1D");
            param.setDisplayedName("Acquisition 1D");
            param.setDescription("Size of the initial dataset (raw data; ACQUISITION_MATRIX_DIMENSION_1D)");
            param.setLocked(true);
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("3b9bbf8e-fb9f-4db8-a6ff-b7444cd49c61");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(128);
            param.setDefaultValue(128);
            return param;
        }
    },

    ACQUISITION_MATRIX_DIMENSION_2D("ACQUISITION_MATRIX_DIMENSION_2D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("ACQUISITION_MATRIX_DIMENSION_2D");
            param.setDisplayedName("Acquisition 2D");
            param.setDescription("Size of the initial dataset (raw data; ACQUISITION_MATRIX_DIMENSION_2D)");
            param.setLocked(true);
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("c0486751-d6e7-468f-a525-473d62e42f56");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(128);
            return param;
        }
    },

    ACQUISITION_MATRIX_DIMENSION_3D("ACQUISITION_MATRIX_DIMENSION_3D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("ACQUISITION_MATRIX_DIMENSION_3D");
            param.setDisplayedName("Acquisition 3D");
            param.setDescription("Size of the initial dataset (raw data; ACQUISITION_MATRIX_DIMENSION_3D)");
            param.setLocked(true);
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("e5d4c8c7-0c18-4743-9331-3300db9fab66");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    ACQUISITION_MATRIX_DIMENSION_4D("ACQUISITION_MATRIX_DIMENSION_4D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("ACQUISITION_MATRIX_DIMENSION_4D");
            param.setDisplayedName("Acquisition 4D");
            param.setDescription("Size of the initial dataset (raw data; ACQUISITION_MATRIX_DIMENSION_4D)");
            param.setLocked(true);
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("15cf1259-5a93-4568-aef0-e8c6ec4dc914");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    ACQUISITION_MODE("ACQUISITION_MODE") {
        public Param build() {
            ListTextParam param = new ListTextParam();
            param.setName("ACQUISITION_MODE");
            param.setDisplayedName("ACQUISITION_MODE");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("3e5d02ae-5a98-4e6b-beab-0b3a19ff2825");
            param.setValue(asList("COMPLEX", "REAL", "REAL", "REAL"));
            param.setDefaultValue(asList("COMPLEX", "REAL", "REAL", "REAL"));
            return param;
        }
    },

    ACQUISITION_TIME_PER_SCAN("ACQUISITION_TIME_PER_SCAN") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("ACQUISITION_TIME_PER_SCAN");
            param.setDisplayedName("Sampling time duration");
            param.setDescription("Sampling time duration, ADC time");
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("670b3a6d-a4f2-49f1-9c12-106be741d137");
            param.setNumberEnum(NumberEnum.Time);
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setValue(1.0);
            param.setDefaultValue(1.0);
            return param;
        }
    },

    Async_90_width("Async_90_width") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("Async_90_width");
            param.setDisplayedName("Specific 90° width");
            param.setDescription("");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("018aa84c-c7ef-486e-a3fc-587d4e9d6521");
            param.setNumberEnum(NumberEnum.Time);
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setValue(4.9999999999999996E-6);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    BASE_FREQ_1("BASE_FREQ_1") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("BASE_FREQ_1");
            param.setDisplayedName("Base Freq 1 [1H]");
            param.setDescription("Base frequency of the first sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("f0ef9625-a663-474a-b3b3-9c8784a84c51");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(4.001170935E8);
            return param;
        }
    },

    BASE_FREQ_2("BASE_FREQ_2") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("BASE_FREQ_2");
            param.setDisplayedName("Base Freq 2 [1H]");
            param.setDescription("Base frequency of the second sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("3b242283-c4dd-43c7-bbcd-824e12526299");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    BASE_FREQ_3("BASE_FREQ_3") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("BASE_FREQ_3");
            param.setDisplayedName("Base Freq 3 [1H]");
            param.setDescription("Base frequency of the third sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("b1b6fe4e-7684-4206-98cb-84b2600d5104");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    BASE_FREQ_4("BASE_FREQ_4") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("BASE_FREQ_4");
            param.setDisplayedName("Base Freq 4 [1H]");
            param.setDescription("Base frequency of the fourth sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("02340b1b-db11-4103-9b90-2c93bb81480e");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    DATA_REPRESENTATION("DATA_REPRESENTATION") {
        public Param build() {
            ListTextParam param = new ListTextParam();
            param.setName("DATA_REPRESENTATION");
            param.setDisplayedName("DATA_REPRESENTATION");
            param.setLocked(true);
            param.setGroup(EnumGroup.Dimension);
            param.setCategory(Category.Miscellaneous);
            param.setUuid("e307e8ef-2e0c-4f24-bf9d-707d41f8dd58");
            param.setValue(asList("COMPLEX", "REAL", "REAL", "REAL"));
            param.setDefaultValue(asList("COMPLEX", "REAL", "REAL", "REAL"));
            return param;
        }
    },

    DIGITAL_FILTER_REMOVED("DIGITAL_FILTER_REMOVED") {
        public Param build() {
            BooleanParam param = new BooleanParam();
            param.setName("DIGITAL_FILTER_REMOVED");
            param.setDisplayedName("Digital filter removed");
            param.setDescription("Data shift activated: true");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("14b0c743-869e-4623-931d-e1f3b6e76d68");
            param.setValue(true);
            param.setDefaultValue(true);
            return param;
        }
    },

    DIGITAL_FILTER_SHIFT("DIGITAL_FILTER_SHIFT") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("DIGITAL_FILTER_SHIFT");
            param.setDisplayedName("Digital filter shift");
            param.setDescription("Data shift due to the digital filter");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("4a9241f6-31f1-4d38-bd9e-06bcdd33b45a");
            param.setNumberEnum(NumberEnum.Integer);
            param.setMinValue(-2147483648);
            param.setMaxValue(2147483647);
            param.setValue(18);
            param.setDefaultValue(18);
            return param;
        }
    },

    DUMMY_SCAN("DUMMY_SCAN") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("DUMMY_SCAN");
            param.setDisplayedName("Dummy Scan");
            param.setDescription("Dummy Scan performed at the beginning of the acquisition");
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("c69f052a-4e91-4f49-bb13-b56fa1250f62");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(0);
            param.setDefaultValue(0);
            return param;
        }
    },

    DWELL_TIME("DWELL_TIME") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("DWELL_TIME");
            param.setDisplayedName("DW");
            param.setDescription("Reception dwell time");
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("f63eb562-aed3-4684-a428-9b134ad1e385");
            param.setNumberEnum(NumberEnum.Time);
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setValue(8.0E-5);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    FID_RES("FID_RES") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("FID_RES");
            param.setDisplayedName("FID Res");
            param.setDescription("Resolution of FID");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("a849ba6c-fd23-49a1-8779-63161f18b61c");
            param.setNumberEnum(NumberEnum.FidRes);
            param.setMinValue(0.0);
            param.setMaxValue(1.7976931348623157E308);
            param.setValue(97.656);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    FID_RES_2D("FID_RES_2D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("FID_RES_2D");
            param.setDisplayedName("FID Res 2D");
            param.setDescription("Resolution of FID 2D");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("6df76c57-da75-44fe-ac67-7abc8dd52e22");
            param.setNumberEnum(NumberEnum.FidRes);
            param.setMinValue(0.0);
            param.setMaxValue(1.7976931348623157E308);
            param.setValue(12500.0);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    INTERMEDIATE_FREQUENCY("INTERMEDIATE_FREQUENCY") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("INTERMEDIATE_FREQUENCY");
            param.setDisplayedName("Intermediate frequency");
            param.setDescription("Sampling frequency after demodulation");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("e10a3c19-0525-4684-bf06-00b480637681");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(1.26E7);
            param.setDefaultValue(1.0);
            return param;
        }
    },

    LAST_PUT("LAST_PUT") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("LAST_PUT");
            param.setDisplayedName("LAST_PUT");
            param.setDescription("LAST_PUT.description");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("63990f3e-36b3-4271-825e-3f90ba7d871f");
            param.setMinValue(-2147483648);
            param.setMaxValue(2147483647);
            param.setNumberEnum(NumberEnum.Integer);
            param.setValue(asListNumber(0, 0, 0, 0, 0));
            param.setDefaultValue(asListNumber(0, 0, 0, 0, 0));
            return param;
        }
    },

    LOCK("LOCK") {
        public Param build() {
            BooleanParam param = new BooleanParam();
            param.setName("LOCK");
            param.setDisplayedName("LOCK");
            param.setDescription("Acquisition lock status");
            param.setLocked(true);
            param.setCategory(Category.Miscellaneous);
            param.setUuid("1d470fc0-2df1-4f9f-9873-11929fdeb0b4");
            param.setValue(false);
            param.setDefaultValue(false);
            return param;
        }
    },

    MAGNETIC_FIELD_STRENGTH("MAGNETIC_FIELD_STRENGTH") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("MAGNETIC_FIELD_STRENGTH");
            param.setDisplayedName("B0");
            param.setDescription("Magnetic field strength");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("1a17241b-1a9b-4a65-be1a-117942e073df");
            param.setNumberEnum(NumberEnum.Integer);
            param.setMinValue(-2147483648);
            param.setMaxValue(2147483647);
            param.setValue(5);
            param.setDefaultValue(7);
            return param;
        }
    },

    MANUFACTURER("MANUFACTURER") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("MANUFACTURER");
            param.setDisplayedName("INSTRUMENT_MANUFACTURER");
            param.setDescription("Manufacturer");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Miscellaneous);
            param.setUuid("b98595c2-3e43-41ee-8b4d-d94f607f4d55");
            param.setValue("RS2D");
            param.setDefaultValue("RS2D");
            return param;
        }
    },

    MODALITY("MODALITY") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("MODALITY");
            param.setDisplayedName("Modality");
            param.setDescription("Acquisition modality: MRI, NMR...");
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("f17ac2a9-9a3b-4c85-9ad2-a7772c04380f");
            param.setValue("NMR");
            param.setDefaultValue("NMR");
            param.setSuggestedValues(asList("NMR", "MRI", "PET", "DEFAULT"));
            param.setRestrictedToSuggested(true);
            return param;
        }
    },

    MODEL_NAME("MODEL_NAME") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("MODEL_NAME");
            param.setDisplayedName("INSTRUMENT_MODEL_NAME");
            param.setDescription("Model name");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Miscellaneous);
            param.setUuid("76a3ccbb-4bdd-4b2e-840a-eef0807f539d");
            param.setValue("");
            param.setDefaultValue("");
            return param;
        }
    },

    NUCLEUS_1("NUCLEUS_1") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("NUCLEUS_1");
            param.setDisplayedName("Nucleus 1");
            param.setDescription("Nucleus used for the first sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("f9f0a41e-8ac1-4512-9e00-c7b78450b9eb");
            param.setValue("1H");
            param.setDefaultValue("1H");
            param.setSuggestedValues(asList("Y", "Other", "X", "1H", "2H", "3H", "3He", "6Li", "7Li", "9Be", "10B", "11B", "13C", "14N", "15N", "17O", "19F", "21Ne", "23Na", "25Mg", "27Al", "29Si", "31P", "33S", "35Cl", "37Cl", "39K", "40K", "41K", "43Ca", "45Sc", "47Ti", "49Ti", "50V", "51V", "53Cr", "55Mn", "57Fe", "59Co", "61Ni", "63Cu", "65Cu", "67Zn", "69Ga", "71Ga", "73Ge", "75As", "77Se", "79Br", "81Br", "83Kr", "85Rb", "87Rb", "87Sr", "89Y", "91Zr", "93Nb", "95Mo", "97Mo", "99Tc", "99Ru", "101Ru", "103Rh", "105Pd", "107Ag", "109Ag", "111Cd", "113Cd", "113In", "115Sn", "115In", "117Sn", "119Sn", "121Sb", "123Te", "123Sb", "125Te", "127I", "129Xe", "131Xe", "133Cs", "135Ba", "137Ba", "138La", "139La", "141Pr", "143Nd", "145Nd", "147Sm", "149Sm", "151Eu", "153Eu", "155Gd", "157Gd", "159Tb", "161Dy", "163Dy", "165Ho", "167Er", "169Tm", "171Yb", "173Yb", "175Lu", "176Lu", "177Hf", "179Hf", "181Ta", "183W", "185Re", "187Re", "187Os", "189Os", "191Ir", "193Ir", "195Pt", "197Au", "199Hg", "201Hg", "203Tl", "205Tl", "207Pb", "209Bi", "235U"));
            param.setRestrictedToSuggested(true);
            return param;
        }
    },

    NUCLEUS_2("NUCLEUS_2") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("NUCLEUS_2");
            param.setDisplayedName("Nucleus 2");
            param.setDescription("Nucleus used for the second sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("0a7b6a77-7670-4c00-a5c8-935497608772");
            param.setValue("1H");
            param.setDefaultValue("1H");
            param.setSuggestedValues(asList("Y", "Other", "X", "1H", "2H", "3H", "3He", "6Li", "7Li", "9Be", "10B", "11B", "13C", "14N", "15N", "17O", "19F", "21Ne", "23Na", "25Mg", "27Al", "29Si", "31P", "33S", "35Cl", "37Cl", "39K", "40K", "41K", "43Ca", "45Sc", "47Ti", "49Ti", "50V", "51V", "53Cr", "55Mn", "57Fe", "59Co", "61Ni", "63Cu", "65Cu", "67Zn", "69Ga", "71Ga", "73Ge", "75As", "77Se", "79Br", "81Br", "83Kr", "85Rb", "87Rb", "87Sr", "89Y", "91Zr", "93Nb", "95Mo", "97Mo", "99Tc", "99Ru", "101Ru", "103Rh", "105Pd", "107Ag", "109Ag", "111Cd", "113Cd", "113In", "115Sn", "115In", "117Sn", "119Sn", "121Sb", "123Te", "123Sb", "125Te", "127I", "129Xe", "131Xe", "133Cs", "135Ba", "137Ba", "138La", "139La", "141Pr", "143Nd", "145Nd", "147Sm", "149Sm", "151Eu", "153Eu", "155Gd", "157Gd", "159Tb", "161Dy", "163Dy", "165Ho", "167Er", "169Tm", "171Yb", "173Yb", "175Lu", "176Lu", "177Hf", "179Hf", "181Ta", "183W", "185Re", "187Re", "187Os", "189Os", "191Ir", "193Ir", "195Pt", "197Au", "199Hg", "201Hg", "203Tl", "205Tl", "207Pb", "209Bi", "235U"));
            param.setRestrictedToSuggested(true);
            return param;
        }
    },

    NUCLEUS_3("NUCLEUS_3") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("NUCLEUS_3");
            param.setDisplayedName("Nucleus 3");
            param.setDescription("Nucleus used for the third sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("d2743ab6-99bc-4a2b-8625-3fb496b38b8a");
            param.setValue("1H");
            param.setDefaultValue("1H");
            param.setSuggestedValues(asList("Y", "Other", "X", "1H", "2H", "3H", "3He", "6Li", "7Li", "9Be", "10B", "11B", "13C", "14N", "15N", "17O", "19F", "21Ne", "23Na", "25Mg", "27Al", "29Si", "31P", "33S", "35Cl", "37Cl", "39K", "40K", "41K", "43Ca", "45Sc", "47Ti", "49Ti", "50V", "51V", "53Cr", "55Mn", "57Fe", "59Co", "61Ni", "63Cu", "65Cu", "67Zn", "69Ga", "71Ga", "73Ge", "75As", "77Se", "79Br", "81Br", "83Kr", "85Rb", "87Rb", "87Sr", "89Y", "91Zr", "93Nb", "95Mo", "97Mo", "99Tc", "99Ru", "101Ru", "103Rh", "105Pd", "107Ag", "109Ag", "111Cd", "113Cd", "113In", "115Sn", "115In", "117Sn", "119Sn", "121Sb", "123Te", "123Sb", "125Te", "127I", "129Xe", "131Xe", "133Cs", "135Ba", "137Ba", "138La", "139La", "141Pr", "143Nd", "145Nd", "147Sm", "149Sm", "151Eu", "153Eu", "155Gd", "157Gd", "159Tb", "161Dy", "163Dy", "165Ho", "167Er", "169Tm", "171Yb", "173Yb", "175Lu", "176Lu", "177Hf", "179Hf", "181Ta", "183W", "185Re", "187Re", "187Os", "189Os", "191Ir", "193Ir", "195Pt", "197Au", "199Hg", "201Hg", "203Tl", "205Tl", "207Pb", "209Bi", "235U"));
            param.setRestrictedToSuggested(true);
            return param;
        }
    },

    NUCLEUS_4("NUCLEUS_4") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("NUCLEUS_4");
            param.setDisplayedName("Nucleus 4");
            param.setDescription("Nucleus used for the fourth sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("917e4623-c216-4886-b142-64b201d6aa01");
            param.setValue("1H");
            param.setDefaultValue("1H");
            param.setSuggestedValues(asList("Y", "Other", "X", "1H", "2H", "3H", "3He", "6Li", "7Li", "9Be", "10B", "11B", "13C", "14N", "15N", "17O", "19F", "21Ne", "23Na", "25Mg", "27Al", "29Si", "31P", "33S", "35Cl", "37Cl", "39K", "40K", "41K", "43Ca", "45Sc", "47Ti", "49Ti", "50V", "51V", "53Cr", "55Mn", "57Fe", "59Co", "61Ni", "63Cu", "65Cu", "67Zn", "69Ga", "71Ga", "73Ge", "75As", "77Se", "79Br", "81Br", "83Kr", "85Rb", "87Rb", "87Sr", "89Y", "91Zr", "93Nb", "95Mo", "97Mo", "99Tc", "99Ru", "101Ru", "103Rh", "105Pd", "107Ag", "109Ag", "111Cd", "113Cd", "113In", "115Sn", "115In", "117Sn", "119Sn", "121Sb", "123Te", "123Sb", "125Te", "127I", "129Xe", "131Xe", "133Cs", "135Ba", "137Ba", "138La", "139La", "141Pr", "143Nd", "145Nd", "147Sm", "149Sm", "151Eu", "153Eu", "155Gd", "157Gd", "159Tb", "161Dy", "163Dy", "165Ho", "167Er", "169Tm", "171Yb", "173Yb", "175Lu", "176Lu", "177Hf", "179Hf", "181Ta", "183W", "185Re", "187Re", "187Os", "189Os", "191Ir", "193Ir", "195Pt", "197Au", "199Hg", "201Hg", "203Tl", "205Tl", "207Pb", "209Bi", "235U"));
            param.setRestrictedToSuggested(true);
            return param;
        }
    },

    NUMBER_OF_AVERAGES("NUMBER_OF_AVERAGES") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("NUMBER_OF_AVERAGES");
            param.setDisplayedName("Number of averages");
            param.setDescription("Number of average");
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("c2d47d1b-bec1-4b4f-a10e-973c9477fb52");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    Nb_2d("Nb_2d") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("Nb_2d");
            param.setDisplayedName("Nb_2d");
            param.setGroup(EnumGroup.Dimension);
            param.setCategory(Category.Acquisition);
            param.setUuid("734763b7-96a3-425d-b619-2caec6116360");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    Nb_3d("Nb_3d") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("Nb_3d");
            param.setDisplayedName("Nb_3d");
            param.setGroup(EnumGroup.Dimension);
            param.setCategory(Category.Acquisition);
            param.setUuid("33033964-2009-4f7f-95b4-39dd8b44552f");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    Nb_4d("Nb_4d") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("Nb_4d");
            param.setDisplayedName("Nb_4d");
            param.setGroup(EnumGroup.Dimension);
            param.setCategory(Category.Acquisition);
            param.setUuid("4f3b455c-006e-44d3-b7a1-beeff3704019");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    OBSERVED_FREQUENCY("OBSERVED_FREQUENCY") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("OBSERVED_FREQUENCY");
            param.setDisplayedName("Observed frequency");
            param.setDescription("Frequency of the acquisition");
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("189cd3b0-e524-49fd-922d-8e73a95170c9");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(6.3E7);
            return param;
        }
    },

    OBSERVED_NUCLEUS("OBSERVED_NUCLEUS") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("OBSERVED_NUCLEUS");
            param.setDisplayedName("Observed Nucleus");
            param.setDescription("Observed nucleus");
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("0ffc9cb5-ba62-418c-9ebc-06f0353cb5ad");
            param.setValue("1H");
            param.setDefaultValue("1H");
            param.setSuggestedValues(asList("Y", "Other", "X", "1H", "2H", "3H", "3He", "6Li", "7Li", "9Be", "10B", "11B", "13C", "14N", "15N", "17O", "19F", "21Ne", "23Na", "25Mg", "27Al", "29Si", "31P", "33S", "35Cl", "37Cl", "39K", "40K", "41K", "43Ca", "45Sc", "47Ti", "49Ti", "50V", "51V", "53Cr", "55Mn", "57Fe", "59Co", "61Ni", "63Cu", "65Cu", "67Zn", "69Ga", "71Ga", "73Ge", "75As", "77Se", "79Br", "81Br", "83Kr", "85Rb", "87Rb", "87Sr", "89Y", "91Zr", "93Nb", "95Mo", "97Mo", "99Tc", "99Ru", "101Ru", "103Rh", "105Pd", "107Ag", "109Ag", "111Cd", "113Cd", "113In", "115Sn", "115In", "117Sn", "119Sn", "121Sb", "123Te", "123Sb", "125Te", "127I", "129Xe", "131Xe", "133Cs", "135Ba", "137Ba", "138La", "139La", "141Pr", "143Nd", "145Nd", "147Sm", "149Sm", "151Eu", "153Eu", "155Gd", "157Gd", "159Tb", "161Dy", "163Dy", "165Ho", "167Er", "169Tm", "171Yb", "173Yb", "175Lu", "176Lu", "177Hf", "179Hf", "181Ta", "183W", "185Re", "187Re", "187Os", "189Os", "191Ir", "193Ir", "195Pt", "197Au", "199Hg", "201Hg", "203Tl", "205Tl", "207Pb", "209Bi", "235U"));
            param.setRestrictedToSuggested(true);
            return param;
        }
    },

    OFFSET_FREQ_1("OFFSET_FREQ_1") {
        public Param build() {
            HzPpmNumberParam param = new HzPpmNumberParam();
            param.setName("OFFSET_FREQ_1");
            param.setDisplayedName("Offset 1 [1H]");
            param.setDescription("Offset frequency of the first sequence channel");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("9f5dde6b-abc6-4061-9ca6-4e5e60b94184");
            param.setNumberEnum(NumberEnum.FrequencyOffset);
            param.setMinValue(-1.5E9);
            param.setMaxValue(1.5E9);
            param.setValue(0.0);
            param.setDefaultValue(0.0);
            param.setInitialNumberEnum(NumberEnum.FrequencyOffset);
            param.setUuidBaseFrequency("f0ef9625-a663-474a-b3b3-9c8784a84c51");
            return param;
        }
    },

    OFFSET_FREQ_2("OFFSET_FREQ_2") {
        public Param build() {
            HzPpmNumberParam param = new HzPpmNumberParam();
            param.setName("OFFSET_FREQ_2");
            param.setDisplayedName("Offset 2 [1H]");
            param.setDescription("Offset frequency of the second sequence channel");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("4c520aaa-9dca-42bf-9e9d-adffda208662");
            param.setNumberEnum(NumberEnum.FrequencyOffset);
            param.setMinValue(-1.5E9);
            param.setMaxValue(1.5E9);
            param.setValue(0.0);
            param.setDefaultValue(0.0);
            param.setInitialNumberEnum(NumberEnum.FrequencyOffset);
            param.setUuidBaseFrequency("3b242283-c4dd-43c7-bbcd-824e12526299");
            return param;
        }
    },

    OFFSET_FREQ_3("OFFSET_FREQ_3") {
        public Param build() {
            HzPpmNumberParam param = new HzPpmNumberParam();
            param.setName("OFFSET_FREQ_3");
            param.setDisplayedName("Offset 3 [1H]");
            param.setDescription("Offset frequency of the third sequence channel");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("383bde66-77a0-4d9f-b8c7-7d9f566efa7f");
            param.setNumberEnum(NumberEnum.FrequencyOffset);
            param.setMinValue(-1.5E9);
            param.setMaxValue(1.5E9);
            param.setValue(0.0);
            param.setDefaultValue(0.0);
            param.setInitialNumberEnum(NumberEnum.FrequencyOffset);
            param.setUuidBaseFrequency("b1b6fe4e-7684-4206-98cb-84b2600d5104");
            return param;
        }
    },

    OFFSET_FREQ_4("OFFSET_FREQ_4") {
        public Param build() {
            HzPpmNumberParam param = new HzPpmNumberParam();
            param.setName("OFFSET_FREQ_4");
            param.setDisplayedName("Offset 4 [1H]");
            param.setDescription("Offset frequency of the fourth sequence channel");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("775b66e5-4ae4-4d3c-a8e0-bb607c65ae64");
            param.setNumberEnum(NumberEnum.FrequencyOffset);
            param.setMinValue(-1.5E9);
            param.setMaxValue(1.5E9);
            param.setValue(0.0);
            param.setDefaultValue(0.0);
            param.setInitialNumberEnum(NumberEnum.FrequencyOffset);
            param.setUuidBaseFrequency("02340b1b-db11-4103-9b90-2c93bb81480e");
            return param;
        }
    },

    PAROPT_PARAM("PAROPT_PARAM") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("PAROPT_PARAM");
            param.setDisplayedName("Parameter optimised");
            param.setDescription("Name of the current optimised parameter");
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("2ee1475e-585c-47ba-97e6-c3e8c48edac3");
            param.setValue("PULSE_LENGTH");
            param.setDefaultValue("PULSE_LENGTH");
            return param;
        }
    },

    PHASE_0("PHASE_0") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("PHASE_0");
            param.setDisplayedName("PHASE_0");
            param.setDescription("PHASE_0.description");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Process);
            param.setUuid("ab693451-a49f-4eff-b8dc-d5c1b27244f0");
            param.setMinValue(-1.7976931348623157E308);
            param.setMaxValue(1.7976931348623157E308);
            param.setNumberEnum(NumberEnum.Double);
            param.setValue(asListNumber(0.0, 0.0, 0.0, 0.0));
            param.setDefaultValue(asListNumber(0.0, 0.0, 0.0, 0.0));
            return param;
        }
    },

    PHASE_1("PHASE_1") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("PHASE_1");
            param.setDisplayedName("PHASE_1");
            param.setDescription("PHASE_1.description");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Process);
            param.setUuid("2305e65f-fa4f-4d71-9bdc-79d7047a2dfd");
            param.setMinValue(-1.7976931348623157E308);
            param.setMaxValue(1.7976931348623157E308);
            param.setNumberEnum(NumberEnum.Double);
            param.setValue(asListNumber(0.0, 0.0, 0.0, 0.0));
            param.setDefaultValue(asListNumber(0.0, 0.0, 0.0, 0.0));
            return param;
        }
    },

    PHASE_APPLIED("PHASE_APPLIED") {
        public Param build() {
            BooleanParam param = new BooleanParam();
            param.setName("PHASE_APPLIED");
            param.setDisplayedName("PHASE_APPLIED");
            param.setDescription("PHASE_APPLIED");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Process);
            param.setUuid("353cb6c8-ecdc-4a5b-8ebe-49e83335b3d7");
            param.setValue(false);
            param.setDefaultValue(false);
            return param;
        }
    },

    PHASE_MOD("PHASE_MOD") {
        public Param build() {
            ListTextParam param = new ListTextParam();
            param.setName("PHASE_MOD");
            param.setDisplayedName("PHASE_MOD");
            param.setDescription("Phase Modulation Method, descriptive parameter that is meant to be used at the processing step.");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Process);
            param.setUuid("7eb28d62-86e7-40b3-85cd-074d7555e0aa");
            param.setValue(asList("NONE", "NONE", "NONE", "NONE"));
            param.setDefaultValue(asList("NONE", "NONE", "NONE", "NONE"));
            return param;
        }
    },

    PROBES("PROBES") {
        public Param build() {
            ListTextParam param = new ListTextParam();
            param.setName("PROBES");
            param.setDisplayedName("INSTRUMENT_PROBES");
            param.setDescription("The probes used for the acquisition.");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("a5437132-bb57-49d4-87a0-03fbf8062f72");
            return param;
        }
    },

    PatternDuration("PatternDuration") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("PatternDuration");
            param.setDisplayedName("PatternDuration");
            param.setGroup(EnumGroup.User);
            param.setCategory(Category.Acquisition);
            param.setUuid("f2e6878b-b4c7-4d83-a329-d11dfed4735f");
            param.setNumberEnum(NumberEnum.Time);
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setValue(1.9999999999999998E-5);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    Pre_scan("Pre_scan") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("Pre_scan");
            param.setDisplayedName("Pre_scan");
            param.setDescription("PreScan");
            param.setGroup(EnumGroup.Dimension);
            param.setCategory(Category.Acquisition);
            param.setUuid("20389f1e-bd82-4a68-b854-ebefa8be8321");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(0);
            param.setDefaultValue(0);
            return param;
        }
    },

    RECEIVER_COUNT("RECEIVER_COUNT") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("RECEIVER_COUNT");
            param.setDisplayedName("Receiver Count");
            param.setDescription("Number of receivers channel");
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("8d2be2b7-c84b-426d-9803-185ed169518d");
            param.setNumberEnum(NumberEnum.Integer);
            param.setMinValue(1);
            param.setMaxValue(32);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    RECEIVER_GAIN("RECEIVER_GAIN") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("RECEIVER_GAIN");
            param.setDisplayedName("RG");
            param.setDescription("Receiver gain");
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("bacd66ae-f756-4147-a813-f1052b1d05b8");
            param.setMinValue(0.0);
            param.setMaxValue(120.0);
            param.setNumberEnum(NumberEnum.RxGain);
            param.setValue(asListNumber(30.0));
            param.setDefaultValue(asListNumber(30.0));
            return param;
        }
    },

    SAMPLE_TEMPERATURE("SAMPLE_TEMPERATURE") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("SAMPLE_TEMPERATURE");
            param.setDisplayedName("Sample temperature");
            param.setDescription("SAMPLE_TEMPERATURE.description");
            param.setGroup(EnumGroup.Sample);
            param.setCategory(Category.Acquisition);
            param.setUuid("5443a857-be6b-4019-b09b-393071070005");
            param.setNumberEnum(NumberEnum.Temperature);
            param.setMinValue(0.0);
            param.setMaxValue(700.0);
            param.setValue(0.0);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    SEQUENCE_NAME("SEQUENCE_NAME") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("SEQUENCE_NAME");
            param.setDisplayedName("Sequence");
            param.setDescription("Name of the sequence");
            param.setLocked(true);
            param.setLockedToDefault(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("db0e13df-c47b-4715-9620-891afcb0a2ea");
            param.setValue("test_simple");
            param.setDefaultValue("test_simple");
            return param;
        }
    },

    SETUP_MODE("SETUP_MODE") {
        public Param build() {
            BooleanParam param = new BooleanParam();
            param.setName("SETUP_MODE");
            param.setDisplayedName("Setup");
            param.setDescription("True during setup process");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("f37da408-7c16-4f9e-82cc-203ebdc01d10");
            param.setValue(false);
            param.setDefaultValue(false);
            return param;
        }
    },

    SOFTWARE_VERSION("SOFTWARE_VERSION") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("SOFTWARE_VERSION");
            param.setDisplayedName("INSTRUMENT_SOFTWARE_VERSION");
            param.setDescription("Version of the software");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Miscellaneous);
            param.setUuid("dd3cde21-ba3b-4e87-8272-028fb45d76fd");
            param.setValue("");
            param.setDefaultValue("");
            return param;
        }
    },

    SOLVENT("SOLVENT") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("SOLVENT");
            param.setDisplayedName("Solvent");
            param.setDescription("Solvent used");
            param.setLocked(true);
            param.setGroup(EnumGroup.Sample);
            param.setCategory(Category.Miscellaneous);
            param.setUuid("6813f2d9-a659-49ab-9c07-9a902e142bd3");
            param.setValue("CDCl3");
            param.setDefaultValue("CDCl3");
            return param;
        }
    },

    SPECTRAL_WIDTH("SPECTRAL_WIDTH") {
        public Param build() {
            HzPpmNumberParam param = new HzPpmNumberParam();
            param.setName("SPECTRAL_WIDTH");
            param.setDisplayedName("SW");
            param.setDescription("Reception bandwidth");
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("6db216d8-2565-4d81-89af-6907244e4c24");
            param.setNumberEnum(NumberEnum.SW);
            param.setMinValue(0.0);
            param.setMaxValue(1.0E8);
            param.setValue(12500.0);
            param.setDefaultValue(12500.0);
            param.setInitialNumberEnum(NumberEnum.SW);
            param.setUuidBaseFrequency("189cd3b0-e524-49fd-922d-8e73a95170c9");
            return param;
        }
    },

    SPECTRAL_WIDTH_2D("SPECTRAL_WIDTH_2D") {
        public Param build() {
            HzPpmNumberParam param = new HzPpmNumberParam();
            param.setName("SPECTRAL_WIDTH_2D");
            param.setDisplayedName("SW 2D");
            param.setDescription("Spectral width in the second dimension");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("aa800133-fa32-4b59-93f2-8e33053c7ce9");
            param.setNumberEnum(NumberEnum.SW);
            param.setMinValue(0.0);
            param.setMaxValue(1.0E8);
            param.setValue(12500.0);
            param.setDefaultValue(12500.0);
            param.setInitialNumberEnum(NumberEnum.SW);
            param.setUuidBaseFrequency("5ae208f3-2495-4ae7-a03b-d0ceb1e36a58");
            return param;
        }
    },

    SPECTRAL_WIDTH_3D("SPECTRAL_WIDTH_3D") {
        public Param build() {
            HzPpmNumberParam param = new HzPpmNumberParam();
            param.setName("SPECTRAL_WIDTH_3D");
            param.setDisplayedName("SW 3D");
            param.setDescription("Spectral width in the third dimension");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("5fab86a4-d9ef-4534-afde-620f773ee3b7");
            param.setNumberEnum(NumberEnum.SW);
            param.setMinValue(0.0);
            param.setMaxValue(1.0E8);
            param.setValue(12500.0);
            param.setDefaultValue(12500.0);
            param.setInitialNumberEnum(NumberEnum.SW);
            param.setUuidBaseFrequency("189cd3b0-e524-49fd-922d-8e73a95170c9");
            return param;
        }
    },

    SPIN_RATE("SPIN_RATE") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("SPIN_RATE");
            param.setDisplayedName("Spin Rate");
            param.setDescription("SPIN_RATE.description");
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Acquisition);
            param.setUuid("4fc1cf5f-b36c-49d1-8fae-4eb2f13ceec5");
            param.setNumberEnum(NumberEnum.Integer);
            param.setMinValue(-2147483648);
            param.setMaxValue(2147483647);
            param.setValue(0);
            param.setDefaultValue(0);
            return param;
        }
    },

    SR("SR") {
        public Param build() {
            HzPpmListNumberParam param = new HzPpmListNumberParam();
            param.setName("SR");
            param.setDisplayedName("SR");
            param.setDescription("Chemical reference");
            param.setLocked(true);
            param.setGroup(EnumGroup.Reception);
            param.setCategory(Category.Acquisition);
            param.setUuid("0757c6fb-3e1b-40a1-8076-8ce85ac9536a");
            param.setMinValue(-1.5E9);
            param.setMaxValue(1.5E9);
            param.setNumberEnum(NumberEnum.FrequencyOffset);
            param.setValue(asListNumber(0.0, 0.0, 0.0, 0.0));
            param.setDefaultValue(asListNumber(0.0, 0.0, 0.0, 0.0));
            param.setInitialNumberEnum(NumberEnum.FrequencyOffset);
            param.setUuidBaseFrequency("189cd3b0-e524-49fd-922d-8e73a95170c9");
            return param;
        }
    },

    STATION_NAME("STATION_NAME") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("STATION_NAME");
            param.setDisplayedName("INSTRUMENT_STATION_NAME");
            param.setDescription("Station name");
            param.setLocked(true);
            param.setGroup(EnumGroup.Miscellaneous);
            param.setCategory(Category.Miscellaneous);
            param.setUuid("41652196-9081-45a5-9672-bf51599cd3ef");
            param.setValue("");
            param.setDefaultValue("");
            return param;
        }
    },

    TRANSFORM_PLUGIN("TRANSFORM_PLUGIN") {
        public Param build() {
            TextParam param = new TextParam();
            param.setName("TRANSFORM_PLUGIN");
            param.setDisplayedName("Transform plugin");
            param.setDescription("Plugin to reorder the sample into the dataset");
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("13f01547-0a9a-44f5-9660-f19121d56fa0");
            param.setValue("none");
            param.setDefaultValue("none");
            param.setSuggestedValues(asList("Bordered2D", "Bordered2D_FSE", "Centered2D", "Centered2D_FSE", "Centered2D_FSERot", "Centered2DRot", "EchoAntiechoTransform", "MapShim3DTransform", "SEEPISequential", "Sequential", "Sequential2D", "Sequential2DInterleaved", "Sequential4D", "Sequential4D_Dummy2D", "Sequential4DBackAndForth", "Sequential4DCine"));
            return param;
        }
    },

    TRANSMIT_FREQ_1("TRANSMIT_FREQ_1") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("TRANSMIT_FREQ_1");
            param.setDisplayedName("Transmit 1 [1H]");
            param.setDescription("Transmit frequency of the first sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("5dd79b47-f2c4-43c0-b42c-eedec51c6705");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(4.001170935E8);
            return param;
        }
    },

    TRANSMIT_FREQ_2("TRANSMIT_FREQ_2") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("TRANSMIT_FREQ_2");
            param.setDisplayedName("Transmit 2 [1H]");
            param.setDescription("Transmit frequency of the second sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("5ae208f3-2495-4ae7-a03b-d0ceb1e36a58");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    TRANSMIT_FREQ_3("TRANSMIT_FREQ_3") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("TRANSMIT_FREQ_3");
            param.setDisplayedName("Transmit 3 [1H]");
            param.setDescription("Transmit frequency of the third sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("ca5a3a92-dde4-42b0-9c16-192cf7c4dedd");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    TRANSMIT_FREQ_4("TRANSMIT_FREQ_4") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("TRANSMIT_FREQ_4");
            param.setDisplayedName("Transmit 4 [1H]");
            param.setDescription("Transmit frequency of the fourth sequence channel");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("d5728057-2c9e-4904-a303-93b5c600b598");
            param.setNumberEnum(NumberEnum.Frequency);
            param.setMinValue(0.0);
            param.setMaxValue(3.0E9);
            param.setValue(4.0011610519686484E8);
            param.setDefaultValue(0.0);
            return param;
        }
    },

    TX_ROUTE("TX_ROUTE") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("TX_ROUTE");
            param.setDisplayedName("TX_ROUTE");
            param.setDescription("LogCh->PhysCh");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("0ecf1b0a-e626-48d3-a145-a23a20b664b6");
            param.setMinValue(-2147483648);
            param.setMaxValue(2147483647);
            param.setNumberEnum(NumberEnum.Integer);
            param.setValue(asListNumber(0));
            return param;
        }
    },

    Tx_att("Tx_att") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("Tx_att");
            param.setDisplayedName("Tx_att");
            param.setLocked(true);
            param.setCategory(Category.Acquisition);
            param.setUuid("9ff52995-5cd9-42be-9207-373833fbc73d");
            param.setNumberEnum(NumberEnum.TxAtt);
            param.setMinValue(0.0);
            param.setMaxValue(63.0);
            param.setValue(30.0);
            param.setDefaultValue(30.0);
            return param;
        }
    },

    USER_MATRIX_DIMENSION_1D("USER_MATRIX_DIMENSION_1D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("USER_MATRIX_DIMENSION_1D");
            param.setDisplayedName("Matrix 1D");
            param.setDescription("Matrix size (USER_MATRIX_DIMENSION_1D)");
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("a9a34a2b-ec59-43e9-a883-efcb26d52a61");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(128);
            param.setDefaultValue(128);
            return param;
        }
    },

    USER_MATRIX_DIMENSION_2D("USER_MATRIX_DIMENSION_2D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("USER_MATRIX_DIMENSION_2D");
            param.setDisplayedName("Matrix 2D");
            param.setDescription("Matrix size (USER_MATRIX_DIMENSION_2D)");
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("01765a1b-3034-4b91-bcc4-7585bce2e8c2");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(128);
            param.setDefaultValue(128);
            return param;
        }
    },

    USER_MATRIX_DIMENSION_3D("USER_MATRIX_DIMENSION_3D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("USER_MATRIX_DIMENSION_3D");
            param.setDisplayedName("Matrix 3D");
            param.setDescription("Matrix size (USER_MATRIX_DIMENSION_3D)");
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("bf759e4b-2603-4711-8f23-4be746a0f8f8");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    USER_MATRIX_DIMENSION_4D("USER_MATRIX_DIMENSION_4D") {
        public Param build() {
            NumberParam param = new NumberParam();
            param.setName("USER_MATRIX_DIMENSION_4D");
            param.setDisplayedName("Matrix 4D");
            param.setDescription("Matrix size (USER_MATRIX_DIMENSION_4D)");
            param.setGroup(EnumGroup.Scan);
            param.setCategory(Category.Acquisition);
            param.setUuid("6619c660-eec5-4bd6-bd85-20461c3a45b3");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    r_amp("r_amp") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("r_amp");
            param.setDisplayedName("r_amp");
            param.setDescription("");
            param.setLocked(true);
            param.setCategory(Category.Acquisition);
            param.setUuid("1a485d7f-40e7-420b-add4-221145a797e5");
            param.setMinValue(0.0);
            param.setMaxValue(100.0);
            param.setNumberEnum(NumberEnum.TxAmp);
            param.setOrder(Order.One);
            param.setValue(asListNumber(0.0));
            return param;
        }
    },

    r_angle("r_angle") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("r_angle");
            param.setDisplayedName("r_angle");
            param.setLocked(true);
            param.setCategory(Category.Acquisition);
            param.setUuid("3785a6c2-ad30-4c94-96a0-7e73dc7a783e");
            param.setMinValue(0.0);
            param.setMaxValue(1.7976931348623157E308);
            param.setNumberEnum(NumberEnum.PulseAngle);
            param.setValue(asListNumber(90.0));
            param.setDefaultValue(asListNumber(90.0));
            return param;
        }
    },

    r_att("r_att") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("r_att");
            param.setDisplayedName("r_att");
            param.setDescription("");
            param.setLocked(true);
            param.setCategory(Category.Acquisition);
            param.setUuid("700f59c1-c0c7-4ac4-8166-129a0dc84050");
            param.setMinValue(0.0);
            param.setMaxValue(63.0);
            param.setNumberEnum(NumberEnum.TxAtt);
            param.setOrder(Order.One);
            param.setValue(asListNumber(0.0));
            return param;
        }
    },

    r_width("r_width") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("r_width");
            param.setDisplayedName("r_width");
            param.setDescription("");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("1c5228df-fd26-4185-b11e-79c02ff10a37");
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setNumberEnum(NumberEnum.Time);
            param.setOrder(Order.One);
            param.setValue(asListNumber(4.9999999999999996E-6));
            return param;
        }
    };

    //--

    private final String name;

    private U(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    //--

    private static List<Number> asListNumber(Number ... numbers) {
        return asList(numbers);
    }
}
