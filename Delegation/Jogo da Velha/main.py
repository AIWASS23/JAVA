import math
import copy

infinito = float(math.inf)

def montaTabuleiro():
  return [[None, None, None] for i in range(3)]

def verificaPreenchimentoTotal(tabuleiro):
  for i in tabuleiro:
    for j in i:
      if j == None:
        return False
  return True

def avalia(tabuleiro):
  
  #Verifica se alguém venceu nas linhas
  for i in tabuleiro:
    if i.count(1) == 3:
      return 10
    if i.count(0) == 3:
      return -10

  #Verifica se alguém venceu nas colunas
  for i in range(3):
    quantidadeX = 0
    quantidadeO = 0

    for j in tabuleiro:
      if j[i] == 1:
        quantidadeX += 1
      if j[i] == 0:
        quantidadeO += 1

    if quantidadeX == 3:
      return 10
    if quantidadeO == 3:
      return -10

  #Verifica se alguém venceu nas diagonal principal
  quantidadeX = 0
  quantidadeO = 0
  for i in range(3):
    if tabuleiro[i][i] == 1:
      quantidadeX += 1
    if tabuleiro[i][i] == 0:
      quantidadeO += 1
  if quantidadeX == 3:
    return 10
  if quantidadeO == 3:
    return -10

  #Verifica se alguém venceu nas diagonal secundária
  quantidadeX=0
  quantidadeO=0
  for i in range(3):
    if tabuleiro[i][2-i] == 1:
      quantidadeX += 1
    if tabuleiro[i][2-i] == 0:
      quantidadeO += 1
  if quantidadeX == 3:
    return 10
  if quantidadeO == 3:
    return -10

  return 0

def casasDisponiveis(estado):
  return [(i,j) for i in range(len(estado)) for j in range(len(estado)) if estado[i][j] == None]

def sucessores(estado):
  suc = []
  quantidadeO, quantidadeX = 0, 0

  for i in estado:
    for j in i:
      if j == 1:
        quantidadeX += 1
      elif j == 0:
        quantidadeO += 1

  if quantidadeX > quantidadeO:
    jog = 0
  else:
    jog = 1
  
  for i,j in casasDisponiveis(estado):
    st = copy.deepcopy(estado)
    st[i][j] = jog
    suc.append(st)
    
  return suc

def verificaFimJogo(estado):
  resultado = avalia(estado)
  if resultado == 10:
    print("\nFim de jogo, β-Mαx venceu!")
    return True
  elif resultado == -10:
    print("\nGame Over, min ganhou")
    return True
  elif verificaPreenchimentoTotal(estado):
    print("\nEmpatou! Avisei que β-Mαx nunca perde.")
    return True
  return False

def exibeTabuleiro(tabuleiro, cabecalho):
  print("------------------")
  for i in range(len(tabuleiro)):
    for j in range(len(tabuleiro)):
      valor = tabuleiro[i][j]

      if cabecalho == 0:
        if tabuleiro[i][j] == 1:
          valor = 'X'
        elif tabuleiro[i][j] == 0:
          valor = 'O'

      print(" {}".format(valor).ljust(5), end=" ")
    print()
  print("------------------")

def miniMax(estado, jog = 1, alfa = -infinito, beta= infinito):
  st = copy.deepcopy(estado)
  succ = sucessores(st)
  scores = []

  if jog == 1:
    for i in succ:
      av = avalia(i)
      if av == 10 or av == -10 or verificaPreenchimentoTotal(i):
        scores.append(av)
      else:
        sc, st = miniMax(i, 1-jog)
        if sc >= beta:
          return sc, st
        alfa = max(alfa, sc)
        scores.append(sc)
    scmax = max(scores)
    ind = scores.index(scmax)
    return scmax, succ[ind]
  else:
    for i in succ:
      av = avalia(i)
      if av == 10 or av == -10 or verificaPreenchimentoTotal(i):
        scores.append(av)
      else:
        sc, st = miniMax(i, 1-jog)
        if sc <= alfa:
          return sc, st
        beta = min(beta, sc)
        scores.append(sc)
    scmin = min(scores)
    ind = scores.index(scmin)
    return scmin, succ[ind]

def miniMaxAlfaBeta(estado, jog = 1, alfa = -infinito, beta= infinito):
  st = copy.deepcopy(estado)
  succ = sucessores(st)
  scores = []

  if jog == 1:
    for i in succ:
      av = avalia(i)
      if av == 10 or av == -10 or verificaPreenchimentoTotal(i):
        scores.append(av)
      else:
        sc, st = miniMaxAlfaBeta(i, 1-jog)
        if sc >= beta:
          return sc, st
        alfa = max(alfa, sc)
        scores.append(sc)
    scmax = max(scores)
    ind = scores.index(scmax)
    return scmax, succ[ind]
  else:
    for i in succ:
      av = avalia(i)
      if av == 10 or av == -10 or verificaPreenchimentoTotal(i):
        scores.append(av)
      else:
        sc, st = miniMaxAlfaBeta(i, 1-jog)
        if sc <= alfa:
          return sc, st
        beta = min(beta, sc)
        scores.append(sc)
    scmin = min(scores)
    ind = scores.index(scmin)
    return scmin, succ[ind]

def jogoVelhaAlfaBeta():
  exibirInstrucoes()
  matrizVelha = montaTabuleiro()

  while True:
    jogada = miniMaxAlfaBeta(matrizVelha)

    print("\n-> Vez de β-Mαx")
    exibeTabuleiro(jogada[1], 0)
    
    if verificaFimJogo(jogada[1]):
      return
      
    while True:
      jogadaUsuario = eval(input("\nSua vez, faça uma jogada (1...9): "))
      jogadaUsuario -= 1

      a, b = int(jogadaUsuario/3), jogadaUsuario%3
      if 0 <= jogadaUsuario <= 8 and jogada[1][a][b] == None:
        break
      print("Essa jogada não é válida")
      
    jogada[1][a][b] = 0
    exibeTabuleiro(jogada[1], 0)

    if verificaFimJogo(jogada[1]):
      return

    matrizVelha = jogada[1]

def exibirInstrucoes():
  print("# JOGO DA VELHA #\n")
  print("β-Mαx nunca perde, quer desafiá-lo?\nAtente as posições de cada casa quando for sua vez!")
  print("(OBS: 'None' significa posição jogável)\n")
  exibeTabuleiro([[3 * i + 1, 3 * i + 2, 3 * i + 3] for i in range(3)], 1)
  print("\nAguarde para jogar, carregando.....\n")

jogoVelhaAlfaBeta()
