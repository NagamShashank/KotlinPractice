package com.example.kotlinr.AdapterPack

import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinr.LanguagesDetails
import com.example.kotlinr.Model.Langdata
import com.example.kotlinr.databinding.ItemLayout2Binding
import java.security.AccessController.getContext

class NewAdapter2(val list_new:ArrayList<Langdata>): RecyclerView.Adapter<NewAdapter2.My_View>() {

//    private lateinit var mListener : OnItemClickListener
//
//    interface OnItemClickListener{
//        fun OnItemClick(position: Int)
//    }
//
//    fun setOnItemClickListener(listener: OnItemClickListener){
//        mListener = listener
//    }





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): My_View {
        return My_View(ItemLayout2Binding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: My_View, position: Int) {
        holder.itemLayout2Binding.LanguageText.text = list_new[position].LangText
        holder.itemLayout2Binding.LangImage.setImageResource(list_new[position].Picture)

        holder.itemView.setOnClickListener(View.OnClickListener {
            val context = holder.itemView.context
            val nameString = list_new[position].LangText
            val Picture = list_new[position].Picture
                //Toast.makeText(context, "You clicked on ${list_new[position].LangText}", Toast.LENGTH_SHORT).show()

            //val bitmap = BitmapFactory.decodeResource(Picture)

            //val context: Context = v.getContext()
            val intent = Intent(context, LanguagesDetails::class.java)
            intent.putExtra("LanguageName", nameString)
            intent.putExtra("LanguagePicture", Picture)
            context.startActivity(intent)

        })
    }

    override fun getItemCount(): Int {
        return list_new.size
    }

    inner class My_View(val itemLayout2Binding: ItemLayout2Binding):RecyclerView.ViewHolder(itemLayout2Binding.root){}

}