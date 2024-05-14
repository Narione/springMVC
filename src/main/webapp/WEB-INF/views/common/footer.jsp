<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <footer>
    	(c) copyright 2024 NextIT all right reserved.
    </footer>
<script>
	function deleteItem(url) {
		if (confirm("삭제하시겠습니까?")) {
			location.href = url;
		} else {
			alert("삭제를 취소하셨습니다.");
		}
	}
</script>
</body>
</html>