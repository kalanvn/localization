package gamiya.net.localization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_test)

        val textView = findViewById<TextView>(R.id.dynamic_text)
        val dynamicOrientationApp = resources.getBoolean(R.bool.isPortrait)
        if(dynamicOrientationApp)
            textView.text = "Andriod App Development"
    }
}