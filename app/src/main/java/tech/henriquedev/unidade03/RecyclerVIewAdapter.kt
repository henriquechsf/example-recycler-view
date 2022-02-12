package tech.henriquedev.unidade03

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerVIewAdapter(
    val listUsers: List<User>
    ) : RecyclerView.Adapter<RecyclerVIewAdapter.UsuarioViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_usuario,
            parent,
            false
        )
        return UsuarioViewHolder(view)
    }

    override fun onBindViewHolder(holder: UsuarioViewHolder, position: Int) {
        holder.bind(listUsers[position])
    }

    override fun getItemCount(): Int = listUsers.count()

    inner class UsuarioViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvName: TextView = view.findViewById(R.id.txt_name)
        private val tvAge: TextView = view.findViewById(R.id.txt_age)
        private val tvId: TextView = view.findViewById(R.id.txt_id)

        fun bind(user: User) {
            tvName.text = "Nome: ${user.name}"
            tvAge.text = "Idade: ${user.age}"
            tvId.text = "ID: ${user.id}"
        }
    }
}