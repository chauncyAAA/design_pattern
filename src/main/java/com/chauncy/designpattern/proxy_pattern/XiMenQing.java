package com.chauncy.designpattern.proxy_pattern;

import com.chauncy.designpattern.proxy_pattern.proxy.WangPo;

public class XiMenQing {
    public static void main(String[] args) {
        WangPo wangPo = new WangPo(new PanJingLian()); // 潘金莲
        wangPo.happyWithMan();
        wangPo.setKindWomen(new JiaShi()); // 贾氏
        wangPo.makeEyeWIthMan();
    }
}
