package com.example.shoesapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class ProductsActivity extends AppCompatActivity {
    BottomNavigationView btnavview;
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        btnavview = findViewById(R.id.bottomNavigation);
        btnavview.setSelectedItemId(R.id.account);

        //dieu huong den cac trang
        btnavview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(), AccountDDNActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:

                        return true;
                    case R.id.search:

                        return true;
                    case R.id.notification:

                        return true;
                }
                return false;
            }
        });

        rv= findViewById(R.id.recyclerview_nike);
        List<String> name = new ArrayList<>();
        name.add("hehe");
        name.add("erewre");
        name.add("ewrwer");
        name.add("hehe");
        name.add("erewre");
        name.add("ewrwer");
        name.add("hehe");
        name.add("erewre");
        name.add("ewrwer");
        name.add("hehe");
        name.add("erewre");
        name.add("ewrwer");
        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ProductsAdapter adapter = new ProductsAdapter(this, name);
        rv.setAdapter(adapter);

    }
}
