package com.company;

public enum Quality {
    NORMAL{
        @Override
        public void getCost(Product product) {
            product.setSellPrice(product.getBuyPrice()*1.2);
        }
    },
     SLIDHTYFLAWED{
         @Override
         public void getCost(Product product) {
             product.setSellPrice(product.getBuyPrice()*0.95);
         }
     },
    HALFWENTBAD{
        @Override
        public void getCost(Product product) {
            product.setSellPrice(product.getBuyPrice()*0.55);
        }
    },
    ALMIOSTALLDISAPPEARED{
        @Override
        public void getCost(Product product) {
            product.setSellPrice(product.getBuyPrice()*0.25);
        }
    },
    SPOILEDINTOTRASH{
        @Override
        public void getCost(Product product) {
            product.setSellPrice(product.getBuyPrice()*0.1);
        }
    };
    public abstract void getCost (Product product) ;

}
