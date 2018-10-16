package Modelo;

import java.util.Observable;

/**
 * <b>inv: </b><br>
 * nombreApe!=null <br>
 * email!=null <br>
 * telefono!=null <br>
 * perfil!=null <br>
 * nombreUsuario!=null <br>
 * contrase�a!=null <br>
 * base!=null <br>
 */
public class Usuario extends Observable
{
    private String nombreApe;
    private String email;
    private String telefono;
    private String perfil;
    private String nombreUsuario;
    private String contrase�a;
    BaseDeDatos base=null;
    
    public Usuario()
    {
        super();
    }

    public Usuario(String nombreApe, String email, String telefono, String perfil, String nombreUsuario, String contrase�a, BaseDeDatos base)
    {
        this.nombreApe = nombreApe;
        this.email = email;
        this.telefono = telefono;
        this.perfil = perfil;
        this.nombreUsuario = nombreUsuario;
        this.contrase�a = contrase�a;
        this.base=base;
        this.verificaInvariante();
    }

    public void setNombreApe(String nomApe)
    {
        this.nombreApe = nomApe;
        this.verificaInvariante();
    }

    public String getNombreApe()
    {
        return nombreApe;
    }

    public void setEmail(String email)
    {
        this.email = email;
        this.verificaInvariante();
    }

    public String getEmail()
    {
        return email;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
        this.verificaInvariante();
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setPerfil(String perfil)
    {
        this.perfil = perfil;
        this.verificaInvariante();
    }

    public String getPerfil()
    {
        return perfil;
    }

    public void setNombreUsuario(String nombreUsuario)
    {
        this.nombreUsuario = nombreUsuario;
        this.verificaInvariante();
    }

    public String getNombreUsuario()
    {
        return nombreUsuario;
    }

    public void setContrase�a(String contrase�a)
    {
        this.contrase�a = contrase�a;
        this.verificaInvariante();
    }

    public String getContrase�a()
    {
        return contrase�a;
    }

    public void setBase(BaseDeDatos base)
    {
        this.base = base;
        this.verificaInvariante();
    }

    public BaseDeDatos getBase()
    {
        return base;
    }
    
    private void verificaInvariante()
    {
        assert nombreApe!=null: "Nombre y Apellido nulo";
        assert email!=null: "Email nulo";
        assert telefono!=null: "Telefono nulo";
        assert perfil!=null: "Perfil nulo";
        assert nombreUsuario!=null: "nomreUsuario nulo";
        assert contrase�a!=null: "Contrtase�a nula";
        assert base!=null: "Referencia nula a base de datos";
    }
}
