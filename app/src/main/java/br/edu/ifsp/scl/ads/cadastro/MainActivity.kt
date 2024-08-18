package br.edu.ifsp.scl.ads.cadastro

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.edu.ifsp.scl.ads.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var amb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)

        amb.btnSalvar.setOnClickListener {
            val nomeCompleto = amb.etNome.text.toString()
            val telefone = amb.etTelefone.text.toString()
            val email = amb.etEmail.text.toString()
            val ingressarNaLista = amb.cbMailingList.isChecked
            val sexo = if (amb.rbMasculino.isChecked) "Masculino" else "Feminino"
            val cidade = amb.etCidade.text.toString()
            val uf = amb.spUf.selectedItem.toString()

            val formulario = Formulario(nomeCompleto, telefone, email, ingressarNaLista, sexo, cidade, uf)
            Toast.makeText(this, formulario.toString(), Toast.LENGTH_LONG).show()
        }

        amb.btnLimpar.setOnClickListener {
            amb.etNome.text.clear()
            amb.etTelefone.text.clear()
            amb.etEmail.text.clear()
            amb.cbMailingList.isChecked = false
            amb.rgSexo.clearCheck()
            amb.etCidade.text.clear()
            amb.spUf.setSelection(0)
        }
    }
}
