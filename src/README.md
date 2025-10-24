-- Projeto STATE --

O padrão de projeto STATE tem como funcionalidade desenvolver e controlar o comportamento de um pedido. Como, no caso do nosso projeto, tratamos acerca de uma empresa com gestão de pedidos online, o padrão STATE diz que os pedidos podem passar por diferentes estados, ou seja, podem ser cancelados, criados (novo), alterados, enviados, finalizados...
Portanto, o padrão STATE define que o objeto Order altere seu comportamento conforme o estado do objeto. Assim, desacoplando a lógica dos estados com o objeto principal. 


