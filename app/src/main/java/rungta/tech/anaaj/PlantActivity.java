package rungta.tech.anaaj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import rungta.tech.anaaj.databinding.ActivityHomeBinding;
import rungta.tech.anaaj.databinding.ActivityPlantBinding;

public class PlantActivity extends AppCompatActivity {

    ActivityPlantBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPlantBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());    }
}