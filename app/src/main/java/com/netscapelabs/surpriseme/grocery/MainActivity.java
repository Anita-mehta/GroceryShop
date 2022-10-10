package com.netscapelabs.surpriseme.grocery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.netscapelabs.surpriseme.grocery.fragment.Account;
import com.netscapelabs.surpriseme.grocery.fragment.AlllistFragemnt;
import com.netscapelabs.surpriseme.grocery.fragment.Cardviewfragment;
import com.netscapelabs.surpriseme.grocery.fragment.Shopcard;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView navView;
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navShop:
                loadFragment(new AlllistFragemnt());
                return true;

            case R.id.navHome:
                loadFragment(new Shopcard());

                return true;
            case R.id.navOrder:
                loadFragment(new Cardviewfragment());
                  return true;
            case R.id.navAccount:
                loadFragment(new Account());
                return true;

        }
        return false;



};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navView = findViewById(R.id.navView);
        navView.setOnNavigationItemSelectedListener(this);
        loadFragment(new Shopcard());
    }
private void loadFragment(Fragment fragment) {
//// load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment, "frag 1");
        //  transaction.addToBackStack("frag 1");
        transaction.commit();
        }

        }




