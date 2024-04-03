package com.example.Adv160421080Week6.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.Adv160421080Week6.databinding.BrandListItemBinding
import com.example.Adv160421080Week6.model.Brand

class CarListAdapter (val brandList: ArrayList<Brand>):RecyclerView.Adapter<CarListAdapter.BrandViewHolder>(){
    class BrandViewHolder(var binding: BrandListItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrandViewHolder {
        val binding = BrandListItemBinding.inflate(
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
                brandFounder.name + " (${brandFounder.birth_year})"
            }
        }

        brandList[position].products.let { product->
            holder.binding.txtProduct.text = product?.joinToString(" | ")
        }

        //belom bisa import gambar
    }

    fun updateBrandList(newBrandList: ArrayList<Brand>){
        brandList.clear()
        brandList.addAll(newBrandList)
        notifyDataSetChanged()
    }

}