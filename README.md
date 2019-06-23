# ArcRatingBar

ArcRatingBar is very simple library that can just show 5 star just to show as curved mode.


Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.iceboy1369:ArcRatingBar:1.0'
	}
  
  
Step 3. Use like this in xml layout...
  
  <ir.icegroup.curvedratingbar.RatingBar
        android:layout_width="80dp"
        android:layout_height="50dp"
        app:star="2"/>
        
Step 4. Set value...
    RatingBar ratingBar = findViewById(R.id.ratingBar);
    ratingBar.setStar= 2;
