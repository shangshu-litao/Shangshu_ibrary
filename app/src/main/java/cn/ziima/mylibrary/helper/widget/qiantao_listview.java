package cn.ziima.mylibrary.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by Auser on 2017/1/17.
 */

public class qiantao_listview extends ListView {
    public qiantao_listview(Context context) {
        super(context);
    }

    public qiantao_listview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public qiantao_listview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

}
