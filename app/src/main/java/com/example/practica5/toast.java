package com.example.practica5;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class toast extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    EditText editText3;
    RadioButton rbtn1;
    RadioButton rbtn2;
    RadioButton rbtn3;
    RadioButton rbtn4;
    RadioButton rbtn5;
    RadioButton rbtn6;
    Button btnMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        rbtn1 = findViewById(R.id.rbtn1);
        rbtn2 = findViewById(R.id.rbtn2);
        rbtn3 = findViewById(R.id.rbtn3);
        rbtn4 = findViewById(R.id.rbtn4);
        rbtn5 = findViewById(R.id.rbtn5);
        rbtn6 = findViewById(R.id.rbtn6);
        btnMostrar = findViewById(R.id.btnMostrar);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast pum = Toast.makeText(getApplicationContext(), editText3.getText(), Toast.LENGTH_LONG);
                //Todos las posibilidades
                if(rbtn1.isChecked() && (rbtn4.isChecked())){
                    pum.setGravity(Gravity.LEFT | Gravity.TOP, Integer.parseInt(editText1.getText().toString()), Integer.parseInt(editText2.getText().toString()));
                }
                else if(rbtn1.isChecked()&& (rbtn5.isChecked())){
                    pum.setGravity(Gravity.LEFT | Gravity.CENTER, Integer.parseInt(editText1.getText().toString()), Integer.parseInt(editText2.getText().toString()));
                }
                else if(rbtn1.isChecked()&& (rbtn6.isChecked())){
                    pum.setGravity(Gravity.LEFT | Gravity.BOTTOM, Integer.parseInt(editText1.getText().toString()), Integer.parseInt(editText2.getText().toString()));
                }
                else if(rbtn2.isChecked()&& (rbtn4.isChecked())){
                    pum.setGravity(Gravity.CENTER | Gravity.TOP, Integer.parseInt(editText1.getText().toString()), Integer.parseInt(editText2.getText().toString()));
                }
                else if(rbtn2.isChecked()&& (rbtn5.isChecked())){
                    pum.setGravity(Gravity.CENTER | Gravity.CENTER, Integer.parseInt(editText1.getText().toString()), Integer.parseInt(editText2.getText().toString()));
                }
                else if (rbtn2.isChecked()&& (rbtn6.isChecked())){
                    pum.setGravity(Gravity.CENTER | Gravity.BOTTOM, Integer.parseInt(editText1.getText().toString()), Integer.parseInt(editText2.getText().toString()));
                }
                else if (rbtn3.isChecked()&& (rbtn4.isChecked())){
                    pum.setGravity(Gravity.RIGHT | Gravity.TOP, Integer.parseInt(editText1.getText().toString()), Integer.parseInt(editText2.getText().toString()));
                }
                else if (rbtn3.isChecked()&& (rbtn5.isChecked())){
                    pum.setGravity(Gravity.RIGHT | Gravity.CENTER, Integer.parseInt(editText1.getText().toString()), Integer.parseInt(editText2.getText().toString()));
                }
                else if (rbtn3.isChecked()&& (rbtn6.isChecked())){
                    pum.setGravity(Gravity.RIGHT | Gravity.BOTTOM, Integer.parseInt(editText1.getText().toString()), Integer.parseInt(editText2.getText().toString()));
                }
                pum.show();
            }
        });
    }
}
