package com.example.gugudan_1

import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gugudan_1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var isDouble = false
    private lateinit var result: String

    private lateinit var binding: ActivityMainBinding  //binding 변수를 지연초기화 시켜준다.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)    //data binding 해주는 코드

        setContentView(binding.root)

        var str: String = ""
        var list = mutableListOf<String>()


        binding.btn1.setOnClickListener {
            str += "1"
            binding.edit.text = str
        }

        binding.btn2.setOnClickListener {
            str += "2"
            binding.edit.text = str
        }
        binding.btn3.setOnClickListener {
            str += "3"
            binding.edit.text = str
        }
        binding.btn4.setOnClickListener {
            str += "4"
            binding.edit.text = str
        }
        binding.btn5.setOnClickListener {
            str += "5"
            binding.edit.text = str
        }
        binding.btn6.setOnClickListener {
            str += "6"
            binding.edit.text = str
        }
        binding.btn7.setOnClickListener {
            str += "7"
            binding.edit.text = str
        }
        binding.btn8.setOnClickListener {
            str += "8"
            binding.edit.text = str
        }
        binding.btn9.setOnClickListener {
            str += "9"
            binding.edit.text = str
        }
        binding.plus.setOnClickListener {
            str += "+"
            binding.edit.text = str
        }
        binding.minus.setOnClickListener {
            str += "-"
            binding.edit.text = str
        }
        binding.multiple.setOnClickListener {
            str += "x"
            binding.edit.text = str
        }
        binding.divide.setOnClickListener {
            str += "/"
            binding.edit.text = str
        }
        binding.reset.setOnClickListener {

            str = ""
            binding.edit.text = str     //edit 문자열을 빈칸으로 만들어줍니다.
        }

        binding.result.setOnClickListener {

            if (str.contains('+')) {
                val check = str.split('+')
                var n1 = check[0].toInt()
                var n2 = check[1].toInt()
                var sum = n1 + n2
                binding.edit.text = sum.toString()


            }

            if (str.contains('-')) {
                val check = str.split('-')
                var n1 = check[0].toInt()
                var n2 = check[1].toInt()
                var minus = n1 - n2
                binding.edit.text = minus.toString()
            }

            if (str.contains('x')) {
                val check = str.split('x')
                var n1 = check[0].toInt()
                var n2 = check[1].toInt()
                var multi = n1*n2
                binding.edit.text = multi.toString()
            }
            if (str.contains('/')) {
                val check = str.split('/')
                var n1 = check[0].toInt()
                var n2 = check[1].toInt()
                var divide = (n1/n2).toDouble()
                binding.edit.text = divide.toString()
            }
        }

    }

    //전역변수를 선언해서 함수 내에서 사용할 수 있게 해준다.


    override fun onBackPressed() {
        if (isDouble == true) {
            finish()
        }

        isDouble = true   //처음 눌렀을 떄 isDouble에는 true 값이 할당되고, 아래 문구가 출력됨.

        Toast.makeText(this, "종료하시려면 두번 눌러주세요", Toast.LENGTH_SHORT).show()

        Handler().postDelayed({
            isDouble = false
        }, 1000)
    }

}
