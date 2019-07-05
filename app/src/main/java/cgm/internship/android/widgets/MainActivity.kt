package cgm.internship.android.widgets

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by dorunechifor.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var tvGotoLinearLayout: TextView
    private lateinit var tvGotoRelativeLayout: TextView
    private lateinit var tvGotoFrameLayout: TextView
    private lateinit var tvGotoCardView: TextView
    private lateinit var tvGotoMultipleLayouts: TextView
    private lateinit var tvGotoProgrammaticViews: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        setViewsActions()
    }

    private fun initViews() {
        tvGotoMultipleLayouts = findViewById(R.id.tv_multiple_layouts)
        tvGotoLinearLayout = findViewById(R.id.tv_linearlayout)
        tvGotoRelativeLayout = findViewById(R.id.tv_relativelayout)
        tvGotoFrameLayout = findViewById(R.id.tv_framelayout)
        tvGotoCardView = findViewById(R.id.tv_cardview)
        tvGotoProgrammaticViews = findViewById(R.id.tv_programmatic_views)
    }

    private fun setViewsActions() {
        tvGotoFrameLayout.setOnClickListener { startActivity(Intent(this@MainActivity, FrameLayoutActivity::class.java)) }
        tvGotoRelativeLayout.setOnClickListener { startActivity(Intent(this@MainActivity, RelativeLayoutActivity::class.java)) }
        tvGotoLinearLayout.setOnClickListener { startActivity(Intent(this@MainActivity, LinearLayoutActivity::class.java)) }
        tvGotoCardView.setOnClickListener { startActivity(Intent(this@MainActivity, CardViewActivity::class.java)) }
        tvGotoMultipleLayouts.setOnClickListener { startActivity(Intent(this@MainActivity, MultipleLayoutsActivity::class.java)) }
        tvGotoProgrammaticViews.setOnClickListener { startActivity(Intent(this@MainActivity, ProgrammaticViewsActivity::class.java)) }
    }
}
