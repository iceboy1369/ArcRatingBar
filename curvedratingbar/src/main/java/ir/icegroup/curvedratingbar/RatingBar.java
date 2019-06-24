package ir.icegroup.curvedratingbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.DrawableCompat;

public class RatingBar extends LinearLayout {

    private ImageView star_1, star_2, star_3, star_4, star_5;
    private View view;
    private static int rating = 0;
    private Drawable star_color, star_stroke_color;

    public RatingBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (layoutInflater != null) {
            view = layoutInflater.inflate(R.layout.curved_rating_bar, this, true);
        }
        initStars();

        star_color = getResources().getDrawable(R.drawable.star_checked);
        star_stroke_color = getResources().getDrawable(R.drawable.star_unchecked);

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.RatingBar, 0, 0);
        try {
            setStar(a.getInt(R.styleable.RatingBar_star,0));
            DrawableCompat.setTint(star_stroke_color, a.getColor(R.styleable.RatingBar_star_stroke_color
                    ,getResources().getColor(R.color.star_stroke_color)));
            DrawableCompat.setTint(star_color, a.getColor(R.styleable.RatingBar_star_back_color
                    ,getResources().getColor(R.color.star_fill_color)));
        } finally {
            a.recycle();
        }

    }
    public RatingBar(Context context, AttributeSet attrs, int theme) {
        super(context, attrs, theme);
    }
    public RatingBar(Context context) {
        super(context);
    }

    public void setStar(int rate){
        initStars();
        rating = rate;

        if (rating<0) rating = 0;
        if (rating>5) rating = 5;

        clearStars();

        star_1 = view.findViewById(R.id.star_1);
        star_2 = view.findViewById(R.id.star_2);
        star_3 = view.findViewById(R.id.star_3);
        star_4 = view.findViewById(R.id.star_4);
        star_5 = view.findViewById(R.id.star_5);

        switch (rating){
            case 0:
                break;
            case 1:
                star_1.setImageDrawable(star_color);
                break;
            case 2:
                star_1.setImageDrawable(star_color);
                star_2.setImageDrawable(star_color);
                break;
            case 3:
                star_1.setImageDrawable(star_color);
                star_2.setImageDrawable(star_color);
                star_3.setImageDrawable(star_color);
                break;
            case 4:
                star_1.setImageDrawable(star_color);
                star_2.setImageDrawable(star_color);
                star_3.setImageDrawable(star_color);
                star_4.setImageDrawable(star_color);
                break;
            case 5:
                star_1.setImageDrawable(star_color);
                star_2.setImageDrawable(star_color);
                star_3.setImageDrawable(star_color);
                star_4.setImageDrawable(star_color);
                star_5.setImageDrawable(star_color);
                break;
        }
    }

    private void clearStars(){
        star_1.setImageDrawable(star_stroke_color);
        star_2.setImageDrawable(star_stroke_color);
        star_3.setImageDrawable(star_stroke_color);
        star_4.setImageDrawable(star_stroke_color);
        star_5.setImageDrawable(star_stroke_color);
    }

    private void initStars(){
        star_1 = view.findViewById(R.id.star_1);
        star_2 = view.findViewById(R.id.star_2);
        star_3 = view.findViewById(R.id.star_3);
        star_4 = view.findViewById(R.id.star_4);
        star_5 = view.findViewById(R.id.star_5);
        clearStars();
    }

    private int getStars(){
        return rating;
    }
}
