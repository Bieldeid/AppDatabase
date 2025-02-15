package com.example.appdatabase.roomDB

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface PessoaDao {
    @Upsert
    suspend fun upsertPessoa(pessoa:Pessoa)

    @Delete
    suspend fun deletePessoa(pessoa:Pessoa)

    @Query("select * from pessoa")
    fun getAllPessoas(): Flow<List<Pessoa>>
}