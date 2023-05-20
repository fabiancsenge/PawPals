package hu.bme.aut.pawpals.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.ListAdapter
import hu.bme.aut.pawpals.persistence.Walk
import hu.bme.aut.pawpals.databinding.ListItemBinding

class MainAdapter(private val context: Context) :
    ListAdapter<Walk, MainAdapter.WalkViewHolder>(itemCallback) {

    private var walkList = mutableListOf<Walk>()

    private var lastPosition = -1


    inner class WalkViewHolder(binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val image = binding.imageView
        val title: TextView = binding.titleText
        val meetingPoint: TextView = binding.meetingPointText
        val date: TextView = binding.dateText
        val length: TextView = binding.lengthText
        val icon = binding.ivMapIcon

        init {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = WalkViewHolder(ListItemBinding.inflate(
        LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: WalkViewHolder, position: Int) {
        val tmpWalk = walkList[position]

        holder.title.text = "Walk width " + tmpWalk.dogName
        holder.meetingPoint.text = tmpWalk.meetingPoint
        holder.date.text = tmpWalk.time
        holder.length.text = tmpWalk.walkLength + " km"
    }

    fun addWalk(walk: Walk?) {
        walk ?: return

        walkList += walk
        submitList(walkList)
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
}