using my.bookshop as my from '../db/data-model';

service CatalogService {
    entity Books as projection on my.Books;
    entity Orders as projection on my.Orders;
     entity Authors as projection on my.Authors; 
   
}


