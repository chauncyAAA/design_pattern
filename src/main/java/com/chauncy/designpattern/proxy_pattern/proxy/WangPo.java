package com.chauncy.designpattern.proxy_pattern.proxy;

import com.chauncy.designpattern.proxy_pattern.KindWomen;

public class WangPo implements KindWomen {
    KindWomen kindWomen;

    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    public void setKindWomen(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyeWIthMan() {
        kindWomen.makeEyeWIthMan();
    }

    @Override
    public void happyWithMan() {
        kindWomen.happyWithMan();
    }
}
