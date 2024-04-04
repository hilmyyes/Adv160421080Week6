package com.example.Adv160421080Week6.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.Adv160421080Week6.databinding.ArtistListItemBinding
import com.example.Adv160421080Week6.model.Artist
import com.squareup.picasso.Picasso

class ArtistListAdapter (val brandList: ArrayList<Artist>):RecyclerView.Adapter<ArtistListAdapter.BrandViewHolder>(){
    class BrandViewHolder(var binding: ArtistListItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrandViewHolder {
        val binding = ArtistListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return BrandViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return brandList.size
    }

    override fun onBindViewHolder(holder: BrandViewHolder, position: Int) {
        with(holder.binding ){
            txtID.text = brandList[position].id
            txtName.text = brandList[position].name
            txtFounded.text = "From " + brandList[position].founded
            txtFounder.text = brandList[position].founder?.let { brandFounder->
                brandFounder.place + " (${brandFounder.birth_year})"
            }
        }

        brandList[position].products.let { product->
            holder.binding.txtProduct.text = product?.joinToString(" | ")
        }

        //Untuk Import Gambar
        val url = brandList[position].images
        val builder = Picasso.Builder(holder.itemView.context)
        builder.listener { picasso, url, exception ->  exception.printStackTrace() }
        Picasso.get().load(url).into(holder.binding.imageView)
    }

    fun updateBrandList(newBrandList: ArrayList<Artist>){
        brandList.clear()
        brandList.addAll(newBrandList)
        notifyDataSetChanged()
    }

}