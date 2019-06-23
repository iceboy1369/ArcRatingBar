package ir.icegroup.curvedratingbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class RatingBar extends LinearLayout {

    private ImageView star_1, star_2, star_3, star_4, star_5;
    private View view;

    private int star = 0;

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public RatingBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (layoutInflater != null) {
            view = layoutInflater.inflate(R.layout.curved_rating_bar, this, true);
        }

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.RatingBar, 0, 0);
        try {
            setRate(a.getInt(R.styleable.RatingBar_star,0));
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

    public void setRate(int rate){
        initStars();
        int rating = rate;

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
                star_1.setImageResource(R.drawable.star_checked);
                break;
            case 2:
                star_1.setImageResource(R.drawable.star_checked);
                star_2.setImageResource(R.drawable.star_checked);
                break;
            case 3:
                star_1.setImageResource(R.drawable.star_checked);
                star_2.setImageResource(R.drawable.star_checked);
                star_3.setImageResource(R.drawable.star_checked);
                break;
            case 4:
                star_1.setImageResource(R.drawable.star_checked);
                star_2.setImageResource(R.drawable.star_checked);
                star_3.setImageResource(R.drawable.star_checked);
                star_4.setImageResource(R.drawable.star_checked);
                break;
            case 5:
                star_1.setImageResource(R.drawable.star_checked);
                star_2.setImageResource(R.drawable.star_checked);
                star_3.setImageResource(R.drawable.star_checked);
                star_4.setImageResource(R.drawable.star_checked);
                star_5.setImageResource(R.drawable.star_checked);
                break;
        }
    }

    private void clearStars(){
        star_1.setImageResource(R.drawable.star_unchecked);
        star_2.setImageResource(R.drawable.star_unchecked);
        star_3.setImageResource(R.drawable.star_unchecked);
        star_4.setImageResource(R.drawable.star_unchecked);
        star_5.setImageResource(R.drawable.star_unchecked);
    }

    private void Image_size(int size){
        if (size>0) {
            star_1.setLayoutParams(new LayoutParams(size, size));
            star_2.setLayoutParams(new LayoutParams(size, size));
            star_3.setLayoutParams(new LayoutParams(size, size));
            star_4.setLayoutParams(new LayoutParams(size, size));
            star_5.setLayoutParams(new LayoutParams(size, size));
        }
    }

    private void initStars(){
        star_1 = view.findViewById(R.id.star_1);
        star_2 = view.findViewById(R.id.star_2);
        star_3 = view.findViewById(R.id.star_3);
        star_4 = view.findViewById(R.id.star_4);
        star_5 = view.findViewById(R.id.star_5);
        clearStars();
    }
}
