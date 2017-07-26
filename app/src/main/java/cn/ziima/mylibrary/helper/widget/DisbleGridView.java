package cn.ziima.mylibrary.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.GridView;

/**
 * Created by Auser on 2017/1/6.
 */
public class DisbleGridView extends GridView {
    public DisbleGridView(Context context) {
        super(context);
    }

    public DisbleGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DisbleGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if(ev.getAction() == MotionEvent.ACTION_MOVE)
        {
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }

}
