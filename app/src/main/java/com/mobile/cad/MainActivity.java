package com.mobile.cad;

import android.os.Bundle;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Создаем простой интерфейс-заглушку в стиле CAD (темный фон рабочей зоны)
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.parseColor("#2b2b2b")); // Темный цвет рабочего поля CAD

        TextView title = new TextView(this);
        title.setText("MobileCAD (DesignSpark Style)");
        title.setTextColor(Color.WHITE);
        title.setTextSize(20);
        title.setPadding(40, 60, 40, 20);
        
        layout.addView(title);
        setContentView(layout);
    }
}
