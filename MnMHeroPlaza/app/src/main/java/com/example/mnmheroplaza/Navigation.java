package com.example.mnmheroplaza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Navigation extends AppCompatActivity {
    Button PowersBtn;
    Button AbilitiesBtn;
    Button AdvantagesBtn;
    Button SkillsBtn;
    Button EquipmentBtn;
    Button DetailsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        PowersBtn = findViewById(R.id.nav_btn_powers);
        AbilitiesBtn = findViewById(R.id.nav_btn_abilities);
        AdvantagesBtn = findViewById(R.id.nav_btn_advantages);
        SkillsBtn = findViewById(R.id.nav_btn_skills);
        EquipmentBtn = findViewById(R.id.nav_btn_equipment);
        DetailsBtn = findViewById(R.id.nav_btn_details);

        PowersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Navigation.this, Powers.class));
            }
        });

        AbilitiesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Navigation.this, Abilities.class));
            }
        });

        AdvantagesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Navigation.this, Advantages.class));
            }
        });

        SkillsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Navigation.this, Skills.class));
            }
        });

        EquipmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Navigation.this, Equipment.class));
            }
        });

        DetailsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Navigation.this, Details.class));
            }
        });
    }
}