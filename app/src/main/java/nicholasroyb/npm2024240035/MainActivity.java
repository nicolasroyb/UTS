package nicholasroyb.npm2024240035;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText nama_lengkap,nomor_pendaftaran;
private CheckBox pilihan1,pilihan2,pilihan3;
private TextView judul,informasi_pendaftaran;
private Button tombol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama_lengkap = findViewById(R.id.nama_lengkap);
        nomor_pendaftaran = findViewById(R.id.nomor_pendaftaran);

        pilihan1 = findViewById(R.id.pilihan1);
        pilihan2 = findViewById(R.id.pilihan2);
        pilihan3 = findViewById(R.id.pilihan3);

        judul = findViewById(R.id.judul);
        informasi_pendaftaran = findViewById(R.id.informasi_pendaftaran);

        tombol = findViewById(R.id.tombol);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama,nomor,facebook,instagram,website;
                int selectID;

                nama = nama_lengkap.getText().toString();
                nomor = nomor_pendaftaran.getText().toString();
                facebook = pilihan1.getText().toString();
                instagram = pilihan2.getText().toString();
                website = pilihan3.getText().toString();

                if (nama.trim().equals("")){
                    nama_lengkap.setError("NAMA TIDAK BOLEH KOSONG");
                }
                else if (nomor.trim().equals("")){
                    nomor_pendaftaran.setError("NOMOR TIDAK BOLEH KOSONG");
                }
                else if (pilihan1.isChecked()&&!pilihan2.isChecked()&&!pilihan3.isChecked()){
                    Toast.makeText(getApplicationContext(),"HARUS MEMILIH SALAH SATU",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("varnama", nama);
                    intent.putExtra("varnomor",nomor);
                    intent.putExtra("var1",facebook);
                    intent.putExtra("var2",instagram);
                    intent.putExtra("var3",website);
                }
            }
        });
    }
}