# android-material-design

Android provide following feature to build Material design App:

1) App theme to style UI 

2) Widget for complext view such as list and cards

3) New API for custom shadow and animation

    1. _Styles and Themes_
    
        A style is a collection of attributes 
        that specify the appearance for a single View
        
        A theme is a type of style that's applied to an entire app,
         activity, or view hierarchy, not just an individual view
    
        1.1.Create and Apply a Style
        
            Define in styles.xml in res dir
            <?xml version="1.0" encoding="utf-8"?>
            <resources>
                <style name="GreenText" parent="TextAppearance.AppCompat">
                    <item name="android:textColor">#00FF00</item>
                </style>
            </resources>
            
            Apply
            
            to view
            <TextView
                style="@style/GreenText"
                ... />
            to viewGroup
            
                android:theme="@style/TextTheme1"
    
        1.2.Extend and customize a style  
        
            <style name="GreenText" parent="@android:style/TextAppearance">
                <item name="android:textColor">#00FF00</item>
            </style>
            
        1.3 Apply a style as a theme

            <manifest ... >
                <application android:theme="@style/Theme.AppCompat" ... >
                </application>
            </manifest>
            
             <activity android:theme="@style/Theme.AppCompat.Light" ... >
                  </activity>
             
          1.4 Add version-specific styles
          
                res/values/styles.xml        # themes for all versions
                res/values-v21/styles.xml    # themes for API level 21+ only
    
    2. _Adaptive Icon_
    
        2.1 Creating adaptive icons in XML
        
             <application
                            …
                            android:icon="@mipmap/ic_launcher"
                            android:roundIcon="@mipmap/ic_launcher_round"
                            …>
                        </application>
            
            <adaptive-icon>
                        <background android:drawable="@color/ic_background"/>
                        <foreground android:drawable="@mipmap/ic_foreground"/>
                    </adaptive-icon>
                    
    3. Floating Action Button
    
        <android.support.design.widget.FloatingActionButton
                android:id="@+id/fab"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="end|bottom"
                android:src="@drawable/ic_my_icon"
                android:layout_margin="16dp" />
                
                
2) Animation
    1. Property Animation
        
        Duration 
        
        Time Interpolation
        
        Repeat Count and behaviour
        
        Animation Set
        
        Frame Refresh Delay
        
      Value Animator Object keep track of animation Timing.  
        
    
                
    
                
                
            
            
        
          
                

                  
                    
    