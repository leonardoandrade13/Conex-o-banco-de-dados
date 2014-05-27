
import br.com.nomeempresa.modelo.dao.FabricaConexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Principal {

    public static void main(String[] args) throws SQLException {
        //connection conn = null;
        //conn = FabricaConexao.pegaConexao();
        PreparedStatement pstm = null;
        pstm = FabricaConexao.pegaConexao()
                .prepareStatement("insert into"
                + " funcionario (nome, telefone)"
                + " values ('joão', ' 48 99234753');");
        pstm.execute();
    }
}
