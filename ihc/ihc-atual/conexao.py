import sqlite3

# Conectar ao banco de dados SQLite
conexao = sqlite3.connect('livraria.db')
c = conexao.cursor()

# Criar tabela de livros se não existir
c.execute('''CREATE TABLE IF NOT EXISTS livros
             (id INTEGER PRIMARY KEY, titulo TEXT)''')

# Inserir dados na tabela se não existirem
livros = [('Dom Quixote',), ('O Pequeno Príncipe',), ('Flores para Algernon',), ('Um Homem Chamado Ove',)]
c.executemany("INSERT INTO livros (titulo) VALUES (?)", livros)

# Commit e fechar a conexão
conexao.commit()
conexao.close()
