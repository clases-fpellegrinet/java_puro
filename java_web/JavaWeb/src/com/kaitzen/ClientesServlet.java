package com.kaitzen;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClientesServlet
 */
@WebServlet("/Clientes")
public class ClientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cliente cli = new Cliente();
		cli.setNombre(request.getParameter("nombre"));
		cli.setApellido(request.getParameter("apellido"));
		cli.setCorreoElectronico(request.getParameter("email"));
		cli.setNroDocumento(Long.parseLong(request.getParameter("nroDoc")));
		cli.setTipoDocumento(TipoDocumento.valueOf(request.getParameter("tipoDoc")));
		cli.setSitFiscal(SituacionFiscal.valueOf(request.getParameter("optCondFiscal")));
		SituacionLaboral aux = SituacionLaboral.values()[Integer.parseInt(request.getParameter("sitLaboral"))-1];
		System.out.println("VER:"+aux);
		cli.setSituacionLaboral(aux);
		Localidad loc = new Localidad();
		loc.setLocalidad(request.getParameter("localidad"));
		Domicilio dom = new Domicilio();
		dom.setCalle(request.getParameter("calle"));
		dom.setNro(request.getParameter("nroCalle"));
		dom.setPiso(request.getParameter("piso"));
		dom.setDepartamento(request.getParameter("depto"));
		dom.setLocalidad(loc);
		cli.setDomicilio(dom);

		List<TipoProducto> listaIntereses = new ArrayList<TipoProducto>();
		String[] intereses = request.getParameterValues("cmbIntereses");
		for (String tmp : intereses){
			TipoProducto tmpTipoProd = new TipoProducto();
			tmpTipoProd.setTipoProducto(tmp);
			listaIntereses.add(tmpTipoProd);
		}

		cli.setProductosInteresado(listaIntereses);
		List<TarjetaCredito> listaTarjetas = new ArrayList<TarjetaCredito>();
		SimpleDateFormat sdf = new SimpleDateFormat("MMyyyy");
		if(request.getParameter("txtBancoEmisor1")!=null && 
				!request.getParameter("txtBancoEmisor1").trim().equalsIgnoreCase("")){
			TarjetaCredito t1 = new TarjetaCredito();

			t1.setBancoEmisor(request.getParameter("txtBancoEmisor1"));

			t1.setDescripcion(request.getParameter("marcaTarjeta1"));

			try {

				t1.setFechaVencimiento(sdf.parse(request.getParameter("txtFechaVenc1")));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			listaTarjetas.add(t1);
		}

		if(request.getParameter("txtBancoEmisor2")!=null &&
				!request.getParameter("txtBancoEmisor2").trim().equalsIgnoreCase("")){
			TarjetaCredito t2 = new TarjetaCredito();

			t2.setBancoEmisor(request.getParameter("txtBancoEmisor2"));

			t2.setDescripcion(request.getParameter("marcaTarjeta2"));

			try {

				t2.setFechaVencimiento(sdf.parse(request.getParameter("txtFechaVenc2")));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			listaTarjetas.add(t2);
		}
		cli.setTarjetaCredito(listaTarjetas);
		PrintWriter out = response.getWriter();
		out.println("<h1> EL cliente se ha creado correctamente</h1>");
		out.println("<h2>"+cli.toString()+" </h2>");
	}

}
