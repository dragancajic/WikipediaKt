package org.eu5.learn_pisio.wikipediakt.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_article_detail.view.*
import org.eu5.learn_pisio.wikipediakt.R

/**
 * Created by Драган Ћајић on 2021-10-16.
 */
class ArticleDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_detail)
    }
}