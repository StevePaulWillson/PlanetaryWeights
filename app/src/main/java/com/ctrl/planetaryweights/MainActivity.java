package com.ctrl.planetaryweights;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double currentWeightValue = 0,
            weightMercuryValue = 0,
            weightVenusValue = 0,
            weightMarsValue = 0,
            weightJupiterValue = 0,
            weightEarthValue = 0,
            weightSaturnValue = 0,
            weightUranusValue = 0,
            weightNeptuneValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void planetaryWeights(View view) {
        String currentWeightString = ((EditText) findViewById(R.id.currentWeight)).getText().toString();

        TextView weightMercuryTextView = (TextView) findViewById(R.id.weightOnMercury);
        TextView weightMercuryValueTextView = (TextView) findViewById(R.id.weightOnMercuryValue);

        TextView weightVenusTextView = (TextView) findViewById(R.id.weightOnVenus);
        TextView weightVenusValueTextView = (TextView) findViewById(R.id.weightOnVenusValue);

        TextView weightEarthTextView = (TextView) findViewById(R.id.weightOnEarth);
        TextView weightEarthValueTextView = (TextView) findViewById(R.id.weightOnEarthValue);

        TextView weightMarsTextView = (TextView) findViewById(R.id.weightOnMars);
        TextView weightMarsValueTextView = (TextView) findViewById(R.id.weightOnMarsValue);

        TextView weightJupiterTextView = (TextView) findViewById(R.id.weightOnJupiter);
        TextView weightJupiterValueTextView = (TextView) findViewById(R.id.weightOnJupiterValue);

        TextView weightSaturnTextView = (TextView) findViewById(R.id.weightOnSaturn);
        TextView weightSaturnValueTextView = (TextView) findViewById(R.id.weightOnSaturnValue);

        TextView weightUranusTextView = (TextView) findViewById(R.id.weightOnUranus);
        TextView weightUranusValueTextView = (TextView) findViewById(R.id.weightOnUranusValue);

        TextView weightNeptuneTextView = (TextView) findViewById(R.id.weightOnNeptune);
        TextView weightNeptuneValueTextView = (TextView) findViewById(R.id.weightOnNeptuneValue);

        if (currentWeightString.matches("")) {

            weightMercuryTextView.setText("");
            weightMercuryValueTextView.setText("");

            weightVenusTextView.setText("");
            weightVenusValueTextView.setText("");

            weightEarthTextView.setText("");
            weightEarthValueTextView.setText("");

            weightMarsTextView.setText("");
            weightMarsValueTextView.setText("");

            weightJupiterTextView.setText("");
            weightJupiterValueTextView.setText("");

            weightSaturnTextView.setText("");
            weightSaturnValueTextView.setText("");

            weightUranusTextView.setText("");
            weightUranusValueTextView.setText("");

            weightNeptuneTextView.setText("");
            weightNeptuneValueTextView.setText("");

            Toast.makeText(this, "Enter Current Weight", Toast.LENGTH_SHORT).show();
            return;
        } else {
            currentWeightValue = Double.parseDouble(currentWeightString);

            weightMercuryValue = currentWeightValue * 0.38;
            weightVenusValue = currentWeightValue * 0.91;
            weightEarthValue = currentWeightValue;
            weightMarsValue = currentWeightValue * 0.38;
            weightJupiterValue = currentWeightValue * 2.54;
            weightSaturnValue = currentWeightValue * 1.08;
            weightUranusValue = currentWeightValue * 0.91;
            weightNeptuneValue = currentWeightValue * 1.19;
            DecimalFormat form = new DecimalFormat("0.00");

            weightMercuryTextView.setText("Weight on Mercury");
            weightMercuryValueTextView.setText("" + form.format(weightMercuryValue));

            weightVenusTextView.setText("Weight on Venus");
            weightVenusValueTextView.setText("" + form.format(weightVenusValue));

            weightEarthTextView.setText("Weight on Earth");
            weightEarthValueTextView.setText("" + form.format(weightEarthValue));

            weightMarsTextView.setText("Weight on Mars");
            weightMarsValueTextView.setText("" + form.format(weightMarsValue));

            weightJupiterTextView.setText("Weight on Jupiter");
            weightJupiterValueTextView.setText("" + form.format(weightJupiterValue));

            weightSaturnTextView.setText("Weight on Saturn");
            weightSaturnValueTextView.setText("" + form.format(weightSaturnValue));

            weightUranusTextView.setText("Weight on Uranus");
            weightUranusValueTextView.setText("" + form.format(weightUranusValue));

            weightNeptuneTextView.setText("Weight on Neptune");
            weightNeptuneValueTextView.setText("" + form.format(weightNeptuneValue));
        }
    }
}