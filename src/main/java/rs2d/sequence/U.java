//-- generated code, will be overwritten at each recompilation

package rs2d.sequence;

import rs2d.spinlab.tools.param.*;
import rs2d.spinlab.tools.table.*;
import rs2d.spinlab.tools.role.RoleEnum;
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
            param.setUuid("d6a582b7-561c-4af7-adc6-ddace1771673");
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
            param.setUuid("de23b72f-5898-49d4-848d-a5ce3e2f1295");
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
            param.setUuid("62dec9a9-5d31-426d-8248-7135f396c146");
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
            param.setUuid("69317341-5eb7-4652-8393-fb439f94270c");
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
            param.setUuid("a4e53c1d-5a1d-4795-b2eb-6201ef0fb9e4");
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
            param.setUuid("33ce82c2-ccf9-4634-bcee-62ae4cf86179");
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
            param.setUuid("fac4927f-d653-4332-a413-752c93a1ae24");
            param.setNumberEnum(NumberEnum.Time);
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setValue(1.0);
            param.setDefaultValue(1.0);
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
            param.setUuid("7dd550c9-6627-42c0-88b5-cdf9bad8fa1d");
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
            param.setUuid("9f46a86f-d1af-4c56-bc78-87eef14cf0c9");
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
            param.setUuid("2436ca74-ddc0-4231-a4f5-d8573eb5dacd");
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
            param.setUuid("3812ba82-ac62-467c-86a1-e1f9d08d21dd");
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
            param.setUuid("c2b13fc5-a3e1-4a3f-8802-7d4dd9e4ede9");
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
            param.setUuid("32b80999-61d9-4187-b1e4-bd6a8f33a866");
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
            param.setUuid("7f838b3d-4b22-4446-b152-4776f743f411");
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
            param.setUuid("09bd431f-cb48-4fd7-bfb7-06737aaf2de4");
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
            param.setUuid("71951c53-c5e7-4e7c-988b-853a99b65f8c");
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
            param.setUuid("902e4f33-d731-4cf9-b33c-274471ffa95c");
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
            param.setUuid("f405ee21-9e97-46ba-89ed-611a72a403d7");
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
            param.setUuid("51cec751-e738-4eb7-b267-3995848e0abc");
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
            param.setUuid("3dca1a19-e232-4374-bd48-8f64b2d47d2e");
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
            param.setUuid("8173dfd7-f65e-4d45-a585-1ee7379349e0");
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
            param.setUuid("20b0dcb3-b66a-4b6a-8345-8f52d81a46b8");
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
            param.setUuid("60dffb90-8e34-41c9-b650-d151ba00f7a6");
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
            param.setUuid("f1e8dc1b-1f1b-4832-aa22-6b861ffdfe7e");
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
            param.setUuid("71176efa-5e9e-444d-ad29-830e883caab9");
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
            param.setUuid("1b4031c5-c8c2-4285-85fb-f636af23add1");
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
            param.setUuid("85a37bb8-9bdd-4008-866a-5e66ef5659ef");
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
            param.setUuid("8fa8929e-2ec8-4865-a9e2-1762b0e26572");
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
            param.setUuid("244be64f-67ed-4d1a-812d-6a9448a9a2a0");
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
            param.setUuid("fc7b377f-e0c8-473b-9b09-f1505cafe978");
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
            param.setUuid("010ee8ad-0951-4e3f-9d6e-522ecd2c91d0");
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
            param.setUuid("1fc6d7ee-16ee-43e5-91f3-e69bf89bee58");
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
            param.setUuid("44c258fb-f8b2-4c8d-a5b3-91577ede67d9");
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
            param.setUuid("f53e22e3-f827-448e-9b97-87ec73019a9e");
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
            param.setUuid("40433781-bd82-4ba6-be4e-c878617e0376");
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
            param.setUuid("6f698774-e5a3-400c-a3ba-5f1fe9a8e3ba");
            param.setNumberEnum(NumberEnum.FrequencyOffset);
            param.setMinValue(-1.5E9);
            param.setMaxValue(1.5E9);
            param.setValue(0.0);
            param.setDefaultValue(0.0);
            param.setInitialNumberEnum(NumberEnum.FrequencyOffset);
            param.setUuidBaseFrequency("7dd550c9-6627-42c0-88b5-cdf9bad8fa1d");
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
            param.setUuid("81c3dd52-0713-40ca-b8e8-732c4b09f10e");
            param.setNumberEnum(NumberEnum.FrequencyOffset);
            param.setMinValue(-1.5E9);
            param.setMaxValue(1.5E9);
            param.setValue(0.0);
            param.setDefaultValue(0.0);
            param.setInitialNumberEnum(NumberEnum.FrequencyOffset);
            param.setUuidBaseFrequency("9f46a86f-d1af-4c56-bc78-87eef14cf0c9");
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
            param.setUuid("c91a2987-5ad3-49cb-a421-82c721151940");
            param.setNumberEnum(NumberEnum.FrequencyOffset);
            param.setMinValue(-1.5E9);
            param.setMaxValue(1.5E9);
            param.setValue(0.0);
            param.setDefaultValue(0.0);
            param.setInitialNumberEnum(NumberEnum.FrequencyOffset);
            param.setUuidBaseFrequency("2436ca74-ddc0-4231-a4f5-d8573eb5dacd");
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
            param.setUuid("b0435c86-0766-48fa-b9ee-0a6a3bec781e");
            param.setNumberEnum(NumberEnum.FrequencyOffset);
            param.setMinValue(-1.5E9);
            param.setMaxValue(1.5E9);
            param.setValue(0.0);
            param.setDefaultValue(0.0);
            param.setInitialNumberEnum(NumberEnum.FrequencyOffset);
            param.setUuidBaseFrequency("3812ba82-ac62-467c-86a1-e1f9d08d21dd");
            return param;
        }
    },

    P2_width("P2_width") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("P2_width");
            param.setDisplayedName("P2_width");
            param.setDescription("");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("4b470191-308b-447d-96c0-810509226069");
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setNumberEnum(NumberEnum.Time);
            param.setOrder(Order.One);
            param.setValue(asListNumber(9.999999999999999E-6));
            return param;
        }
    },

    P3_width("P3_width") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("P3_width");
            param.setDisplayedName("P3_width");
            param.setDescription("");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("b3a872a1-35b1-4aeb-94da-c4fb35de17ad");
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setNumberEnum(NumberEnum.Time);
            param.setOrder(Order.One);
            param.setValue(asListNumber(9.999999999999999E-6));
            return param;
        }
    },

    P4_width("P4_width") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("P4_width");
            param.setDisplayedName("P4_width");
            param.setDescription("");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("4cc1e78f-fd42-48d5-8ba5-d828c0a80f4d");
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setNumberEnum(NumberEnum.Time);
            param.setOrder(Order.One);
            param.setValue(asListNumber(9.999999999999999E-6));
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
            param.setUuid("6e11adeb-c306-4039-a652-61d418f91fcb");
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
            param.setUuid("14148d91-8a9d-4cc7-9c67-0ddd33a05fc2");
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
            param.setUuid("fb42d88a-e481-4273-9d14-95622447db18");
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
            param.setUuid("49d8f88f-ada2-47f6-bf19-e6c7836d8976");
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
            param.setUuid("b84cd04f-19f4-4ca5-b0bb-f8f3bd4c51ad");
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
            param.setUuid("119a7cac-812d-4b45-ab10-fb8b6a27e8e2");
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
            param.setUuid("c2f23bbd-bbbe-413f-b37a-18079af2f265");
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
            param.setUuid("c5382703-9ad2-435e-9c18-e73e5805dcfd");
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
            param.setUuid("cc235194-1e6f-4f89-a5bf-80ee24f020d3");
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
            param.setUuid("dba28ca3-3b7f-400e-9ad0-4c18ca8caa57");
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
            param.setUuid("7a88b1c6-96f3-4919-833b-e88d662d72bc");
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
            param.setUuid("4c66b75c-4b17-4f1b-a972-3ef46f38f16f");
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
            param.setUuid("efbdb94f-6310-407d-9e29-c6f81df18904");
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
            param.setUuid("c3cf0e92-b39c-4289-8f91-0d45afdf2655");
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
            param.setUuid("9ca5227a-b1ea-4069-a5ee-dbd02237df34");
            param.setNumberEnum(NumberEnum.SW);
            param.setMinValue(0.0);
            param.setMaxValue(1.0E8);
            param.setValue(12500.0);
            param.setDefaultValue(12500.0);
            param.setInitialNumberEnum(NumberEnum.SW);
            param.setUuidBaseFrequency("f53e22e3-f827-448e-9b97-87ec73019a9e");
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
            param.setUuid("8d027767-a22d-41f2-8518-2d1278ee4c2e");
            param.setNumberEnum(NumberEnum.SW);
            param.setMinValue(0.0);
            param.setMaxValue(1.0E8);
            param.setValue(12500.0);
            param.setDefaultValue(12500.0);
            param.setInitialNumberEnum(NumberEnum.SW);
            param.setUuidBaseFrequency("480eb958-50e0-4840-8690-06a6508ad7e1");
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
            param.setUuid("7528ed93-4606-4978-b2d2-5a0385633417");
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
            param.setUuid("dfbf883c-fdc6-4bbc-a692-26035d5a6588");
            param.setMinValue(-1.5E9);
            param.setMaxValue(1.5E9);
            param.setNumberEnum(NumberEnum.FrequencyOffset);
            param.setValue(asListNumber(0.0, 0.0, 0.0, 0.0));
            param.setDefaultValue(asListNumber(0.0, 0.0, 0.0, 0.0));
            param.setInitialNumberEnum(NumberEnum.FrequencyOffset);
            param.setUuidBaseFrequency("f53e22e3-f827-448e-9b97-87ec73019a9e");
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
            param.setUuid("f284f48c-aa98-4169-a23e-f08053e8212e");
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
            param.setUuid("68164ee9-89ed-47f6-a089-08b845f4ad20");
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
            param.setUuid("9ca5a455-0ae9-4079-aeca-600ef627708f");
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
            param.setUuid("480eb958-50e0-4840-8690-06a6508ad7e1");
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
            param.setUuid("0ccb14c3-5f7d-4db2-ac00-3b90a4415d9e");
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
            param.setUuid("514489f2-7de6-419a-a3f2-a9ab10a902ba");
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
            param.setUuid("1186192f-dce6-4bf5-9666-44b50191ebf0");
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
            param.setUuid("400eaaae-83ba-4a5c-91fb-27ae3aacc2a7");
            param.setNumberEnum(NumberEnum.TxAtt);
            param.setMinValue(0.0);
            param.setMaxValue(63.0);
            param.setValue(0.0);
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
            param.setUuid("014c8d0a-01c1-4691-8936-8bf024df437b");
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
            param.setUuid("40513cc9-b685-42c5-b683-1188594f1772");
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
            param.setUuid("3264b4f6-7d48-4f00-8423-e2e086bd2c44");
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
            param.setUuid("9621435a-f869-4630-b5e7-460a25810ba3");
            param.setNumberEnum(NumberEnum.Scan);
            param.setMinValue(0);
            param.setMaxValue(2147483647);
            param.setValue(1);
            param.setDefaultValue(1);
            return param;
        }
    },

    _width66("_width66") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("_width66");
            param.setDisplayedName("_width66");
            param.setDescription("");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("ed362124-d39f-471b-86cd-07a1bec53aac");
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setNumberEnum(NumberEnum.Time);
            param.setOrder(Order.One);
            param.setValue(asListNumber(1.9574999999999998E-5));
            return param;
        }
    },

    _width67("_width67") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("_width67");
            param.setDisplayedName("_width67");
            param.setDescription("");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("57576a10-d41e-4a3e-ab76-4e853b1a79ef");
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setNumberEnum(NumberEnum.Time);
            param.setOrder(Order.One);
            param.setValue(asListNumber(1.305E-5));
            return param;
        }
    },

    _width68("_width68") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("_width68");
            param.setDisplayedName("_width68");
            param.setDescription("");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("8aedc01b-d9e3-446f-92e3-f54090188404");
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setNumberEnum(NumberEnum.Time);
            param.setOrder(Order.One);
            param.setValue(asListNumber(2.609E-5));
            return param;
        }
    },

    _width69("_width69") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("_width69");
            param.setDisplayedName("_width69");
            param.setDescription("");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("d840354a-90cd-4cd9-9bc5-50690855f849");
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setNumberEnum(NumberEnum.Time);
            param.setOrder(Order.One);
            param.setValue(asListNumber(6.525E-6));
            return param;
        }
    },

    _width70("_width70") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("_width70");
            param.setDisplayedName("_width70");
            param.setDescription("");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("fb6faffa-cea0-4cb6-89ac-8f00443ca650");
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setNumberEnum(NumberEnum.Time);
            param.setOrder(Order.One);
            param.setValue(asListNumber(3.9135E-5));
            return param;
        }
    },

    _width71("_width71") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("_width71");
            param.setDisplayedName("_width71");
            param.setDescription("");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("07ffe08e-4621-4b21-a2ee-db8bf6121fd5");
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setNumberEnum(NumberEnum.Time);
            param.setOrder(Order.One);
            param.setValue(asListNumber(1.305E-5));
            return param;
        }
    },

    _width72("_width72") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("_width72");
            param.setDisplayedName("_width72");
            param.setDescription("");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("f0f8d872-ed18-4c17-bb5e-f97c06d6370e");
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setNumberEnum(NumberEnum.Time);
            param.setOrder(Order.One);
            param.setValue(asListNumber(2.609E-5));
            return param;
        }
    },

    _width73("_width73") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("_width73");
            param.setDisplayedName("_width73");
            param.setDescription("");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("2b7c01e7-54a4-4d0c-b70a-b3699fa3f462");
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setNumberEnum(NumberEnum.Time);
            param.setOrder(Order.One);
            param.setValue(asListNumber(3.9135E-5));
            return param;
        }
    },

    p_amp("p_amp") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("p_amp");
            param.setDisplayedName("p_amp");
            param.setDescription("");
            param.setLocked(true);
            param.setCategory(Category.Acquisition);
            param.setUuid("f7f7ddbe-8d98-425d-8a16-00b9d8b910b6");
            param.setMinValue(0.0);
            param.setMaxValue(100.0);
            param.setNumberEnum(NumberEnum.TxAmp);
            param.setOrder(Order.One);
            param.setValue(asListNumber(10.0));
            return param;
        }
    },

    p_angle("p_angle") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("p_angle");
            param.setDisplayedName("p_angle");
            param.setLocked(true);
            param.setCategory(Category.Acquisition);
            param.setUuid("5e11e824-124e-48f4-8e9a-5088c28579d4");
            param.setMinValue(0.0);
            param.setMaxValue(1.7976931348623157E308);
            param.setNumberEnum(NumberEnum.PulseAngle);
            param.setValue(asListNumber(90.0));
            param.setDefaultValue(asListNumber(90.0));
            return param;
        }
    },

    p_att("p_att") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("p_att");
            param.setDisplayedName("p_att");
            param.setDescription("");
            param.setLocked(true);
            param.setCategory(Category.Acquisition);
            param.setUuid("6138e67d-d592-4172-aa97-393874c5364a");
            param.setMinValue(0.0);
            param.setMaxValue(63.0);
            param.setNumberEnum(NumberEnum.TxAtt);
            param.setOrder(Order.One);
            param.setValue(asListNumber(0.0));
            return param;
        }
    },

    p_width("p_width") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("p_width");
            param.setDisplayedName("p_width");
            param.setDescription("");
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("2e5ad89a-9fb6-466c-b7af-410045b35bcc");
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setNumberEnum(NumberEnum.Time);
            param.setOrder(Order.One);
            param.setValue(asListNumber(1.305E-5));
            return param;
        }
    },

    p_width2("p_width2") {
        public Param build() {
            ListNumberParam param = new ListNumberParam();
            param.setName("p_width2");
            param.setDisplayedName("p_width2");
            param.setDescription("");
            param.setLocked(true);
            param.setGroup(EnumGroup.Emission);
            param.setCategory(Category.Acquisition);
            param.setUuid("47f993ef-0c98-48f9-a3ef-d07d9c08b7c1");
            param.setMinValue(0.0);
            param.setMaxValue(1.0E9);
            param.setNumberEnum(NumberEnum.Time);
            param.setOrder(Order.One);
            param.setValue(asListNumber(9.999999999999999E-6));
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