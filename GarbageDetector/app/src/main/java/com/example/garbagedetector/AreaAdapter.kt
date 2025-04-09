import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.garbagedetector.R

class AreaAdapter(private val areas: List<String>) : RecyclerView.Adapter<AreaAdapter.AreaViewHolder>() {

    inner class AreaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val areaName: TextView = itemView.findViewById(R.id.textViewAreaName)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AreaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.area_item, parent, false)
        return AreaViewHolder(view)
    }

    override fun onBindViewHolder(holder: AreaViewHolder, position: Int) {
        holder.areaName.text = areas[position]
    }

    override fun getItemCount(): Int = areas.size
}
