package com.netscapelabs.surpriseme.grocery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.netscapelabs.surpriseme.grocery.activity.OtpActivity;

public class Mainpagelogin extends AppCompatActivity {
    BottomSheetBehavior bottomSheetBehavior,bottomSheetBehaviorlogin;
    MaterialButton Register;
    MaterialButton Login,accountloginbtn;
    TextView forgottxt;
    ConstraintLayout bottomsheet,bottomsheetlogin;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpagelogin);
         bottomsheet=findViewById(R.id.bottomSheet1);
         bottomsheetlogin=findViewById(R.id.bottomSheetlogin);
         accountloginbtn=findViewById(R.id.accountlogin);
         Login=findViewById(R.id.loginBtn);
         Register=findViewById(R.id.account);
         forgottxt=findViewById(R.id.forgetpass);
         bottomSheetBehavior = BottomSheetBehavior.from(bottomsheet);
                 bottomSheetBehaviorlogin = BottomSheetBehavior.from(bottomsheetlogin);
                 findViewById(R.id.loginBtn).setOnClickListener(
                         new View.OnClickListener() {

                             @Override
                             public void onClick(View v) {

                                 if (bottomSheetBehaviorlogin.getState() != BottomSheetBehavior.STATE_EXPANDED) {
                                     bottomSheetBehaviorlogin.setState(BottomSheetBehavior.STATE_EXPANDED);
                                     accountloginbtn.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent intent = new Intent(Mainpagelogin.this, MainActivity.class);
                                             startActivity(intent);

                                         }
                                     });
                                     forgottxt.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent intent = new Intent(Mainpagelogin.this, OtpActivity.class);
                                             startActivity(intent);

                                         }
                                     });


                                 } else {
                                     bottomSheetBehaviorlogin.setState(BottomSheetBehavior.STATE_COLLAPSED);

                                 }
                             }
                         });


                 bottomSheetBehaviorlogin.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
                     @Override
                     public void onStateChanged(@NonNull View view, int newState) {
                         switch (newState) {
                             case BottomSheetBehavior.STATE_HIDDEN:
                                 break;
                             case BottomSheetBehavior.STATE_EXPANDED: {
                                 //  btn_bottom_sheet.setText("Close Sheet");
                             }
                             break;
                             case BottomSheetBehavior.STATE_COLLAPSED: {
                                 //  btn_bottom_sheet.setText("Expand Sheet");
                             }
                             break;
                             case BottomSheetBehavior.STATE_DRAGGING:
                                 break;
                             case BottomSheetBehavior.STATE_SETTLING:
                                 break;
                         }
                     }

                     @Override
                     public void onSlide(@NonNull View view, float v) {

                     }
                 });


                 findViewById(R.id.SignBtn1).setOnClickListener(new View.OnClickListener() {

                     @Override
                     public void onClick(View v) {

                         if (bottomSheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {
                             bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                             Register.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     Intent intent = new Intent(Mainpagelogin.this, OtpActivity.class);
                                     startActivity(intent);

                                 }
                             });

                         } else {
                             bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

                         }
                     }
                 });


                 bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
                     @Override
                     public void onStateChanged(@NonNull View view, int newState) {
                         switch (newState) {
                             case BottomSheetBehavior.STATE_HIDDEN:
                                 break;
                             case BottomSheetBehavior.STATE_EXPANDED: {
                                 //  btn_bottom_sheet.setText("Close Sheet");
                             }
                             break;
                             case BottomSheetBehavior.STATE_COLLAPSED: {
                                 //  btn_bottom_sheet.setText("Expand Sheet");
                             }
                             break;
                             case BottomSheetBehavior.STATE_DRAGGING:
                                 break;
                             case BottomSheetBehavior.STATE_SETTLING:
                                 break;
                         }
                     }

                     @Override
                     public void onSlide(@NonNull View view, float v) {

                     }
                 });
             }
         }