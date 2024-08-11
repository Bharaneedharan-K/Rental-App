package com.example.rentleapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class swiftbill extends AppCompatActivity {


    private EditText numberInput;
    private TextView resultTextView;

    private Button tootp;

    EditText name,Email,Phone,address,pin,accountno,ccv,time;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiftbill);


        name = findViewById(R.id.editTextText2);
        Email = findViewById(R.id.editTextTextEmailAddress2);
        Phone = findViewById(R.id.editTextPhone2);
        address = findViewById(R.id.editTextText3);
        pin = findViewById(R.id.editTextNumber);
        accountno = findViewById(R.id.editTextNumber2);
        ccv = findViewById(R.id.editTextNumber3);
        time = findViewById(R.id.numberInput);

        submit = findViewById(R.id.otpgo);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(name.getText().toString())){
                    name.setError("Field Reqirement");
                    return;
                }
                if (TextUtils.isEmpty(Email.getText().toString())){
                    Email.setError("Field Reqirement");
                    return;
                }
                if (TextUtils.isEmpty(Phone.getText().toString())){
                    Phone.setError("Field Reqirement");
                    return;
                }
                if (TextUtils.isEmpty(address.getText().toString())){
                    address.setError("Field Reqirement");
                    return;
                }
                if (TextUtils.isEmpty(pin.getText().toString())){
                    pin.setError("Field Reqirement");
                    return;
                }
                if (TextUtils.isEmpty(accountno.getText().toString())){
                    accountno.setError("Field Reqirement");
                    return;
                }
                if (TextUtils.isEmpty(ccv.getText().toString())){
                    ccv.setError("Field Reqirement");
                    return;
                }
                if (TextUtils.isEmpty(time.getText().toString())){
                    time.setError("Field Reqirement");
                    return;
                }
            }
        });




        tootp=findViewById(R.id.otpgo);
        tootp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(swiftbill.this, otp.class);
                startActivities(new Intent[]{intent});

            }
        });



        numberInput = findViewById(R.id.numberInput);
        resultTextView = findViewById(R.id.resultTextView);

        numberInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Not used
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calculateResult();
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Not used
            }
        });
    }

    private void calculateResult() {
        String input = numberInput.getText().toString();
        if (!input.isEmpty()) {
            int commonNumber = 450; // Replace with your desired common number
            int userInput = Integer.parseInt(input);
            int result = commonNumber * userInput;
            resultTextView.setText(String.valueOf(result));
        } else {
            resultTextView.setText(""); // Clear the result if the input is empty
        }
    }
}
