package com.vk.whatsapplist.Adaper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vk.whatsapplist.Model.Usuario;
import com.vk.whatsapplist.R;

import java.util.ArrayList;
import java.util.List;
//essa classe adapter tem que herdar as caracteristicar de recyclerview e pra isso ele precisa
//de um viewHolder para poder exibir os itens atravez de um usuario

//criando a classe para usar o viewHolder
public class AdapterUsuarios extends RecyclerView.Adapter<AdapterUsuarios.UsuarioViewHolder> {

    private List<Usuario> usuarioList = new ArrayList<>();

    //construtor da nossa lista
    public AdapterUsuarios(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @NonNull
    @Override
    //metodo responsavel por criar nossas visualizações
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View intemLista;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        intemLista = layoutInflater.inflate(R.layout.usuario_item,parent,false);
        return new UsuarioViewHolder(intemLista);
    }

    @Override
    //retorna a quantidade total da nossa lista e usamos o usuarios.list para a lista sempre crescer quando adicionarmos 1 item
    public int getItemCount() {
        return usuarioList.size();
    }

    @Override
    //metodo que exibe nossa view holder
    public void onBindViewHolder(@NonNull UsuarioViewHolder holder, int position) {
        holder.foto.setImageResource(usuarioList.get(position).getFoto());
        holder.nome.setText(usuarioList.get(position).getNome());
        holder.mensagem.setText(usuarioList.get(position).getMensagem());
    }

    //construtor para o nosso view holder
    public class UsuarioViewHolder extends RecyclerView.ViewHolder{
        private ImageView foto;
        private TextView nome;
        private TextView mensagem;
        public UsuarioViewHolder(@NonNull View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.ftusuario);
            nome = itemView.findViewById(R.id.nomeUsuario);
            mensagem = itemView.findViewById(R.id.mensagemUsuario);


        }
    }
}
