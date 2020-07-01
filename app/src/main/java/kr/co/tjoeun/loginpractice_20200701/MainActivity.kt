package kr.co.tjoeun.loginpractice_20200701

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

//            입력된 ID / PW 을 저장
            val inputId = idEdt.text.toString()
            val inputPw = pwEdt.text.toString()

//            ID : admin@test.com "동시에" PW : qwer1234 여야 관리자.

            if (inputId == "admin@test.com" && inputPw == "qwer1234") {
                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "로그인 실패.", Toast.LENGTH_SHORT).show()
            }


        }

    }
}