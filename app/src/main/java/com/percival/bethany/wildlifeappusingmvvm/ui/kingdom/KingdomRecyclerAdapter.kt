package com.percival.bethany.wildlifeappusingmvvm.ui.kingdom

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.percival.bethany.wildlifeappusingmvvm.R
import com.percival.bethany.wildlifeappusingmvvm.data.Kingdom
import kotlinx.android.synthetic.main.list_item_text.view.*

class KingdomRecyclerAdapter(private val _kingdoms: List<Kingdom>, val listener: (Kingdom) -> Unit) :
    RecyclerView.Adapter<KingdomRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_text, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(_kingdoms[position], listener)

    override fun getItemCount() =
        _kingdoms.size


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(kingdom: Kingdom, listener: (Kingdom) -> Unit) = with(itemView) {
            textViewName.text = kingdom.toString()
            setOnClickListener { listener(kingdom) }
        }
    }
}
