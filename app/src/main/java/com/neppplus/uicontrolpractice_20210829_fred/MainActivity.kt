package com.neppplus.uicontrolpractice_20210829_fred

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //토스트 버튼이 눌리면 > 메세지가 적힌 내용을 받아와서 > 토스트를 띄우는데 사용.

        toastBtn.setOnClickListener {

            //메세지가 입력된 내용을 받아오자. = 기억해둬야함 = 변수를 만들어 저장해야함.
            val inputMessage = messageEdt.text.toString()

            //토스트를 띄울때 > 변수에 담긴 내용을 띄우자

            Toast.makeText(this, inputMessage, Toast.LENGTH_SHORT).show()

        }

        // 카피메세지 버튼이 눌리면 > 메세지가 적힌 내용을 받아와서 >  텍스트뷰 문구로 반영
        copyMessageBtn.setOnClickListener {

            //입력한 내용 받아오기.(변수에 저장)
            val inputMessage = messageEdt.text.toString()

            //메세지 텍스트 뷰의 text 속성에 내용을 대입 set을한다.

            messageTxt.text = inputMessage

        }

    }
}