package com.example.adelina.lab2;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

    private OneFragment oneFragment;
    private TwoFragment twoFragment;
    private FragmentManager manager;
    private FragmentTransaction transaction;

    private TextView selection;
    private RadioGroup radioGroupProduct;
    private RadioGroup radioGroupFirma;
    private RadioButton radioButtonProduct;
    private RadioButton radioButtonFirma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
        oneFragment = new OneFragment();
        twoFragment = new TwoFragment();
        initOneFragment();
        initTwoFragment();
        //initTwoFragment();

    }

    private void initOneFragment() {
        transaction = manager.beginTransaction();
        transaction.add(R.id.container, oneFragment, OneFragment.TAG);
        transaction.commit();
    }

    private void initTwoFragment() {
        transaction = manager.beginTransaction();
        transaction.add(R.id.container, twoFragment, TwoFragment.TAG);
        transaction.commit();


    }

    public void OnCickFragment(View view) {

        selection = (TextView) findViewById(R.id.selection);
        radioGroupProduct = (RadioGroup) findViewById(R.id.radiogrpProduct);
        radioGroupFirma = (RadioGroup) findViewById(R.id.radiogrpFirma);
      //  transaction = manager.beginTransaction();
        switch (view.getId()) {
            case R.id.btnOk:
                //  if(manager.findFragmentByTag(OneFragment.TAG) != null) {

                int selectedProductId = radioGroupProduct.getCheckedRadioButtonId();
                int selectedFirmaId = radioGroupFirma.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioButtonProduct = (RadioButton) findViewById(selectedProductId);
                radioButtonFirma = (RadioButton) findViewById(selectedFirmaId);

                String strProduct = (String) radioButtonProduct.getText();
                String strFirma = (String) radioButtonFirma.getText();
                String strResult = getResources().getString(R.string.madeSelect);
                String strFinal = String.format(strResult, strProduct, strFirma);

                selection.setText(strFinal);
                //     transaction.add(R.id.container, twoFragment, TwoFragment.TAG);

                //   }
                break;
            case R.id.btnCancel:
              //  if (manager.findFragmentByTag(TwoFragment.TAG) != null) {
                    radioGroupProduct.clearCheck();
                    radioGroupFirma.clearCheck();
                    selection.setText("");
                 //   transaction.remove(twoFragment);
             //   }
                    break;
                }
               // transaction.addToBackStack(null);
              //  transaction.commit();
        }
    }

// public void addListenerOnButton() {

  //      selection = (TextView) findViewById(R.id.selection);
    //            btnOk = (Button) findViewById(R.id.btnOk);
      //          btnCancel = (Button) findViewById(R.id.btnCancel);
        //        radioGroupProduct = (RadioGroup) findViewById(R.id.radiogrpProduct);
          //      radioGroupFirma = (RadioGroup) findViewById(R.id.radiogrpFirma);
//
  //              btnOk.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {

        // get selected radio button from radioGroup
  //      int selectedProductId = radioGroupProduct.getCheckedRadioButtonId();
    //    int selectedFirmaId = radioGroupFirma.getCheckedRadioButtonId();

        // find the radiobutton by returned id
      //  radioButtonProduct = (RadioButton) findViewById(selectedProductId);
        //radioButtonFirma = (RadioButton) findViewById(selectedFirmaId);

        //String strProduct = (String)radioButtonProduct.getText();
        //String strFirma = (String)radioButtonFirma.getText();
        //String strResult = getResources().getString(R.string.madeSelect);
        //String strFinal = String.format(strResult, strProduct, strFirma);

        //selection.setText(strFinal);



        //}

        //});
        //btnCancel.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {

        // get selected radio button from radioGroup
  //      radioGroupProduct.clearCheck();
    //    radioGroupFirma.clearCheck();

      //  String strMakeSelect = getResources().getString(R.string.makeSelect);
        //selection.setText(strMakeSelect);
        //radioSexButton.getText(), Toast.LENGTH_SHORT).show();

        //}

        //});

        //}
