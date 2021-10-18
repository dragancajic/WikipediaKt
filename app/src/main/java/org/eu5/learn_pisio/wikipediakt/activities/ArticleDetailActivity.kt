package org.eu5.learn_pisio.wikipediakt.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_article_detail.*
import org.eu5.learn_pisio.wikipediakt.R

/**
 * Created by Драган Ћајић on 2021-10-16.
 */
class ArticleDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_detail)

        // This sets the SupportActionBar using a v7 toolbar that we added in our layout.
        setSupportActionBar(toolbar)
        // This sets the Back button on the left side of the toolbar next to the title.
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
	
	// Now we need to handle when that Back button is hit ...
	override fun onOptionsItemSelected(item: MenuItem?): Boolean {
		// and then checking if the item that was selected is android.R.id.home
		if (item!!.itemId == android.R.id.home) {
			finish()
		}
		return true;
	}
}
