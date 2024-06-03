Vue.component('my-header', {
    data: function () {
        return {
            user: localStorage.user ? JSON.parse(localStorage.user) : null,
            activeIndex:"0",
            wd:""
        }
    },
    methods: {
        search(){
            if (this.wd.trim()==""){
                this.$message.error("请输入搜索的内容!");
                return;
            }

          location.href="/contentList.html?wd="+this.wd;
        },
        logout(){
            if (confirm("您确认退出登录吗?")){
                //发请求退出登录
                axios.get("/v1/users/logout").then(function () {
                    localStorage.clear();//清空登录成功时保存的数据
                    location.href="/";
                })
            }
        },
        handleSelect(key,keyPath){
            if (key==0){
                location.href="/";
            }else{
                location.href="/contentList.html?type="+key;
            }
        }
    },
    created: function () {
        //得到地址栏中的type值
        let type = new URLSearchParams(location.search).get("type");
        //地址栏里面有可能不存在type参数, 如果是在首页此时应该让首页处于激活状态,
        // 不在首页则谁都不选中
        this.activeIndex = type;
        //判断是否是首页
        if (location.pathname=="/"||location.pathname=="/index.html"){
            this.activeIndex = "0";
        }
        //如果是发帖页面则不选中任何一个
        if (location.pathname.includes("postArticle")){
            this.activeIndex = null;
        }
    },
    template: `
        <el-header height="80px">
            <div class="center" style="text-align: center">
                <el-row gutter="20"  type="flex" justify="center" >
                    <el-col span="5">
                        <a href="/">
                         <img src="imgs/logo1.png" width="115" height="65">
                        </a>
                        
                    </el-col>
                    <el-col span="12">
                        <el-menu mode="horizontal" :default-active="activeIndex" @select="handleSelect" active-text-color="orange" style="background: transparent !important; ">
                            <el-menu-item  index="0">首页</el-menu-item>
                            <el-menu-item  index="1">分类</el-menu-item>
                            <el-menu-item  index="2">简介</el-menu-item>
                            <el-menu-item  index="3">资讯</el-menu-item>
                      
                        </el-menu>
                    </el-col>
                 
                    <el-col span="4">
                        <h3 style="color: black">三味书屋</h3>
                    </el-col>
                    <el-col span="2"  >
                        <el-popover v-if="user==null"
                                placement="top-start"
                                title="欢迎来到三味书屋!"
                                width="200"
                                trigger="hover">
                            <div slot="reference">
                                <i class="el-icon-user"
                                   style="font-size: 30px;position: relative;top: 20px;margin-left: 20px"></i>
                            </div>
                           
                        </el-popover>
                        <el-popover v-else 
                                placement="top-start"
                                title="欢迎来到三味书屋!"
                                width="200"
                                trigger="hover">
                            <div slot="reference">
                                <i class="el-icon-user"
                                   style="font-size: 30px;position: relative;top: 20px ;"></i>
                            </div>
                            <div style="text-align: center">
                                <a href="/personal.html">
                                    <el-avatar :src="user.imgUrl" style="float: right">
                                </a>
                                <hr>
                                <a href="/personal.html">个人中心</a>
                                <a href="javascript:void(0)" @click="logout()">退出登录</a><br>
                                <a v-if="user.isAdmin==1" href="/admin.html">后台管理页面</a>
                            </div>
                            
                        </el-popover>
                    </el-col>
                </el-row>
            </div>
        </el-header>
    `
})