import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BDController {
	private Connection conexion;
	
	BDController(){
		try {
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/nba", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en constructor BDController: " + e.getMessage());
		}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
	public void AltaJugador(Jugador jugador) {
		try {
			Statement MyStatement = this.conexion.createStatement();
			String AltaJugador="INSERT into jugador values ('"+jugador.getCodigo()+"','"+jugador.getNombre()+"','"+jugador.getProcedencia()+"','"+jugador.getAltura()+"','"+jugador.getPeso()+"','"+
			jugador.getPosicion()+"','"+jugador.getEquipo();
			MyStatement.execute(AltaJugador);
			MyStatement.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void BajaJugador(String codigo) {
		try {
			Statement MyStatement = this.conexion.createStatement();
			String BajaJugador = "DELETE from jugadores WHERE codigo='"+codigo+"'";
			MyStatement.execute(BajaJugador);
			MyStatement.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Equipo> EquiposNBA(){
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		try {
			Statement MyStatement = this.conexion.createStatement();
			ResultSet rs=MyStatement.executeQuery("SELECT * from equipos");
			while(rs.next()) {
				equipos.add(new Equipo(rs.getString("nombre"),rs.getString("ciudad"),rs.getString("conferencia"),rs.getString("division")));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return equipos;
	}
	
	public boolean ExisteEquipo (String nombre) {
		boolean existe = false;
		try {
			Statement MyStatement = this.conexion.createStatement();
			String ExisteEquipo="SELECT * from equipo WHERE nombre='"+nombre+"'";
			ResultSet rs=MyStatement.executeQuery(ExisteEquipo);
			while(rs.next()) {
				existe=true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return existe;
	}
	public boolean ExisteJugador(String codigo) {
		boolean existe = false;
		try {
			Statement MyStatement = this.conexion.createStatement();
			String ExisteJugador="SELECT * from jugadores WHERE codigo='"+codigo+"'";
			ResultSet rs = MyStatement.executeQuery(ExisteJugador);
			while(rs.next()) {
				existe= true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return existe;
	}
	
	public ArrayList<Equipo> EquiposPorDivision(String division){
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		try {
			Statement MyStatement = this.conexion.createStatement();
			String EquiposPorDivision ="SELECT * from equipos WHERE divison='"+division+"'";
			ResultSet rs = MyStatement.executeQuery(EquiposPorDivision);
			while(rs.next()) {
				equipos.add(new Equipo(rs.getString("nombre"),rs.getString("ciudad"),rs.getString("conferencia"),rs.getString("division")));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return equipos;
	}
	
	public boolean DivisonExiste(String division) {
		boolean existe = false;
		try {
			Statement MyStatement = this.conexion.createStatement();
			String DivisionExiste="SELECT * from equipos WHERE division='"+division+"'";
			ResultSet rs = MyStatement.executeQuery(DivisionExiste);
			while(rs.next()) {
				existe=true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return existe;
	}
	
	public ArrayList<Equipo> EquiposPorConferencia (String conferencia){
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		try {
			Statement MyStatement = this.conexion.createStatement();
			String EquiposPorConferencia ="SELECT * from equipos wHERE conferencia='"+conferencia+"'";
			ResultSet rs = MyStatement.executeQuery(EquiposPorConferencia);
			while(rs.next()) {
				equipos.add(new Equipo(rs.getString("nombre"),rs.getString("ciudad"),rs.getString("conferencia"),rs.getString("division")));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return equipos;
	}
	
	public boolean ConferenciaExiste(String conferencia) {
		boolean existe = false;
		try {
			Statement MyStatement = this.conexion.createStatement();
			String DivisionExiste="SELECT * from equipos WHERE conferencia='"+conferencia+"'";
			ResultSet rs = MyStatement.executeQuery(DivisionExiste);
			while(rs.next()) {
				existe=true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return existe;
	}
	
}
