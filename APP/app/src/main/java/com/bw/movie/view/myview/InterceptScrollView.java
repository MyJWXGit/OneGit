package com.bw.movie.view.myview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/**
 * @name APP
 * @class name：com.bw.movie.view.myview
 * @class describe
 * @anthor 24673
 * @time 2019/11/20 15:24
 * @change
 * @chang time
 * @class describe
 */
public class InterceptScrollView extends ScrollView {
    private int lastInterceptX;
    private int lastInterceptY;

    public InterceptScrollView(Context context) {
        super(context);
    }

    public InterceptScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public InterceptScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        super.onInterceptTouchEvent(ev);
        boolean intercept = false;
        int x = (int) ev.getX();
        int y = (int) ev.getY();
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                intercept = false;
                break;
            case MotionEvent.ACTION_MOVE:
                int deltaX = x - lastInterceptX;
                int deltaY = y - lastInterceptY;
                //如果是垂直滑动，则拦截
                if (Math.abs(deltaX) - Math.abs(deltaY) < 0) {
                    intercept = true;
                } else {
                    intercept = false;
                }

                break;
            case MotionEvent.ACTION_UP:
                intercept = false;
                break;
        }
        lastInterceptX = x;
        lastInterceptY = y;
        super.onInterceptTouchEvent(ev);//这一句一定不能漏掉，否则无法拦截事件
        return intercept;
    }
}
