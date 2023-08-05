package com.example.rickandmortyapicleanarchitecture.data.remote.apiservices

import com.example.rickandmortyapicleanarchitecture.data.remote.dtos.character.CharacterModelDto
import com.example.rickandmortyapicleanarchitecture.data.remote.dtos.character.RickAndMortyResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterApiService {

    @GET("character")
    suspend fun fetchCharacters(): RickAndMortyResponse<CharacterModelDto>

    @GET("character/{id}")
    suspend fun fetchSingleCharacter (
        @Path("id") id: Int
    ): CharacterModelDto
}