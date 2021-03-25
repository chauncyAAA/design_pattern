package com.chauncy.designpattern.abstract_factory_pattern;

public enum HumanEnum {
    YellowMaleHuman("com.chauncy.designpattern.abstract_factory_pattern.YellowMaleHuman"),
    YellowFemaleHuman("com.chauncy.designpattern.abstract_factory_pattern.YellowFemaleHuman"),
    WhiteFemaleHuman("com.chauncy.designpattern.abstract_factory_pattern.WhiteFemaleHuman"),
    WhiteMaleHuman("com.chauncy.designpattern.abstract_factory_pattern.WhiteMaleHuman"),
    BlackFemaleHuman("com.chauncy.designpattern.abstract_factory_pattern.BlackFemaleHuman"),
    BlackMaleHuman("com.chauncy.designpattern.abstract_factory_pattern.BlackMaleHuman");

    private String value = "";

    HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
