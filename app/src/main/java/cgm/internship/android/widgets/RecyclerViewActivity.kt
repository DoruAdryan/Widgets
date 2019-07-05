package cgm.internship.android.widgets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import cgm.internship.android.widgets.recyclerview.Contact
import cgm.internship.android.widgets.recyclerview.ContactsAdapter
import cgm.internship.android.widgets.recyclerview.SampleData
import kotlinx.android.synthetic.main.activity_recyclerview.*

/**
 * Created by dorunechifor.
 */
class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var adapter: ContactsAdapter
    private var clear = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        setUpRecyclerView()

        btnChange.setOnClickListener {
            val newList = if (clear) {
                emptyList<Contact>()
            } else {
                SampleData.generateSampleContactsList().toMutableList()
            }
            adapter.setNewItems(newList)
            clear = !clear
        }
    }

    private fun setUpRecyclerView() {
        adapter = ContactsAdapter(SampleData.generateSampleContactsList().toMutableList())
        rvContactList.layoutManager = LinearLayoutManager(this)
        rvContactList.adapter = adapter
    }
}
