package rungta.tech.anaaj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import rungta.tech.anaaj.databinding.ActivityHomeBinding;
import rungta.tech.anaaj.databinding.ActivityResoursesBinding;

public class ResoursesActivity extends AppCompatActivity {

    ActivityResoursesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResoursesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLJ0aQdRQRZKydgUjFnTAhBm1Pg32-b9YC"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

    }
}