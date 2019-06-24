# ArcRatingBar  
<img src="https://github.com/iceboy1369/ArcRatingBar/blob/master/Capture.JPG">

ArcRatingBar is very simple library that can just show 5 star just to show as curved mode.

	New Fiture:
		added custome fill star color and stroke star color


Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.iceboy1369:ArcRatingBar:1.2'
	}
  
  
Step 3. Use like this in xml layout...
 
	<ir.icegroup.curvedratingbar.RatingBar
		android:id="@+id/ratingBar"
		android:layout_width="80dp"
		android:layout_height="50dp"
		app:star_stroke_color="@color/colorPrimary"
		app:star_back_color="@color/colorAccent"
		app:star="3" />
   
        
Step 4. Set value...
 
	RatingBar ratingBar = findViewById(R.id.ratingBar);
    ratingBar.setStar(2);
   
        
