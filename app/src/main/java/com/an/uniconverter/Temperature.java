package com.an.uniconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Temperature extends AppCompatActivity {

    EditText etInput2, etOutput2;
    RadioGroup rgInput2, rgOutput2;
    String inputRdChecked, outputRdChecked;
    RadioButton rb1Input2, rb2Input2, rb3Input2, rb1Output2, rb2Output2, rb3Output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        etInput2 = (EditText) findViewById(R.id.etInput);
        etOutput2 = (EditText) findViewById(R.id.etOutput);
        rgInput2 = (RadioGroup) findViewById(R.id.rgInput);
        rgOutput2 = (RadioGroup) findViewById(R.id.rgOutput);
        rb1Input2 = (RadioButton)findViewById(R.id.rb1Input);
        rb2Input2 = (RadioButton)findViewById(R.id.rb2Input);
        rb3Input2 = (RadioButton)findViewById(R.id.rb3Input);
        rb1Output2 = (RadioButton)findViewById(R.id.rb1Output);
        rb2Output2 = (RadioButton)findViewById(R.id.rb2Output);
        rb3Output2 = (RadioButton)findViewById(R.id.rb3Output);


        int indexInput = rgInput2.getCheckedRadioButtonId();
        RadioButton rbInput = (RadioButton)findViewById(indexInput);
        inputRdChecked = rbInput.getText().toString();

        int indexOutput = rgOutput2.getCheckedRadioButtonId();
        RadioButton rbOutput = (RadioButton)findViewById(indexOutput);
        outputRdChecked = rbOutput.getText().toString();

        result(inputRdChecked, outputRdChecked);

        rgInput2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // int etInput3 = Integer.parseInt(etInput2.getText().toString());

                int i = rgInput2.getCheckedRadioButtonId();
                RadioButton r = (RadioButton)findViewById(i);
                inputRdChecked = r.getText().toString();

                result(inputRdChecked, outputRdChecked);

                // etOutput2.setText(""+"");
            }
        });

        rgOutput2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                int j = rgOutput2.getCheckedRadioButtonId();
                RadioButton ra = (RadioButton)findViewById(j);
                outputRdChecked = ra.getText().toString();

                result(inputRdChecked, outputRdChecked);


            }
        });

        etInput2.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                String a = etInput2.getText().toString();
                if (a.matches("")){
                    etInput2.setText("" + 0);
                }

                result(inputRdChecked, outputRdChecked);

            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });

    }
    public void result(String a, String b){
        int etInput3 = Integer.parseInt(etInput2.getText().toString());


        if (a.equals(rb1Input2.getText().toString()) && b.equals(rb1Output2.getText().toString())){
            double calc = etInput3 * 1;
            etOutput2.setText("" + calc);
        } else  if (a.equals(rb1Input2.getText().toString()) && b.equals(rb2Output2.getText().toString())){
            double calc = etInput3 * 33.8;
            etOutput2.setText("" + calc);
        } else if (a.equals(rb1Input2.getText().toString()) && b.equals(rb3Output2.getText().toString())){
            double calc = etInput3 * 274.15;
            etOutput2.setText("" + calc);
        } else if (a.equals(rb2Input2.getText().toString()) && b.equals(rb1Output2.getText().toString())){
            double calc = etInput3 * -17.2222;
            etOutput2.setText("" + calc);
        } else if (a.equals(rb2Input2.getText().toString()) && b.equals(rb2Output2.getText().toString())){
            double calc = etInput3 * 1;
            etOutput2.setText("" + calc);
        } else if (a.equals(rb2Input2.getText().toString()) && b.equals(rb3Output2.getText().toString())){
            double calc = etInput3 * 255.928;
            etOutput2.setText("" + calc);
        } else if (a.equals(rb3Input2.getText().toString()) && b.equals(rb1Output2.getText().toString())){
            double calc = etInput3 * -272.15;
            etOutput2.setText("" + calc);
        } else if (a.equals(rb3Input2.getText().toString()) && b.equals(rb2Output2.getText().toString())){
            double calc = etInput3 * -457.87;
            etOutput2.setText("" + calc);
        } else if (a.equals(rb3Input2.getText().toString()) && b.equals(rb3Output2.getText().toString())){
            double calc = etInput3 * 1;
            etOutput2.setText("" + calc);
        }


    }
}
