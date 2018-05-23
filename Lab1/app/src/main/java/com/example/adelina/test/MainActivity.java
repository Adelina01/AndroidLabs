package com.example.adelina.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroupProduct;
    private RadioGroup radioGroupFirma;
    private RadioButton radioButtonProduct;
    private RadioButton radioButtonFirma;
    private TextView selection;
    private Button btnOk;
    private Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        addListenerOnButton();


    }

    public void addListenerOnButton() {

        selection = (TextView) findViewById(R.id.selection);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        radioGroupProduct = (RadioGroup) findViewById(R.id.radiogrpProduct);
        radioGroupFirma = (RadioGroup) findViewById(R.id.radiogrpFirma);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedProductId = radioGroupProduct.getCheckedRadioButtonId();
                int selectedFirmaId = radioGroupFirma.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioButtonProduct = (RadioButton) findViewById(selectedProductId);
                radioButtonFirma = (RadioButton) findViewById(selectedFirmaId);

                String strProduct = (String)radioButtonProduct.getText();
                String strFirma = (String)radioButtonFirma.getText();
                String strResult = getResources().getString(R.string.madeSelect);
                String strFinal = String.format(strResult, strProduct, strFirma);

                selection.setText(strFinal);



            }

        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                radioGroupProduct.clearCheck();
                radioGroupFirma.clearCheck();

                String strMakeSelect = getResources().getString(R.string.makeSelect);
                selection.setText(strMakeSelect);
                //radioSexButton.getText(), Toast.LENGTH_SHORT).show();

            }

        });

    }
}
