# -*- coding: utf-8 -*-
import sys
op_matricula = open("MATRICULA.csv", "r")
op_nome = open("NAMES.csv", "r")
nomes = op_nome.read().split(".")
matriculas = op_matricula.read().split()
i = 0
nome_matricula = []
while(i < len(matriculas)):
    nome_matricula.append(nomes[i] + ";" + matriculas[i])
    i = i+1

for id in nome_matricula:
    print(id)
new_file = open("NOME_MATRICULA.csv", "w")
new_file.write("\n".join(nome_matricula))
