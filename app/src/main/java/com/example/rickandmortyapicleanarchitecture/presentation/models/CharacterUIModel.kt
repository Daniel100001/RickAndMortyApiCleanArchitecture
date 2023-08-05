package com.example.rickandmortyapicleanarchitecture.presentation.models

import com.example.rickandmortyapicleanarchitecture.domain.models.CharacterModel

data class CharacterUIModel(

    val id: Int,

    val name: String,

    val image: String,

    val status: String,

    val species: String,

    val type: String,

    val gender: String

) : java.io.Serializable

fun CharacterModel.toUI() = CharacterUIModel(
    id, name, image, status, species, type, gender
)


