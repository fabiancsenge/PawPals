package hu.bme.aut.pawpals.ui.details

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import hu.bme.aut.pawpals.databinding.FragmentDetailsBinding
import hu.bme.aut.pawpals.persistence.Walk
import hu.bme.aut.pawpals.ui.details.DetailsAdapter

class DetailsAdapter(){}

/*
class DetailsAdapter(private val context: Context) :
    ListAdapter<Walk, DetailsAdapter.WalkViewHolder>(itemCallback) {

    private var walk = mutableListOf<Walk>()

    private var lastPosition = -1


    inner class WalkViewHolder(binding: FragmentDetailsBinding) : RecyclerView.ViewHolder(binding.root) {
        val image = binding.imageView
        val title: TextView = binding.titleText
        val meetingPoint: TextView = binding.meetingPointText
        val date: TextView = binding.dateText
        val length: TextView = binding.lengthText


        init {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = WalkViewHolder(
        FragmentDetailsBinding.inflate(
        LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: WalkViewHolder, position: Int) {
        val tmpWalk = walkList[position]

        holder.title.text = "Walk width " + tmpWalk.dogName
        holder.meetingPoint.text = tmpWalk.meetingPoint
        holder.date.text = tmpWalk.time
        holder.length.text = tmpWalk.walkLength + " km"
    }

    companion object {
        object itemCallback : DiffUtil.ItemCallback<Walk>() {
            override fun areItemsTheSame(oldItem: Walk, newItem: Walk): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Walk, newItem: Walk): Boolean {
                return oldItem == newItem
            }

        }
    }
}*/