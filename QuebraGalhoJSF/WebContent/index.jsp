<%@ page contentType="text/html; charset=UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>  
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%> 


<html xmlns="http://www.w3.org/1999/xhtml">




<f:view>
<script type="text/javascript">
function buscar()
{      
         document.buscarForm.action='/faces/resultadoBusca.jsp';
         document.buscarForm.submit();
};
  
</script>  

<body>
<h:form> 

<div id="container">

<div id="Centro" style="background-color:#FFFFFF; position:absolute; top: 50%; left:20%; right:20%">
<div id="titulo" style="background-color:#FFFFFF; font-size:20pt; text-align: center;">
QUEBRA GALHO
</div>
<div id="escolhas" style="background-color:#FFFFFF;">



   		<h:selectOneListbox value="Profissao">
   			<f:selectItems value="#{index.favYear3Value}" var="y" itemLabel="#{y.nome}" itemValue="#{y.id}" />
   		</h:selectOneListbox>

<select id="estadoField" style="margin-left: auto; margin-right: auto;">
<option value="0">Estado</option>
<option value="1">Rio de Janeiro</option>
<option value="2">São Paulo</option>
<option value="3">Minas Gerais</option>
</select>

<select id="cidadeField" style="margin-left: auto; margin-right: auto;">
<option value="0">Cidade</option>
<option value="1">Rio de Janeiro</option>
<option value="2">Caxias</option>
<option value="3">São Paulo</option>
</select></div>

<div>
	<h:commandButton action="#{index.Buscar}" value="buscar"></h:commandButton>
</div>

</div>
</h:form>
</body>
</f:view>
</html>