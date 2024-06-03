Vue.component('my-footer', {
    data: function () {
        return {
        }
    },
    methods: {
    },
    created: function () {

    },
    template: `
            <div class="center" style="text-align: center;color: #666;">
                <el-row>
                    <el-col span="8">
                        <img src="imgs/logo1.png" width="110" height="65">
                        <p>看书就来三味书屋</p>
                        <p>书行业网络社区平台</p>
                        <p>书店行业领导品牌</p>
                    </el-col>
                    <el-col span="8">
                        <el-row id="footer_center">
                            <el-col span="8">
                                <h3>关于我们</h3>
                                <p>关于我们</p><p>读书学院</p>
                                <p>图书索引</p><p>分类信息</p>
                                <p>求职招聘</p><p>社区交流</p>
                            </el-col>
                            <el-col span="8">
                                <h3>支持与服务</h3>
                                <p>联系我们</p><p>广告投放</p>
                                <p>用户协议</p><p>友情链接</p>
                                <p>在线反馈</p><p>我发投稿</p>
                            </el-col>
                            <el-col span="8">
                                <h3>底部导航</h3>
                                <p>Archiver</p><p>手机版</p>
                                <p>小黑屋</p>
                            </el-col>
                        </el-row>

                    </el-col>
                    <el-col span="8">
                        <div style="font-size: 58px;margin-top: 30px">
                            <span style="color: orange">三味</span><span style="color: #666666">书屋</span>
                        </div>
                        <p>书架平台</p>
                    </el-col>
                </el-row>
            </div>
    `
})