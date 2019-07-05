package cgm.internship.android.widgets.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import cgm.internship.android.widgets.R

/**
 * Created by dorunechifor.
 */
class ContactsAdapter(private val mDataSet: MutableList<Contact>) : RecyclerView.Adapter<ContactsAdapter.ContactVH>() {

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactVH {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_contact, parent, false)
        return ContactVH(itemView)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ContactVH, position: Int) {
        holder.bind(mDataSet[position])
    }

    fun setNewItems(items: List<Contact>) {
        mDataSet.clear()
        mDataSet.addAll(items)

        notifyDataSetChanged()
    }

    // Return the size of the dataSet (invoked by the layout manager)
    override fun getItemCount(): Int {
        return mDataSet.size
    }

    // Provide a reference to the views for each data item
    class ContactVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val tvPrefix: TextView = itemView.findViewById(R.id.tv_item_contact_prefix)
        private val tvName: TextView = itemView.findViewById(R.id.tv_item_contact_name)
        private val tvPhone: TextView = itemView.findViewById(R.id.tv_item_contact_phone)
        private val tvEmail: TextView = itemView.findViewById(R.id.tv_item_contact_email)
        private val ivIcon: ImageView = itemView.findViewById(R.id.ivIcon)

        fun bind(contact: Contact) {
            tvPrefix.text = contact.name[0].toString() // This needs to be String, because a char value will throw an Exception
            tvName.text = contact.name
            tvPhone.text = contact.phone
            tvEmail.text = contact.email

            animateAlphaIconAppearance()
        }

        private fun animateAlphaIconAppearance() {
            ivIcon.apply {
                alpha = 0.0f
                animate().setDuration(300).alpha(1.0f).start()
            }
        }
    }
}
