package com.kst.booklist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.kst.booklist.base.BaseFragment
import com.kst.booklist.databinding.FragmentLoginBinding


class LoginFragment : BaseFragment<FragmentLoginBinding>(FragmentLoginBinding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up the click listener for the login button
        binding.loginButton.setOnClickListener {
            // Get the entered username and password
            val username = binding.usernameET.text.toString()
            val password = binding.passwordET.text.toString()

            // Call the login function with the entered credentials
            login(username, password)
        }
    }

    private fun login(username: String, password: String) {
        // Check the credentials against the stored ones
        val storedUsername = "Admin"
        val storedPassword = "Admin@123"

        if (username == storedUsername && password == storedPassword) {
            // Successful login, you can navigate to the next screen or perform other actions
            // For now, let's just show a toast message
            // Replace this with your actual navigation logic

            Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show()

            findNavController().navigate(R.id.action_loginFragment_to_books_Library_Fragment)

        } else {
            // Incorrect credentials, show an error message
            Toast.makeText(context, "Invalid Username or Password", Toast.LENGTH_SHORT).show()
        }
    }



}