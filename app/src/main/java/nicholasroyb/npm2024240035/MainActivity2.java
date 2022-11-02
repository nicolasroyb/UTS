package nicholasroyb.npm2024240035;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckedTextView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView nama_lengkap2,nomor_pendaftaran2;
    private CheckedTextView hasilpilihan1,hasilpilihan2,hasilpilihan3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nama_lengkap2 = findViewById(R.id.nama_lengkap2);
        nomor_pendaftaran2 = findViewById(R.id.nomor_pendaftaran2);
        hasilpilihan1 = findViewById(R.id.hasilpilihan1);
        hasilpilihan2 = findViewById(R.id.hasilpilihan2);
        hasilpilihan3 = findViewById(R.id.hasilpilihan3);

        Intent intent = getIntent();
        nama_lengkap2.setText(intent.getStringExtra("varnama"));
        nomor_pendaftaran2.setText(intent.getStringExtra("varnomor"));
        hasilpilihan1.setText(intent.getStringExtra("var1"));
        hasilpilihan2.setText(intent.getStringExtra("var2"));
        hasilpilihan3.setText(intent.getStringExtra("var3"));
    }
}