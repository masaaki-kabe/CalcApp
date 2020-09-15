package jp.techacademy.masaaki.kabe.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v:View){
        val aa=editText1.text.toString()
        val bb=editText2.text.toString()

        if (aa==""||bb==""){
            textView2.text="数字が入っていません。入力してください"
        }else{

            var a = editText1.text.toString().toDouble()
            var b = editText2.text.toString().toDouble()

            val intent = Intent(this, SecondActivity::class.java)

            if (v.id == R.id.button1) {
                intent.putExtra("VALUE", a + b)
                startActivity(intent)
            } else if (v.id == R.id.button2) {
                intent.putExtra("VALUE", a - b)
                startActivity(intent)
            } else if (v.id == R.id.button3) {
                intent.putExtra("VALUE", a * b)
                startActivity(intent)
            } else if ((v.id == R.id.button4) && b==0.0) {
                textView2.text="0で割っています"
            } else if ((v.id == R.id.button4) && b!=0.0) {
                intent.putExtra("VALUE", a/b)
                startActivity(intent)
            }

        }
    }







}
