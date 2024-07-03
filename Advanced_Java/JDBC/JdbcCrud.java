import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcCrud{
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/student";
        String username="foo";
        String password="bar";

        try{
            Connection connection=DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established");
            // insert(connection, 3, "Ritesh", "mohan");
            read(connection,2);
            update(connection, 2, "firstname", "Roman");
            read(connection,2);
            delete(connection,1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

    // Create a new record
    public static void insert(Connection con,Integer id,String first,String last)
    {
        try{
            String query="INSERT INTO students (id,firstname,lastname) values (?,?,?)";
            PreparedStatement st=con.prepareStatement(query);
            st.setInt(1, id);
            st.setString(2, first);
            st.setString(3, last);
            st.executeUpdate();
            System.out.println("Inserted succesfully");
        }
        catch(Exception e)
        {
            System.out.println("not able to insert");
            e.printStackTrace();
        }
    }

    // Read a new record by id
    public static void read(Connection con,Integer id)
    {
        try {
            String query="Select * from students where id="+id;
            PreparedStatement st=con.prepareStatement(query);
            // st.setInt(0,id);s
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                // while(rs.next())
                // {
                System.out.println("reading");
                    String firstcol=rs.getString("id");
                    String secondcol=rs.getString("firstname");
                    String thirdcol=rs.getString("lastname");
                    System.out.println(firstcol+" "+secondcol+" "+thirdcol);
                // }
            }
            // System.out.println(st.executeQuery());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // update a new record by id
    public static void update(Connection con,Integer id,String element,String key)
    {
        try{
        String query="update students set "+element+" = \""+key+"\" where id="+id;
        System.out.println(query);
        PreparedStatement st=con.prepareStatement(query);
        st.executeUpdate();
        System.out.println("updated succesfully");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    // Delete a query
    public static void delete(Connection con, Integer id)
    {
        try {
            String query="delete from students where id="+id;
            PreparedStatement st=con.prepareStatement(query);
            st.executeUpdate();
            System.out.println("deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Succesfully completed CRUD operation in java through JDBC