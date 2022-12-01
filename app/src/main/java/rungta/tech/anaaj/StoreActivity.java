package rungta.tech.anaaj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import rungta.tech.anaaj.databinding.ActivityStatsBinding;
import rungta.tech.anaaj.databinding.ActivityStoreBinding;

public class StoreActivity extends AppCompatActivity {

    ActivityStoreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStoreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.pump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.amazon.in/s?k=water+pump&crid=20IRF84D0RVZP&sprefix=water+pump+%2Caps%2C2227&ref=nb_sb_noss_2"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        binding.sensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.amazon.in/Techtonics-Capacitive-Soil-Moisture-Sensor/dp/B08GG6T6N8/ref=sr_1_13?keywords=Moisture+Sensor&qid=1669831843&qu=eyJxc2MiOiI0LjA3IiwicXNhIjoiMy43OSIsInFzcCI6IjMuMjMifQ%3D%3D&sr=8-13"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });



        binding.node.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.amazon.in/Lolin-NodeMCU-ESP8266-CP2102-Wireless/dp/B010O1G1ES/ref=sr_1_5?adgrpid=80753216109&ext_vrnc=hi&gclid=Cj0KCQiAm5ycBhCXARIsAPldzoU8-bSO3JGdAyrQk1BuzB84-mpkCFw77xKFQ7Qnd1z1PJAUGNBS2RoaAmS1EALw_wcB&hvadid=398045439073&hvdev=c&hvlocphy=1007799&hvnetw=g&hvqmt=b&hvrand=4305191553702576738&hvtargid=kwd-816885619576&hydadcr=25624_2177361&keywords=nodemcu+esp8266+wifi+module&qid=1669831370&qu=eyJxc2MiOiIyLjg1IiwicXNhIjoiMi42OCIsInFzcCI6IjIuMzcifQ%3D%3D&sr=8-5"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        binding.relay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.amazon.in/ERH-India-Relay-Module-Channel/dp/B093WHQHB5/ref=sr_1_1?adgrpid=57784712326&ext_vrnc=hi&gclid=Cj0KCQiAm5ycBhCXARIsAPldzoVZzaW-VUE_hVMlqsfU8l1v1ryEnuoSmgLviB2mQ9ZV10N9mZRISTwaAjPwEALw_wcB&hvadid=294141455465&hvdev=c&hvlocphy=1007799&hvnetw=g&hvqmt=b&hvrand=5630096524727089343&hvtargid=kwd-27688460652&hydadcr=26462_1900820&keywords=relay+5v+dc&qid=1669831576&qu=eyJxc2MiOiIzLjc5IiwicXNhIjoiMy4yMiIsInFzcCI6IjAuODEifQ%3D%3D&sr=8-1"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}