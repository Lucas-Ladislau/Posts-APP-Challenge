# Posts-APP-Challenge
Sabemos que a comunicação com API pode demorar um tempo, e por isso o utilizador deve receber algum tipo de feedback para entender o que está acontecendo, a forma mais normal de fazer isso é exibir um loading enquanto a resposta é carregada.

Além disso, vamos introduzir o conceito de navegação em telas, e ter mais do que uma Activity no nosso app.

Por isso, para esse desafio vamos fazer a integração com a api JSON placeholder.
API: https://jsonplaceholder.typicode.com/
endpoint: https://jsonplaceholder.typicode.com/posts, 
          https://jsonplaceholder.typicode.com/comments?postId=IDPOST


A ideia é que enquanto a api não tiver retornado a resposta o app deve exibir a lista de posts e de comentários como um Skeleton Content.

A primeira página deve ser a lista de Posts, e ao clicar em um post da lista, deve abrir uma nova página, como o post na parte superior e logo abaixo a lista de comentários do post.

O que estudar: 
Para concluir esse desafio você vai precisar dos conhecimentos adquiridos no primeiro e segundo desafio, por isso relembre os itens necessários.
RecyclerView, Ciclo de Vida, Retrofit.
Também serão necessários novos conhecimentos, como Navegação entre Activities, e envio de dados entre Activities.

Obs: Para o layout da aplicação busque inspiração em apps que tenham feeds de posts, como Twitter, Threads, Instagram.
