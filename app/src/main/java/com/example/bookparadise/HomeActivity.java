package com.example.bookparadise;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bookparadise.adapters.libraryAdapter;
import com.example.bookparadise.models.Library;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    Button btn_fetch;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_review:
                Intent intent = new Intent(HomeActivity.this, ReviewActivity.class);
                startActivity(intent);
                return true;

            case R.id.action_logout:
                Intent intent1 = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent1);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

            btn_fetch=findViewById(R.id.btn_fetch);
            btn_fetch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fetchData();
                }
            });
    }

    private void fetchData(){
        final ArrayList<Library> libraries = new ArrayList<>();
        libraries.add(new Library(1, "Badan Perpustakaan dan Arsip Daerah Provinsi DKI Jakarta", "Jalan Cikini Raya No. 73, Komplek TIM, Jakarta Pusat 10330",
                "(021) 47860095", -6.17168325, 106.88568961));
        libraries.add(new Library(2, "Perpustakaan Japan Foundation", "Gedung Summitmas 1 3rd Floor, Jl. Jend. Sudirman Kavling 61-62, Senayan, Kebayoran Baru, RT.5/RW.3, Senayan, Kby. Baru, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12190",
                "(021) 5201266", -6.2269682, 106.7913575));
        libraries.add(new Library(3, "Perpustakaan Goethe-Institut", "Jl. Dr. GSSJ Ratulangi No.9-15, RT.2/RW.3, Gondangdia, Menteng, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10350",
                "0800 1737787", -6.1898972, 106.829218));
        libraries.add(new Library(4, "Perpustakaan Nasional Republik Indonesia", "Jl. Medan Merdeka Sel. No.11, RT.11/RW.2, Gambir, Senen, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10110",
                "(021) 47860095", -6.17168325, 106.8226519));
        libraries.add(new Library(5, "Perpustakaan Freedom", "Wisma Bakrie, Jl. H. R. Rasuna Said No.Kav, B-1, RT.11/RW.2, Kuningan, Karet Kuningan, Menteng, South Jakarta City, Jakarta 12920",
                "(021) 3100349", -6.2130083, 106.8274914));
        libraries.add(new Library(6, "Perpustakaan Umum Provinsi DKI Jakarta", "Gedung Nyi Ageng Serang Lantai 7-8, I.H.R. Rasuna Said Kav. C-22, Setiabudi, RT.2/RW.5, Karet Kuningan, Setia Budi, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12940",
                "(021) 5263249", -6.2229314, 1106.8321061));
        libraries.add(new Library(7, "Perpustakaan Rujak Center for Urban Studies (RCUS)", "Gedung Ranuza lantai 2, Jalan Timor No. 10, Menteng, Jakarta Pusat",
                "(021) 3152478", -6.1898073, 106.823521));
        libraries.add(new Library(8, "Perpustakaan Sekolah Tinggi Ilmu Ekonomi PERBANAS Jakarta", "JL Ciputat Raya, No. 77A, Ciputat, RT.6/RW.8, Pd. Pinang, Kby. Lama, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 15412",
                "(021) 7430930", -6.2826025, 106.7693102));

        ListView listLibrary = findViewById(R.id.listLibrary);
        ListAdapter libraryAdapter = new libraryAdapter(this,libraries);

        listLibrary.setAdapter(libraryAdapter);
    }
}



