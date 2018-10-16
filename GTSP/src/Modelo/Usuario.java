package Modelo;

import java.util.Observable;

/**
 * <b>inv: </b><br>
 * nombreApe!=null <br>
 * !nombreApe.equals("") <br>
 * email!=null <br>
 * !email.equals("") <br>
 * telefono!=null <br>
 * !telefono.equals("") <br>
 * perfil!=null <br>
 * !perfil.equals("") <br>
 * nombreUsuario!=null <br>
 * !nombreUsuario.equals("") <br>
 * contrase�a!=null <br>
 * !contrase�a.equals("") <br>
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
        assert !nombreApe.equals(""): "Nombre y apellido vacio";
        assert email!=null: "Email nulo";
        assert !email.equals(""): "email vacio";
        assert telefono!=null: "Telefono nulo";
        assert !telefono.equals(""): "telefono vacio";
        assert perfil!=null: "Perfil nulo";
        assert !perfil.equals(""): "perfil vacio";
        assert nombreUsuario!=null: "nomreUsuario nulo";
        assert nombreUsuario.equals(""): "nombreUsuario vacio";
        assert contrase�a!=null: "Contrtase�a nula";
        assert !contrase�a.equals(""): "contrase�a vacia";
        assert base!=null: "Referencia nula a base de datos";
    }
}
