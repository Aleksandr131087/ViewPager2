package com.example.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class SignInFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_in, container, false)

            }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = arguments?.getString("name")
        val password = arguments?.getString("password")

        val loginINET = view.findViewById<EditText>(R.id.loginINET)
        val passwordINET = view.findViewById<EditText>(R.id.passwordINET)
        val buttonINBTN = view.findViewById<Button>(R.id.buttonINBTN)

        buttonINBTN.setOnClickListener {
if (name!=loginINET.text.toString() || password!=passwordINET.text.toString()){
Toast.makeText(context, "Логин или пароль введены не верно", Toast.LENGTH_LONG).show()
            return@setOnClickListener}
            else {
                fragmentManager?.beginTransaction()?.replace(R.id.containerID, MainFragment())?.commit()
            }

        }

    }

}