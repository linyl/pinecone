var _clickCount = 0;

function squirrelUp() {
	if (_clickCount < 3) {
		// 隐藏按钮
		$("#button").hide(1, function () {
			// 松鼠向上移动
			var top = $("#squirrel").css("top").replace("px", "");
			top = parseInt(top);
			top -= 120;
			$("#squirrel").animate({'top': top + 'px'}, "slow", function () {
				if (_clickCount < 3) {
					// 显示按钮
					$("#button").show();
				}
				
				if (_clickCount == 3) {
					// 松果落下
					var pineconeTop = $("#background").height() - $("#pinecone").height();
					$("#pinecone").animate({'top': pineconeTop + 'px'}, "slow", function () {
						// 页面淡出
						$("img").fadeOut(5000, function () {
							alert(_clickCount);
							//location.href = "/production";
						});
					});
				}
			});
		});
		
		_clickCount++;
	}
}
