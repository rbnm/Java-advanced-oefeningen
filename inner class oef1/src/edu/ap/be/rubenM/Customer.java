package edu.ap.be.rubenM;

public class Customer {
    
    private String naam;
    
    public String getNaam() {
        return naam;
    }
    public class Invoice {
        private int invoiceNumber;

        public Invoice(int invoiceNumber){
            this.invoiceNumber = invoiceNumber;
        }
        public int getInvoiceNumber() {
            return invoiceNumber;
        }
        
    } 

    public class Address {
        private String straat;
        private String huisnr;
        private String postcode;
        private String gemeente;
        
        public Address(String straat, String huisnr, String postcode, String gemeente) {
            this.straat = straat;
            this.huisnr = huisnr;
            this.postcode = postcode;
            this.gemeente = gemeente;
        }

    }
    
    @Override
    public String toString() {
        String res ="";
        res += "Invoice No " + getInvoiceNumber() + "\n";
        res += "\n" + getNaam() + "\n";
        return super.toString();
    }
   
}