package tech.henriquedev.unidade03

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListAdapter(private val listUser: List<User>) : BaseAdapter() {
    override fun getCount(): Int = listUser.count()
    override fun getItem(position: Int): Any = listUser[position]
    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // necessario inflar o layout
        val layoutInflater = LayoutInflater.from(parent?.context)
        val view = layoutInflater.inflate(R.layout.item_usuario, parent, false)

        val txtId = view.findViewById<TextView>(R.id.txt_id)
        val txtName = view.findViewById<TextView>(R.id.txt_name)
        val txtAge = view.findViewById<TextView>(R.id.txt_age)

        txtId.text = listUser[position].id.toString()
        txtName.text = listUser[position].name
        txtAge.text = listUser[position].age.toString()

        return view
    }
}