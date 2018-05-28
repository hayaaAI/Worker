<template>
    <div>
        <el-row>
            <el-col>
                <el-menu default-active="1">
                    <el-submenu index="1">
                        <template slot="title">
                            <i class="el-icon-document"></i>
                            <span>组织管理</span>
                        </template>
                        <el-menu-item-group>
                            <template slot="title">企业设置</template>
                             <el-menu-item index="1-1"><router-link to="/home/companylist" class="menuitem">组织管理</router-link></el-menu-item>
                          </el-menu-item-group>
                    </el-submenu>
                </el-menu>
            </el-col>
        </el-row>
    </div>
</template>

<script>
    export default {
        name: "LeftMenu"
    }
</script>

<style scoped>
.menuitem{
    size: 10px;
    color: black;
    text-decoration: none;
}
.menuitem:active{
    size: 10px;
    text-decoration: none;
}
</style>