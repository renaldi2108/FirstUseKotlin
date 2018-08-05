package id.renaldirey.firstusekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    // Declare variable global
    companion object {
        var bioString: String? = ""
        var nameString: String? = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        bioString = intent.getStringExtra("BIO")
        nameString = intent.getStringExtra("NAME")

        bio.text = bioString
        name.text = nameString
    }
}
