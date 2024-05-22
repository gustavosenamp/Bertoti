from llama_cpp import Llama
from llama_cpp.llama_tokenizer import LlamaHFTokenizer

import sqlite3
import telebot

# Token do bot Telegram
API_TOKEN = '7178463135:AAH33BMYdCgIjhfJDL-IIHkY4Yd2LJJLaUI'


# Função para conectar ao banco de dados
def connect_db():
    return sqlite3.connect('livraria.db')

# Função para buscar os livros disponíveis
def encontrar_livros():
    conn = connect_db()
    c = conn.cursor()
    c.execute('SELECT titulo FROM livros')
    titulos = c.fetchall()
    conn.close()
    return [titulo[0] for titulo in titulos]

# Função para buscar o preço de um livro específico
def preco_livro(titulo):
    conn = connect_db()
    c = conn.cursor()
    c.execute('SELECT preco FROM livros_precos JOIN livros ON livros_precos.titulo_id = livros.id WHERE titulo = ?', (titulo,))
    preco = c.fetchone()
    conn.close()
    print("Preço de", titulo, ":", preco)  # Instrução de depuração
    if preco is not None:
        return preco[0]
    else:
        return None

# Função para adicionar um livro à lista
def add_to_list(livro, livro_lista, preco_lista):
    preco = preco_livro(livro)
    if preco is not None:
        livro_lista.append(livro)
        preco_lista.append(preco)
    else:
        print(f"Preço não encontrado para o livro: {livro}")

# Função para calcular o custo total dos livros na lista
def calcular_custo_total(preco_lista):
    total_cost = sum(preco_lista)
    return total_cost

livros_escolhidos = []  # Lista para armazenar os livros escolhidos
precos_escolhidos = []  # Lista para armazenar os preços dos livros escolhidos

def process_message(message_text):
    encontrar_livro = encontrar_livros()

    if "livros" in message_text.lower():
        response = f"Olá! Temos os seguintes livros disponíveis: {', '.join(encontrar_livro)}. Por favor, informe os livros desejados."
        return response

    elif message_text.lower() in [titulo.lower() for titulo in encontrar_livro]:
        livro_escolhido = message_text.lower()
        livros_escolhidos.append(livro_escolhido)
        response = f"Você adicionou '{livro_escolhido}' à sua lista de pedidos. Se desejar mais algum livro, por favor, me informe. Caso contrário, diga 'finalizar'."
        return response

    elif "finalizar" in message_text.lower():
        if livros_escolhidos:
            response = f"Você selecionou os seguintes livros: {', '.join(livros_escolhidos)}. Um atendente virá em breve para tratar dos pagamentos. Obrigado por escolher nossos livros!"
            return response
        else:
            response = "Você ainda não selecionou nenhum livro. Por favor, mande a palavra 'livros' para que eu te mostre os livros disponíveis."
            return response

    else:
        response = "Desculpe, não entendi. Por favor, mande a palavra 'livros' para que eu te mostre os livros disponíveis ou finalize sua lista com a palavra 'finalizar'."
        return response

# Iniciar o bot Telegram
bot = telebot.TeleBot(API_TOKEN)

# Integrar com o manipulador de mensagens do bot
@bot.message_handler(func=lambda message: True)
def reply_to_message(message):
    response = process_message(message.text)
    if response:
        bot.reply_to(message, response)

# Iniciar polling do bot
bot.polling()
