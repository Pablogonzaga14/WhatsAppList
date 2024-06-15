package com.vk.whatsapplist;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.vk.whatsapplist.Adaper.AdapterUsuarios;
import com.vk.whatsapplist.Model.Usuario;
import com.vk.whatsapplist.RecyclerItemClickListener.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        private RecyclerView recycler_usuario;
        private List<Usuario> usuarioList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recycler_usuario =findViewById(R.id.recycle_usuarios);
        recycler_usuario.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false));
        recycler_usuario.setHasFixedSize(true);
        AdapterUsuarios adapterUsuarios = new AdapterUsuarios(usuarioList);
        recycler_usuario.setAdapter(adapterUsuarios);

        Usuarios();

        //Evento de click na recyclerView
        recycler_usuario.addOnItemTouchListener(new RecyclerItemClickListener(
                getApplicationContext(),
                recycler_usuario,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        Usuario usuario = usuarioList.get(position);

                        Toast.makeText(getApplicationContext(),"Usuario " + usuario.getNome(),Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                }
        ));

    }
    public void Usuarios(){
        Usuario usuario1 = new Usuario(R.drawable.zoro,"Zoro","Vk sabe onde está o barco?");
        usuarioList.add(usuario1);
        Usuario usuario2 = new Usuario(R.drawable.sanji,"Sanji","O almoço está pronto maldito");
        usuarioList.add(usuario2);
        Usuario usuario3 = new Usuario(R.drawable.nami,"Nami","Precisamos de mais ouro ");
        usuarioList.add(usuario3);
        Usuario usuario4 = new Usuario(R.drawable.ussop,"Mentirosinho","Eu matei o Gold Roger");
        usuarioList.add(usuario4);
        Usuario usuario5 = new Usuario(R.drawable.chopper,"Chopper","Será que o sanji tem Algodão doce ?");
        usuarioList.add(usuario5);
        Usuario usuario6 = new Usuario(R.drawable.robin,"Robin","Me ensina a ler os poneglifes pfv");
        usuarioList.add(usuario6);
        Usuario usuario7 = new Usuario(R.drawable.luffy,"Luffy","Eu roubei toda carne do navio XD");
        usuarioList.add(usuario7);
        Usuario usuario8 = new Usuario(R.drawable.franky,"Franky","Você pegou minha moto de novo ?");
        usuarioList.add(usuario8);
        Usuario usuario9 = new Usuario(R.drawable.brook,"Brook","Hoje vai rolar o saque do binks");
        usuarioList.add(usuario9);
        Usuario usuario10 = new Usuario(R.drawable.amigo,"Jimbei","Vamos pegar a moto do Franky kkkk");
        usuarioList.add(usuario10);
        Usuario usuario11 = new Usuario(R.drawable.hanckok,"boa hancock","Você viu o luffy ?");
        usuarioList.add(usuario11);
        Usuario usuario12 = new Usuario(R.drawable.garp,"Garp","Cade o meu neto  ?");
        usuarioList.add(usuario12);
        Usuario usuario13 = new Usuario(R.drawable.ace,"Ace","Caraca maior dor no peito!");
        usuarioList.add(usuario13);





    }
}