package logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Mascota;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-01-10T22:51:17", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Dueno.class)
public class Dueno_ { 

    public static volatile SingularAttribute<Dueno, String> direccion;
    public static volatile SingularAttribute<Dueno, String> celular;
    public static volatile SingularAttribute<Dueno, Integer> idDueno;
    public static volatile SingularAttribute<Dueno, String> nombre;
    public static volatile ListAttribute<Dueno, Mascota> listaMascotas;

}