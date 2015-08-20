package ro.adipascu.kotlinissue

import android.os.Bundle
import ro.adipascu.kotlinissue.io.AbstractActivity

/**
 * Created by Adrian Pascu on 8/20/2015.
 * mail@adipascu.ro
 */
public class MainActivity : AbstractActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val lambda: () -> Unit = {
            parentMethod()
        }
        lambda();
    }
}
