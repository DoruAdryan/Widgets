package cgm.internship.android.widgets

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isNotEmpty
import cgm.internship.android.widgets.Utils.generateRandomIntegerBetween
import kotlinx.android.synthetic.main.activity_programmatic_views.*

/**
 * Created by dorunechifor.
 */
class ProgrammaticViewsActivity : AppCompatActivity() {

    // if user inserted and empty text (or rather did not insert any text), display a default one.
    private val viewLabel: String
        get() {
            val viewLabel = etProgrammaticViewsLabel.text.toString()
            return if (viewLabel.isEmpty()) {
                getString(R.string.default_view_label)
            } else {
                viewLabel
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programmatic_views)

        setViewsActions()
        setInitialData()
    }

    private fun setViewsActions() {
        btnProgrammaticViewsGenerate.setOnClickListener {
            val viewLabel = viewLabel
            addNewView(viewLabel)
        }
        btnProgrammaticViewsRemove.setOnClickListener {
            removeRandomView()
        }
    }

    private fun setInitialData() {
        etProgrammaticViewsLabel.setText(getString(R.string.sample_text_very_short))
        etProgrammaticViewsLabel.setSelection(etProgrammaticViewsLabel.text.length)
    }

    private fun removeRandomView() {
        if (llProgrammaticViews.isNotEmpty()) {
            val randomValidChildIndex = generateRandomIntegerBetween(0, llProgrammaticViews.childCount - 1)
            llProgrammaticViews.removeViewAt(randomValidChildIndex)
        } else {
            Toast.makeText(this@ProgrammaticViewsActivity, "Nothing to remove", Toast.LENGTH_SHORT).show()
        }
    }

    private fun addNewView(label: String) {
        val viewType = generateRandomViewType()
        val newChildView = createView(viewType, label)

        llProgrammaticViews.addView(newChildView)
    }

    // Generates a new View depending on viewType param (accepts these values: 0, 1, 2, 3) and sets viewLabel text on it.
    private fun createView(viewType: Int, viewLabel: String): View {
        val view: TextView

        when (viewType) {
            0 -> view = createTextView()
            1 -> view = createButton()
            2 -> view = createCheckBox()
            3 -> view = createRadioButton()
            else -> throw IllegalArgumentException("Unknown widget type.")
        }

        setLabel(view, viewLabel)
        setTextColorTo(view)
        applyLayoutParamsTo(view)

        return view
    }

    private fun createTextView(): TextView {
        return TextView(this)
    }

    private fun createButton(): Button {
        return Button(this)
    }

    private fun createCheckBox(): CheckBox {
        return CheckBox(this)
    }

    private fun createRadioButton(): RadioButton {
        return RadioButton(this)
    }

    private fun setLabel(view: TextView, label: String) {
        view.text = label
    }

    // Sets a random generated color to view's text
    private fun setTextColorTo(view: TextView) {
        val textColor = Utils.generateRandomColor()
        view.setTextColor(textColor)
    }

    private fun applyLayoutParamsTo(view: View) {
        // We need LinearLayout LayoutParams because our parent view is a LinearLayout.
        val params = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        view.layoutParams = params
    }

    // Simple method that generates a Random integer in the range: [0, 3] -- inclusive.
    private fun generateRandomViewType(): Int {
        return Utils.generateRandomIntegerBetween(0, 3)
    }

}
