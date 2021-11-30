package com.example.movieapp.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.movieapp.R
import com.example.movieapp.data.SessionData
import com.example.movieapp.database.Database
import com.example.movieapp.databinding.FragmentJoinBinding

class JoinFragment : Fragment() {
    private var _binding: FragmentJoinBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentJoinBinding.inflate(inflater, container, false)

        SessionData.isHost = false

        // Join after a deep link
        if (sessionId != null) {
            binding.sessionIdInput.setText(sessionId)
            trySessionJoin(sessionId!!)
        }

        // Join after typing a session ID
        binding.joinButton.setOnClickListener {
            trySessionJoin(binding.sessionIdInput.text.toString().trim())
        }
        binding.joinBack.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_joinFragment_to_startScreenFragment))

        return binding.root
    }

    fun trySessionJoin(inputSessionId: String) {
        if (inputSessionId.isEmpty()) {
            binding.sessionIdInput.error = "Please provide a session ID"
            return
        }

        Database.joinSession(inputSessionId, this)
    }

    fun onSuccessfulSessionJoin() {
        // Load session data
        Database.loadSessionData()
        // Navigate to swipe screen
        val swipeIntent = Intents(isHost = false, context = this.context)
        swipeIntent.intentToSwipe()
    }

    fun onFailedSessionJoin(error: String = "Could not connect to session :c") {
        binding.sessionIdInput.error = error
    }

    companion object DeepLinkData {
        var sessionId: String? = null
    }
}