package com.rojintypeandrun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etMake, etYear, etColor, etPrice, etSize;
    private Button btnCreate;
    private TextView tvRes;
    private int vehicleCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMake = findViewById(R.id.etMake);
        etYear = findViewById(R.id.etYear);
        etColor = findViewById(R.id.etColor);
        etPrice = findViewById(R.id.etPrice);
        etSize = findViewById(R.id.etSize);
        btnCreate = findViewById(R.id.btnCreate);
        tvRes = findViewById(R.id.tvRes);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validate()) {
                    String name = etMake.getText().toString();
                    int year = Integer.parseInt(etYear.getText().toString());
                    String color = etColor.getText().toString();
                    float enginesize = Float.parseFloat(etSize.getText().toString());
                    float price = Float.parseFloat(etPrice.getText().toString());
                    vehicleCount++;
                    String heading = "This is vehicle no." + vehicleCount + "\n";
                    String body = "Manufacture: " + name + "| Color: " + color + "" + "| Price" + price + "\n\n";
                    tvRes.append(heading + body);

                }
            }
        });


    }

    private boolean validate() {
        if (TextUtils.isEmpty(etMake.getText().toString())) {
            etMake.setError("Please enter name");
            etMake.requestFocus();
            return false;

        }

        if (TextUtils.isEmpty(etYear.getText().toString())) {
            etMake.setError("Please enter year");
            etMake.requestFocus();
            return false;

        }

        if (TextUtils.isEmpty(etPrice.getText().toString())) {
            etMake.setError("Please enter price");
            etMake.requestFocus();
            return false;

        }

        if (TextUtils.isEmpty(etColor.getText().toString())) {
            etMake.setError("Please enter color");
            etMake.requestFocus();
            return false;

        }
        if (TextUtils.isEmpty(etSize.getText().toString())) {
            etMake.setError("Please enter size");
            etMake.requestFocus();
            return false;

        }
        return true;
    }
}
