package tech.watanave.mediadrm

import android.media.MediaDrm
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uuid = UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")
        val id = MediaDrm(uuid).getPropertyByteArray(MediaDrm.PROPERTY_DEVICE_UNIQUE_ID)

        Log.i("unique id", id.joinToString(":") { String.format("%02X", it) })
    }
}
