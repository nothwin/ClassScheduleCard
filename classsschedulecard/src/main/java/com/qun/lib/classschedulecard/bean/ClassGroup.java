package com.qun.lib.classschedulecard.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/4/3 0003.
 */

public class ClassGroup {
    private int dayIndex;
    private List<ClassBean> mClassBeanList;

    public int getDayIndex() {
        return dayIndex;
    }

    public void setDayIndex(int dayIndex) {
        this.dayIndex = dayIndex;
    }

    public List<ClassBean> getClassBeanList() {
        return mClassBeanList;
    }

    public void setClassBeanList(List<ClassBean> classBeanList) {
        mClassBeanList = classBeanList;
    }
}
