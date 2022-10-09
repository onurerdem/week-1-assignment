package com.onurerdem.week_1_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.onurerdem.week_1_assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val builder = AlertDialog.Builder(this@MainActivity)
            login.setOnClickListener(View.OnClickListener {
                if (userName.text.length >= 4 && userName.text.length <=25 && userName.text[0].isLetter() && userName.text[userName.text.length -1] != '_'){
                    run breaking@{
                        userName.text.forEach {
                            if (!it.isLetterOrDigit() && it != '_'){
                                builder.setTitle("Sonuç")
                                builder.setMessage("false")
                                builder.show()
                                return@breaking
                            }
                            else
                            {
                                builder.setTitle("Sonuç")
                                builder.setMessage("true")
                                builder.show()
                            }
                        }
                    }
                }
                else
                {
                    builder.setTitle("Sonuç")
                    builder.setMessage("false")
                    builder.show()
                }
            })

            sum.setOnClickListener(View.OnClickListener{
                var sum: Long = 0
                val alert1 = "Lütfen başında ve sonunda boşluk olmadan sadece toplamak istediğiniz sayıları aralarında sadece 1 boşluk bırakarak giriniz."
                var alert_1 = ""
                if (numbers.text.isNotEmpty()){
                    if (numbers.text[0] != ' ' && numbers.text[numbers.text.length - 1] != ' ' && !("  " in numbers.text.toString())){
                        run breaking@{
                            numbers.text.forEach {
                                if (!it.isDigit() && it != ' '){
                                    alert_1 = alert1
                                    builder.setTitle("Sonuç")
                                    builder.setMessage(alert_1)
                                    builder.show()
                                    return@breaking
                                }
                            }
                        }
                        if (alert_1 != alert1){
                            val splitArray = numbers.text.split(" ")
                            splitArray.forEach{
                                sum += it.toLong()
                            }
                            alert_1 = sum.toString()
                            builder.setTitle("Sonuç")
                            builder.setMessage(alert_1)
                            builder.show()
                        }
                    }
                    else
                    {
                        alert_1 = alert1
                        builder.setTitle("Sonuç")
                        builder.setMessage(alert_1)
                        builder.show()
                    }
                }
                else
                {
                    alert_1 = alert1
                    builder.setTitle("Sonuç")
                    builder.setMessage(alert_1)
                    builder.show()
                }
            })

            factorial.setOnClickListener(View.OnClickListener {
                var alert_2 = ""
                val alert2 = "Lütfen 1 ile 18 arasında faktoriyelini almak istediğiniz bir sayı giriniz."
                if (number.text.isNotEmpty()){
                    run breaking@{
                        number.text.forEach {
                            if (!it.isDigit()){
                                alert_2 = alert2
                                builder.setTitle("Sonuç")
                                builder.setMessage(alert_2)
                                builder.show()
                                return@breaking
                            }
                        }
                    }
                    if (alert_2 != alert2 && number.text.toString().toInt() >= 1 && number.text.toString().toInt() <= 18){
                        alert_2 = factorial(number.text.toString().toInt()).toString()
                        builder.setTitle("Sonuç")
                        builder.setMessage(alert_2)
                        builder.show()
                    }
                    else
                    {
                        alert_2 = alert2
                        builder.setTitle("Sonuç")
                        builder.setMessage(alert_2)
                        builder.show()
                    }
                }
                else
                {
                    alert_2 = alert2
                    builder.setTitle("Sonuç")
                    builder.setMessage(alert_2)
                    builder.show()
                }
            })

            calculate.setOnClickListener(View.OnClickListener {
                val reg = """.*\?.*\?.*\?.*"""
                var i = 0
                val n = stringParameter.text.length
                var ans = "true"
                var gotPairs = false
                var now:Int
                var other:Int
                var therest:String
                while (i<n && ans == "true"){
                    if (stringParameter.text[i].isDigit()){
                        now = stringParameter.text[i].toString().toInt()
                        other = 10-now
                        therest = stringParameter.text.substring(i+1)
                        if (therest.contains(other.toString())){
                            gotPairs = true
                            val regex = (reg+other.toString()).toRegex()
                            if (!regex.containsMatchIn(therest)){
                                ans = "false"
                            }
                        }
                    }
                    i+=1
                }
                if (gotPairs==false){
                    ans="false"
                }
                builder.setTitle("Sonuç")
                builder.setMessage(ans)
                builder.show()
            })
        }
    }
    fun factorial(n: Int): Long {
        return if (n == 1) n.toLong() else n*factorial(n-1)
    }
}