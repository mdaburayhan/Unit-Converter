package com.arsoftltd.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        editText = findViewById(R.id.editText);
        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.textView);


        // Button click listener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString().trim(); // Trim to remove leading/trailing spaces
                if (!inputText.isEmpty()){
                    // Converting a String into double
                    double kilos = Double.parseDouble(inputText);

                    double pounds = makeConversion(kilos);

                    textView.setText(String.format("%.2f", pounds));
                }else {
                    editText.setError("Enter a value");
                }





            }
        });



    }


    public double makeConversion(double kilos){
        //1 kilo = 2.20462 pounds

        return kilos * 2.20462;


    }




}