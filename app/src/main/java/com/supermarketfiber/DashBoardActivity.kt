package com.supermarketfiber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.supermarketfiber.R
import kotlinx.android.synthetic.main.activity_dash_board.*

class DashBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        img_add.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java)
                .putExtra("URL","https://ilangjaringan.gorontaloprov.go.id/index.php?a=add")
            )
        }

        img_logo.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java)
                .putExtra("URL","https://ilangjaringan.gorontaloprov.go.id")
            )
        }
        tv_title.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java)
                .putExtra("URL","https://ilangjaringan.gorontaloprov.go.id")
            )
        }
        img_logo_prov.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java)
                .putExtra("URL","https://ilangjaringan.gorontaloprov.go.id")
            )
        }

        img_view.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java)
                .putExtra("URL","https://ilangjaringan.gorontaloprov.go.id/ticket.php")
            )
        }
        tv_pane_admin.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java)
                .putExtra("URL","https://ilangjaringan.gorontaloprov.go.id/admin/")
            )
        }

        tv_internet_indihome.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java)
                .putExtra("URL","https://ilangjaringan.gorontaloprov.go.id/knowledgebase.php?article=1")
            )
        }

        tv_troubleshoot.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java)
                .putExtra("URL","https://ilangjaringan.gorontaloprov.go.id/knowledgebase.php?article=2")
            )
        }

    }
}