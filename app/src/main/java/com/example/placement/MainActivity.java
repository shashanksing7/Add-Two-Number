package com.example.placement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.placement.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    /*
    object of View BInding Class for this activity.
     */
    ActivityMainBinding binding;

    /*
    Variable to store our user input and output.
     */
    private  int Input1;
    private  int Input2;
    private  int Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
        Inflating the View.
         */
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        /*
        Adding listener to our button.
         */
        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
    Checking if the user has input any thing or not
    */
                String inputText1 = binding.txtNumber1.getText().toString();
                String inputText2 = binding.txtNumber2.getText().toString();

                if (!inputText1.isEmpty()) {
                    Input1 = Integer.parseInt(inputText1);
                } else {
                    Toast.makeText(MainActivity.this, "Enter Valid Number for Input 1", Toast.LENGTH_SHORT).show();
                }

                if (!inputText2.isEmpty()) {
                    Input2 = Integer.parseInt(inputText2);
                } else {
                    Toast.makeText(MainActivity.this, "Enter Valid Number for Input 2", Toast.LENGTH_SHORT).show();
                }

                if (!inputText1.isEmpty() && !inputText2.isEmpty()) {
                    try {
                        int result = Input1 + Input2;
                        binding.txtResult.setText(String.valueOf(result));
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "Error: " + e.toString(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}