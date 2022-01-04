package koala.tea.examples

import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Carousel

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onResume() {
        super.onResume()

        val carousel = findViewById<Carousel>(R.id.carousel)

        carousel.setAdapter(object : Carousel.Adapter {

            override fun count(): Int {
                return 10
            }

            override fun populate(view: View?, index: Int) {
            }

            override fun onNewItem(index: Int) {
                findViewById<TextView>(R.id.selectedText).text = ((index + 2) % count()).toString()
            }
        })
    }
}