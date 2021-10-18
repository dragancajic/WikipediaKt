package org.eu5.learn_pisio.wikipediakt.activities

import android.app.SearchManager
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import kotlinx.android.synthetic.main.activity_search.*
import org.eu5.learn_pisio.wikipediakt.R

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

		// This sets the SupportActionBar using a v7 toolbar that we added in our layout.
	    setSupportActionBar(toolbar)
	    // This sets the Back button on the left side of the toolbar next to the title.
	    supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
	
	// When the home item is selected, we finish the activity and go back to the previous one
	override fun onOptionsItemSelected(item: MenuItem?): Boolean {
		if (item!!.itemId == android.R.id.home) {
			finish()
		}
		return true;
	}
	
	// This is what's called whenever we're creating a menu based on a menu resource
	override fun onCreateOptionsMenu(menu: Menu?): Boolean {
		
		// Inflate the menu from the search_menu resource:
		// pass in the menu we created and then the menu object
		menuInflater.inflate(R.menu.search_menu, menu)
		
		val searchItem = menu!!.findItem(R.id.action_search)
		
		val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
		val searchView = searchItem!!.actionView as SearchView
		searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName))
		
		// This way, it's expanded and is focused the second when we start the activity
		searchView.setIconifiedByDefault(false)
		searchView.requestFocus()
		
		searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener {
			
			// OnQueryTextListener has two functions that we can override internally:
			// onQueryTextSubmit() and onQueryTextChange():
			override fun onQueryTextSubmit(query: String?): Boolean {
				
				// do the search and update the elements
				
				println("updated search")
				
				return false
			}
			
			override fun onQueryTextChange(newText: String?): Boolean {
				return false
			}
			// This is what allows us to handle submissions or when text is changed in
			// the search bar.
		})
		
		return super.onCreateOptionsMenu(menu)
	}
}
