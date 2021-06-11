using my.bookshop as my from '../db/data-model';

service StatService {
@readonly 
entity Orders as projection on my.Orders excluding {
    book,
    createdAt,
    createdBy
}
}