package com.qun.test.classschedulecard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.qun.lib.classschedulecard.bean.ClassBean;
import com.qun.lib.classschedulecard.ui.ClassScheduleCardView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ClassScheduleCardView mCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCard = findViewById(R.id.csc);
        mCard.setData(getData());
    }

    private Map<Integer, List<ClassBean>> getData() {
        Map<Integer, List<ClassBean>> maps = new HashMap<>();
        maps.put(1, create1());
        maps.put(2, create2());
        maps.put(4, create4());
        maps.put(5, create5());
        return maps;
    }
    private List<ClassBean> create5() {
        List<ClassBean> list = new ArrayList<>();
        list.add(new ClassBean(0, 1, "商务英语", "隔壁老王", "301大教室", "10:00-11:00"));
        list.add(new ClassBean(1, 2, "商务英语", "隔壁老王", "301大教室", "10:00-11:00"));
        list.add(new ClassBean(3, 1, "商务英语", "隔壁老王", "301大教室", "10:00-11:00"));
        list.add(new ClassBean(4, 3, "商务英语", "隔壁老王", "301大教室", "10:00-11:00"));
        list.add(new ClassBean(7, 1, "商务英语3", "隔壁老王3", "301大教室", "10:00-11:00"));
        list.add(new ClassBean(8, 1, "", "", "", ""));
        list.add(new ClassBean(9, 1, "", "", "", ""));
        list.add(new ClassBean(10, 1, "", "", "", ""));
        return list;
    }
    private List<ClassBean> create4() {
        List<ClassBean> list = new ArrayList<>();
        list.add(new ClassBean(0, 1, "", "", "", ""));
        list.add(new ClassBean(1, 2, "商务英语", "隔壁老王", "301大教室", "10:00-11:00"));
        list.add(new ClassBean(3, 1, "", "", "", ""));
        list.add(new ClassBean(4, 3, "", "", "", ""));
        list.add(new ClassBean(7, 1, "商务英语3", "隔壁老王3", "301大教室", "10:00-11:00"));
        list.add(new ClassBean(8, 1, "", "", "", ""));
        list.add(new ClassBean(9, 1, "", "", "", ""));
        list.add(new ClassBean(10, 1, "", "", "", ""));
        return list;
    }

    private List<ClassBean> create1() {
        List<ClassBean> list = new ArrayList<>();
        list.add(new ClassBean(0, 1, "", "", "", ""));
        list.add(new ClassBean(1, 2, "商务英语", "隔壁老王", "301大教室", "10:00-11:00"));
        list.add(new ClassBean(3, 1, "", "", "", ""));
        list.add(new ClassBean(4, 3, "商务英语2", "隔壁老王2", "302大教室", "<10:00-11:00"));
        list.add(new ClassBean(7, 1, "商务英语3", "隔壁老王3", "301大教室", "10:00-11:00"));
        list.add(new ClassBean(8, 1, "", "", "", ""));
        list.add(new ClassBean(9, 1, "商务英语", "隔壁老王", "301大教室", "10:00-11:00"));
        list.add(new ClassBean(10, 1, "", "", "", ""));
        return list;
    }
    private List<ClassBean> create2() {
        List<ClassBean> list = new ArrayList<>();
        list.add(new ClassBean(0, 1, "商务英语2", "隔壁老王3", "301大教室", "10:00-11:00"));
        list.add(new ClassBean(1, 2, "", "", "", ""));
        list.add(new ClassBean(3, 1, "商务英语2", "隔壁老王3", "301大教室", ""));
        list.add(new ClassBean(4, 3, "", "", "","" ));
        list.add(new ClassBean(7, 1, "", "", "", ""));
        list.add(new ClassBean(8, 1, "商务英语", "隔壁老王", "301大教室", "10:00-11:00"));
        list.add(new ClassBean(9, 1, "商务英语", "隔壁老王", "301大教室", "10:00-11:00"));
        list.add(new ClassBean(10, 1, "", "", "", ""));
        return list;
    }
}
