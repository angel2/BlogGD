<body>
	<ul>
      <li>Perfil</li>
      <li>Crear post</li>
      <c: if user='$[isAdmin]'>
      <li>Evaluar posts</li>
      </c:if>
      <li>Historial</li>
    </ul>
</body>
