package com.example.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val loginET = view.findViewById<EditText>(R.id.loginET)
        val passwordET = view.findViewById<EditText>(R.id.passwordET)
        val buttonRegistrationBTN = view.findViewById<Button>(R.id.buttonRegistrationBTN)

        buttonRegistrationBTN.setOnClickListener {
            val userNameSignUP = loginET.text.toString()
            val userPasswordSignUp = passwordET.text.toString()
            if (userPasswordSignUp.isEmpty() || userNameSignUP.isEmpty()) {
                Toast.makeText(context, "Данные не введены", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val bundle = Bundle()
            val signInFragment = SignInFragment()
            bundle.putString("name", userNameSignUP)
            bundle.putString("password", userPasswordSignUp)
            signInFragment.arguments=bundle
            fragmentManager?.beginTransaction()?.replace(R.id.containerID, signInFragment)?.commit()
            Toast.makeText(context, "Вы успешно зарегистрированы", Toast.LENGTH_LONG).show()
        }
    }
}