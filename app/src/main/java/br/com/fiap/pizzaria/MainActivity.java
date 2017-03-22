package br.com.fiap.pizzaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import br.com.fiap.pizzaria.javabean.FormasPagamento;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, Spinner.OnItemSelectedListener{

    RadioButton rdMussarela;
    RadioButton rdCalabresa;
    RadioButton rdPortuguesa;
    RadioGroup rgrPizza;
    CheckBox chBorda;
    Spinner spnPagamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdCalabresa = (RadioButton) findViewById(R.id.rdCalabresa);
        rdMussarela = (RadioButton) findViewById(R.id.rdMussarela);
        rdPortuguesa = (RadioButton) findViewById(R.id.rdPortuguesa);
        chBorda = (CheckBox) findViewById(R.id.chBorda);
        rgrPizza = (RadioGroup) findViewById(R.id.rgrPizza);
        spnPagamento = (Spinner) findViewById(R.id.spnPagamento);


        List<FormasPagamento> lista = FormasPagamentoBO.getLista();

        ArrayAdapter<FormasPagamento> adapter = new ArrayAdapter<FormasPagamento>(this, android.R.layout.simple_list_item_1);

        spnPagamento.setAdapter(adapter);

        rgrPizza.setOnCheckedChangeListener(this);
        spnPagamento.setOnItemSelectedListener(this);
    }

    public void onCheckedChanged (RadioGroup group, int checkedId){
        if (checkedId == R.id.rdMussarela){
            chBorda.setChecked(false);
            chBorda.setEnabled(false);
        }else{
            chBorda.setEnabled(true);
        }
    }


    public void calcular(View view){
        double total = 0;
        int checkedId = rgrPizza.getCheckedRadioButtonId();

        if(checkedId == R.id.rdMussarela){
            total = 10;
        }else{
            if (checkedId == R.id.rdCalabresa){
                total = 15;
            }else{
                total = 20;
            }
            if(chBorda.isChecked()){
                total += 5;
            }
        }

        Toast.makeText(this, "Total: " + total, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, spnPagamento.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
