package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.R.string
import com.example.affirmations.model.Affirmation

class DataSource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(string.affirmation1, R.drawable.image1),
            Affirmation(string.affirmation2, R.drawable.image2),
            Affirmation(string.affirmation3, R.drawable.image3),
            Affirmation(string.affirmation4, R.drawable.image4),
            Affirmation(string.affirmation5, R.drawable.image5),
            Affirmation(string.affirmation6, R.drawable.image6),
            Affirmation(string.affirmation7, R.drawable.image7),
            Affirmation(string.affirmation8, R.drawable.image8),
            Affirmation(string.affirmation9, R.drawable.image9),
            Affirmation(string.affirmation10, R.drawable.image10)
        )
    }
}