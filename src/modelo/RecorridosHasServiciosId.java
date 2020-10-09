package modelo;
// Generated 6/10/2020 07:46:44 PM by Hibernate Tools 4.3.1



/**
 * RecorridosHasServiciosId generated by hbm2java
 */
public class RecorridosHasServiciosId  implements java.io.Serializable {


     private int recorridosUsuariosIdUsuario;
     private int serviciosIdServicio;

    public RecorridosHasServiciosId() {
    }

    public RecorridosHasServiciosId(int recorridosUsuariosIdUsuario, int serviciosIdServicio) {
       this.recorridosUsuariosIdUsuario = recorridosUsuariosIdUsuario;
       this.serviciosIdServicio = serviciosIdServicio;
    }
   
    public int getRecorridosUsuariosIdUsuario() {
        return this.recorridosUsuariosIdUsuario;
    }
    
    public void setRecorridosUsuariosIdUsuario(int recorridosUsuariosIdUsuario) {
        this.recorridosUsuariosIdUsuario = recorridosUsuariosIdUsuario;
    }
    public int getServiciosIdServicio() {
        return this.serviciosIdServicio;
    }
    
    public void setServiciosIdServicio(int serviciosIdServicio) {
        this.serviciosIdServicio = serviciosIdServicio;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RecorridosHasServiciosId) ) return false;
		 RecorridosHasServiciosId castOther = ( RecorridosHasServiciosId ) other; 
         
		 return (this.getRecorridosUsuariosIdUsuario()==castOther.getRecorridosUsuariosIdUsuario())
 && (this.getServiciosIdServicio()==castOther.getServiciosIdServicio());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getRecorridosUsuariosIdUsuario();
         result = 37 * result + this.getServiciosIdServicio();
         return result;
   }   


}

