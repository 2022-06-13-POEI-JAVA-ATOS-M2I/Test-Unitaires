package distributeur;

import java.util.ArrayList;
import java.util.List;

public class Distributeur {

    private int credit;
    private List<Produit> stock;
    
    public Distributeur(){
        credit = 0;
        stock = new ArrayList();
    }
    
    public void remplirLeStock() {
        stock.add(new Produit(1, "café", 1, 5));
        stock.add(new Produit(2, "soda", 2, 5));
        stock.add(new Produit(3, "barre céréales", 3, 5));
    }

    public void insererArgent(int montant) {
        credit += montant;
    }
    
    public boolean stockSuffisant(int idProduit) {
        Produit produit = getProduit(idProduit);
        if (produit == null) {
            return false;
        }
        return produit.getQuantite() >= 1;
    }
    
    public boolean creditSuffisant(int idProduit) {
        Produit produit = getProduit(idProduit);
         if (produit == null) {
            return false;
        }
        return credit >= produit.getPrix();
    }

    public void commanderProduit(int idProduit){

        if(stockSuffisant(idProduit) && creditSuffisant(idProduit)) {
            Produit produit = getProduit(idProduit);

            if (produit == null) {
                return;
            }
            
            produit.setQuantite(produit.getQuantite() - 1);
            credit -= produit.getPrix(); 
        }
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public List<Produit> getStock() {
        return stock;
    }

    public void setStock(List<Produit> stock) {
        this.stock = stock;
    }
    
    public Produit getProduit(int id) {
        for(Produit produit: stock) {
           if(produit.getId() == id){
               return produit;
           }
        }
        return null;
    }
    
}