package ar.edu.utn.frsf.dam.isi.laboratorio02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity extends AppCompatActivity {

    private TextView tvSelecionarCategoria;
    private Spinner spnnCmbProductosCategoria;
    private TextView tvListaProductos;
    private ListView lstProductos;
    private TextView tvCantidadAPedir;
    private EditText edtProdCantidad;
    private Button btnProdAddPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        tvSelecionarCategoria = (TextView) findViewById(R.id.tvSelecionarCategoria);
        spnnCmbProductosCategoria = (Spinner) findViewById(R.id.spnnCmbProductosCategoria);
        tvListaProductos = (TextView) findViewById(R.id.tvListaProductos);
        lstProductos = (ListView) findViewById(R.id.lstProductos);
        tvCantidadAPedir = (TextView) findViewById(R.id.tvCantidadAPedir);
        edtProdCantidad = (EditText) findViewById(R.id.edtProdCantidad);
        btnProdAddPedido = (Button) findViewById(R.id.btnProdAddPedido);
    }
}
