# android-material-design

Android provide following feature to build Material design App:

1) App theme to style UI 

2) Widget for complext view such as list and cards

3) New API for custom shadow and animation

    1. Styles and Themes
    
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
          
          
                

                  
                    
            
# android-material-design
