Teste Dev Back-end
Problema 01
Criar uma API para disponibilizar os dados para a composição de um dashboard de chamados de suporte conforme 
protótipo abaixo:
A API deverá receber o mês e o ano como parâmetro e retornar em uma única chamada o seguintes dados:
Lista de Tickets;
Dados Agrupados Por Cliente;
Dados Agrupados Por Módulo.
A API deve permitir a criação de um Ticket.
O agrupamento por cliente e por módulo não deve ser feito via SQL e sim com base na lista recuperada no 
banco de dados.

ALFA Desenvolvimento  –  Teste Dev Back-end
Problema 02  –  2
Problema 02
Criar uma API que receba um um prato e retorne a lista de receitas encontradas.
As receitas devem ser consultadas na API https://forkify-api.herokuapp.com/api/ passando o prato como 
parâmetro.
Exemplo de request buscando receitas de pizza:
https://forkify-api.herokuapp.com/api/search?q=pizza
Exemplo retorno:
 {
 "count": 28,
 "recipes": [
 {
 "publisher": "101 Cookbooks",
 "title": "Best Pizza Dough Ever",
 "source_url": "http://www.101cookbooks.com/archives/001199.html",
 "recipe_id": "47746",
 "image_url": "http://forkify-api.herokuapp.com/images/
best_pizza_dough_recipe1b20.jpg",
 "social_rank": 100,
 "publisher_url": "http://www.101cookbooks.com"
 },
 {
 "publisher": "The Pioneer Woman",
 "title": "Deep Dish Fruit Pizza",
 "source_url": "http://thepioneerwoman.com/cooking/2012/01/fruit-pizza/",
 "recipe_id": "46956",
 "image_url": "http://forkify-api.herokuapp.com/images/fruitpizza9a19.jpg",
 "social_rank": 100,
 "publisher_url": "http://thepioneerwoman.com"
 },
 {
 "publisher": "Closet Cooking",
 "title": "Pizza Dip",
 "source_url": "http://www.closetcooking.com/2011/03/pizza-dip.html",
 "recipe_id": "35477",
 "image_url": "http://forkify-api.herokuapp.com/images/
Pizza2BDip2B12B500c4c0a26c.jpg",
 "social_rank": 99.99999999999994,
 "publisher_url": "http://closetcooking.com"
 }
 }
Dados Adicionais
