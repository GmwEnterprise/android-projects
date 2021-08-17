package com.example.activitytest

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.first_layout.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 关联一个layout
        setContentView(R.layout.first_layout)

        // findViewById可以获取layout中定义的元素，返回泛型值
        // val btn1: Button = findViewById(R.id.button1)
        // 如果app/build.gradle顶部引用了插件 kotlin-android-extensions
        // 就不需要使用findViewById了，插件会帮助我们自动生成一个与layout中元素id同名的引用

        // 定义点击事件
        button1.setOnClickListener {
            val content = "你点击了一个按钮"

            // 创建一个toast
            val textToast = Toast.makeText(this, content, Toast.LENGTH_SHORT)

            // 显示一个toast
            textToast.show()

            // 销毁该activity，与Back键的功能一致
            // finish()

            // 显式使用Intent 启动SecondActivity
            // val intent = Intent(this, SecondActivity::class.java)
            // startActivity(intent)

            // 隐式使用Intent 启动SecondActivity
            val intent = Intent("com.example.activitytest.ACTION_START")
            startActivity(intent)
        }
    }

    // 创建菜单，默认位于Activity右上角
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(
            R.menu.main, // 用来创建菜单的资源文件
            menu // 将菜单添加到哪个menu对象
        )

        // 允许创建的菜单显示
        return true
    }

    // 定义菜单响应事件
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // 通过item.itemId判断哪个菜单项被点击了
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "Remove", Toast.LENGTH_SHORT).show()
        }

        // 返回true表示允许触发事件
        return true
    }
}