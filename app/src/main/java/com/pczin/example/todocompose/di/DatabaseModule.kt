package com.pczin.example.todocompose.di

import dagger.Module
import dagger.hilt.InstallIn
@Module
@InstallIn() //TODO: SingletonComponent::Class dentro do Installin()<- Ta dando error ver o que é
object DatabaseModule {
}