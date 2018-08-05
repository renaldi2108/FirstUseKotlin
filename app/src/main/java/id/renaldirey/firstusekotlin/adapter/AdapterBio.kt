package id.renaldirey.firstusekotlin.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.renaldirey.firstusekotlin.Main2Activity
import id.renaldirey.firstusekotlin.R.layout.list_item
import id.renaldirey.firstusekotlin.model.Models
import kotlinx.android.synthetic.main.list_item.view.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity


class AdapterBio (private  val ctx : Context, private val modelItems : List<Models>) : RecyclerView.Adapter<AdapterBio.ViewHolder>() {

    init {
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder (LayoutInflater.from(ctx).inflate(list_item,parent,false))

    override fun getItemCount(): Int  = modelItems.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(modelItems[position])
    }

    class ViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        fun bindItem(items: Models){
            itemView.name.text = items.name

            itemView.cvList.onClick {
                it?.context?.startActivity<Main2Activity>(
                        "NAME" to items.name,
                        "BIO" to items.bio
                )
            }
        }
    }
}