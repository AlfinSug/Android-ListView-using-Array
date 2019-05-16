package com.developer.alfin.catalogapps;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    ListView daftar;
    DaftarAdapter test;

    private String[] name_cafe = {"Antler Cabin Surabaya",
                                "Cafe Petangkringan",
                                "Warkop Opa",
                                "Calibre Coffee Roasters",
                                "Ijen Cafe Surabaya",
                                "Shae Cafe and Eatery",
                                "Rolag Coffee Surabaya",
                                "The Brothers Cafe",
                                "Le Belle Cafe Surabaya",
                                "Montase Cafe Surabaya"};

    private Integer[] img_cafe = {R.drawable.antlecabin_1,
                                R.drawable.petangkringan_2,
                                R.drawable.warkopa_3,
                                R.drawable.callibree_4,
                                R.drawable.ijen_5,
                                R.drawable.shae_6,
                                R.drawable.rolag_7,
                                R.drawable.thebhrothers_8,
                                R.drawable.lebelle_9,
                                R.drawable.mon_10};

    private String[] address_cafe = {
            "Jl. Raya Darmo Permai 2 Blok D No.16",
            "Jl. Tenggilis Mejoyo AI No.1",
            "Jl. Tidar No.103",
            "Jl. Walikota Mustajab No. 67 – 69",
            "Jl. Arif Rahman Hakim No.126",
            "Jl. Bawean No. 3",
            "Jl. Karah Blok E-2 No.6, Karah",
            "Jl. Kedung Cowek No.108",
            "Jl. Ciliwung No.49",
            "Jl. Anggrek No.1-A"};

    private String[] address_cafe2 = {
            "Jl. Raya Darmo Permai 2 Blok D No.16, Dukuh Pakis, Tanjungsari, Kota Surabaya, Jawa Timur.",
            "Jl. Tenggilis Mejoyo AI No.1, Kali Rungkut, Rungkut, Kota Surabaya, Jawa Timur.",
            "Jl. Tidar No.103, Petemon, Kec. Sawahan, Kota Surabaya, Jawa Timur.",
            "Jl. Walikota Mustajab No. 67 – 69, Ketabang, Genteng, Kota Surabaya, Jawa Timur.",
            "Jl. Arif Rahman Hakim No.126, Keputih, Sukolilo, Kota Surabaya, Jawa Timur.",
            "Jl. Bawean No. 3, Ngagel, Wonokromo, Kota Surabaya, Jawa Timur.",
            "Jl. Karah Blok E-2 No.6, Karah, Jambangan, Kota Surabaya, Jawa Timur.",
            "Jl. Kedung Cowek No.108, Tanah Kali Kedinding, Kenjeran, Kota Surabaya, Jawa Timur.",
            "Jl. Ciliwung No.49, Darmo, Wonokromo, Kota Surabaya, Jawa Timur.",
            "Jl. Anggrek No.1-A, Ketabang, Genteng, Kota Surabaya, Jawa Timur."};

    private String[] phone_cafe = {
            "0813-1517-1255",
            "0858-5096-5711",
            "0822-3405-5166",
            "(031) 5454801",
            "(031) 5955853",
            "0813-3300-6693",
            "0812-1661-855",
            "0822-3004-4499",
            "(031) 99533663",
            "0822-4484-5284"};

    private String[] open_cafe = {
            "08.30 – 22.00",
            "Buka 24 Jam",
            "Buka 24 Jam",
            "10.00 – 23.30",
            "12.00 – 00.00",
            "11.00 – 00.00",
            "08.00 – 02.00",
            "17.00 – 00.00",
            "12.00 – 01.00",
            "08.00 – 00.00"};

    private String[] ig_cafe = {
            "@antlercabin",
            "@petangkringan",
            "@warkopopa",
            "@calibrecoffeeroasters",
            "@ijencafesurabaya",
            "@shaecafeeatery",
            "@rolag_kopi",
            "@thebrothers.cafe",
            "@lebellecafe",
            "@montase_cafe"};

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("  Find Cafe");
        toolbar.setLogo(R.drawable.logo2);

        daftar = findViewById(R.id.listView);

        test = new DaftarAdapter(this, img_cafe, name_cafe, address_cafe);
        daftar.setAdapter(test);

        daftar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int j, long id) {
                Intent show = new Intent(MainActivity.this,DetailView.class );

                show.putExtra("namecafe", name_cafe[j]);
                show.putExtra("imgcafe", img_cafe[j]);
                show.putExtra("addresscafe2", address_cafe2[j]);
                show.putExtra("phonecafe", phone_cafe[j]);
                show.putExtra("opencafe", open_cafe[j]);
                show.putExtra("igcafe", ig_cafe[j]);
                startActivity(show);
            }
        });

    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        MenuItem actionSearch = menu.findItem(R.id.act_search);

        SearchView searchView = (SearchView)actionSearch.getActionView();

        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setSubmitButtonEnabled(true);
        searchView.setOnQueryTextListener((SearchView.OnQueryTextListener) this);
        return true;
    }
    */
}
