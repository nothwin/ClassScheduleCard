package com.qun.lib.classschedulecard.ui;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.qun.lib.classschedulecard.R;
import com.qun.lib.classschedulecard.bean.ClassBean;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/3 0003.
 */

public class ClassScheduleCardView extends LinearLayout {

    private LinearLayout mLl_l1;
    private LinearLayout mLl_l2;
    private LinearLayout mLl_l3;
    private LinearLayout mLl_l4;
    private LinearLayout mLl_l5;
    private LinearLayout mLl_l6;
    private LinearLayout mLl_l7;
    private Context mContext;
    private int[] colors = new int[]{
            Color.rgb(0xee, 0xff, 0xff),
            Color.rgb(0xff, 0x96, 0x99),
            Color.rgb(0x8c, 0x6f, 0x26),
            Color.rgb(0x00, 0xa6, 0xa9),
            Color.rgb(0x99, 0x6c, 0x33),
            Color.rgb(0x3b, 0x92, 0x6c),
            Color.rgb(0xd5, 0x4d, 0x34),
            Color.rgb(0xff, 0x96, 0x99),
            Color.rgb(0x8c, 0x6f, 0x26),
            Color.rgb(0x00, 0xa6, 0xa9),
            Color.rgb(0x99, 0x6c, 0x33),
            Color.rgb(0x00, 0xa6, 0xa9),
            Color.rgb(0x99, 0x6c, 0x33),
            Color.rgb(0x00, 0xa6, 0xa9),
            Color.rgb(0x99, 0x6c, 0x33),

    };

    public ClassScheduleCardView(Context context) {
        this(context, null);
    }

    public ClassScheduleCardView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ClassScheduleCardView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        initBaseView();
    }

    private void initBaseView() {
        View view = LayoutInflater.from(mContext).inflate(R.layout.class_schedule_card_view, this, true);
        mLl_l1 = view.findViewById(R.id.ll_l1);
        mLl_l2 = view.findViewById(R.id.ll_l2);
        mLl_l3 = view.findViewById(R.id.ll_l3);
        mLl_l4 = view.findViewById(R.id.ll_l4);
        mLl_l5 = view.findViewById(R.id.ll_l5);
        mLl_l6 = view.findViewById(R.id.ll_l6);
        mLl_l7 = view.findViewById(R.id.ll_l7);
    }

    public void setData(Map<Integer, List<ClassBean>> data) {
        for (Map.Entry<Integer, List<ClassBean>> entry : data.entrySet()) {
            int key = entry.getKey();
            List<ClassBean> value = entry.getValue();
            LinearLayout target = findContainerByKey(key);
            fillCell(target, value);
        }
    }

    private void fillCell(LinearLayout target, List<ClassBean> value) {
        for (int i = 0; i < value.size(); i++) {
            ClassBean bean = value.get(i);
            View view;
            if (TextUtils.isEmpty(bean.getClassName())) {
                view = new View(mContext);
            } else {
                view = LayoutInflater.from(mContext).inflate(R.layout.item_class, null, false);
                TextView className = view.findViewById(R.id.tv_class_name);
                TextView teacherName = view.findViewById(R.id.tv_teacher_name);
                TextView classroom = view.findViewById(R.id.tv_classroom);
                TextView time = view.findViewById(R.id.tv_time);
                className.setText(bean.getClassName());
                teacherName.setText(bean.getTeacherName());
                classroom.setText(bean.getClassroom());
                time.setText(bean.getTime());
                view.setBackgroundColor(colors[bean.getStartIndex()]);
            }
            int length = bean.getClassLength();
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
            LayoutParams.MATCH_PARENT,
            (int) (length * mContext.getResources().getDimension(R.dimen.class_index_cell_height)
                    )
            );
            view.setLayoutParams(lp);
            target.addView(view);
        }
    }

    private LinearLayout findContainerByKey(int key) {
        switch (key) {
            case 1:
                return mLl_l1;
            case 2:
                return mLl_l2;
            case 3:
                return mLl_l3;
            case 4:
                return mLl_l4;
            case 5:
                return mLl_l5;
            case 6:
                return mLl_l6;
            case 7:
                return mLl_l7;

        }
        return null;
    }

}
