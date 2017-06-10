package dynatic.smartvocsensor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yyhyo on 2017-06-10.
 */

public class DrawingView extends View {
    public DrawingView(Context context) {
        super(context);
    }

    public DrawingView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawingView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setTextSize(22);
        paint.setAntiAlias(true);

        canvas.drawCircle(10, 10, 20, paint);

        /*
        Display display = getContext().getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        Log.e("Display Height / Width :", height + ", " + width);

        int radius = 40;
        int gap = 20;
        int strokeWidth = 5;
        int marginLeft = (width - (4 * (radius + strokeWidth)) - gap) / 2;
        int marginTop = (height - (4 * (radius + strokeWidth)) - gap) / 2;


        int x0 = marginLeft;
        int y0 = marginTop;

        Log.e("x0, y0", x0 + ", " + y0);

        Point[] cPoint = {
                new Point(x0 + radius + strokeWidth             , y0 + radius                             ),
                new Point(x0 + 3 * (radius + strokeWidth) + gap , y0 + radius                             ),
                new Point(x0 + radius + strokeWidth             , y0 + 3 * (radius + strokeWidth) + gap   ),
                new Point(x0 + 3 * (radius + strokeWidth) + gap , y0 + 3 * (radius + strokeWidth) + gap   )
        };
        UtilFunctions.cPoint = cPoint;
        UtilFunctions.radius = radius;
        UtilFunctions.stroke = strokeWidth;
        UtilFunctions.gap = gap;


        for (Point point : cPoint) {
            System.out.println("메인액티비티 원 포인트" + point);
        }


        Paint paint = new Paint();
        paint.setStrokeWidth(strokeWidth);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setTextSize(22);
        paint.setAntiAlias(true);

        //원
        //canvas.drawCircle(500, 1000, 100, paint);
        //canvas.drawCircle(1340, 2360, 100, paint);
        // TODO: 2016-04-05 일단 이렇게 가정 나중에 지울것

        canvas.drawCircle(cPoint[0].x, cPoint[0].y, radius, paint);
        canvas.drawCircle(cPoint[1].x, cPoint[1].y, radius, paint);
        canvas.drawCircle(cPoint[2].x, cPoint[2].y, radius, paint);
        canvas.drawCircle(cPoint[3].x, cPoint[3].y, radius, paint);
        */
    }
}
