В  двух  таблицах  хранится  информация  о  клиентах  и  их  телефонных  номерах.
Предлагается  реализовать  вебприложение  для  отображения  и  редактирования
контактных данных клиентов, а также разработать БД для этой задачи.
Исходные условия:
● у каждого клиента может и должен быть один контактный телефон
● о клиенте известно только его ФИО
● у  номера  телефона  есть  три  характеристики:  сам  номер,  тип  (домашний,
мобильный, нет сведений), комментарий
Требования:
● клиенты и их телефоны должны отображаться сразу одним списком (таблицей)
со всей имеющейся информацией, без деления на страницы и дополнительных
диалоговых окон
● данные  о  номере  телефона  можно  только  редактировать,  добавлять/удалять
клиентов и их контакты запрещено
● данные самого клиента не редактируются
● сохранение/обновление  информации  должно  происходить  без  перезагрузки
страницы
● редактирование  информации  должно  происходить  по  принципу:  изменение
нескольких записей > сохранение > обновление представления
Технологии:
● Spring MVC 3+
● ORMбиблиотека Hibernate 3+ (или альтернативы)
● СУБД на выбор(плюсом будет использование Embedded базы)
● разрешается  использование  сторонних  вебфреймворков  или  библиотек  при
необходимости
● Система автоматической сборки на выбор.
