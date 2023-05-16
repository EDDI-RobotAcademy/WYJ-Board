<template>
    <v-container>
            <form>
            <table>
                <tr>
                    <td>email</td>
                    <td colspan="2"><input type="text" v-model="email"/></td>
                </tr>
                <tr>
                    <td>password</td>
                    <td colspan="2"><input type="password" v-model="password"/></td>
                </tr>
                <tr>
                    <td><input type="radio" v-model="role" name="roleBtn" value="NORMAL" checked="checked"> NORMAL</td>
                    <td><input type="radio" v-model="role" name="roleBtn" value="BUSINESS"> BUSINESS</td>
                    <td><input type="radio" v-model="role" name="roleBtn" value="ADMIN"> ADMIN</td>
                </tr>
            </table>
            </form>
        <v-btn @click="$router.push('/')">취소</v-btn>
        <v-btn @click="submit">회원 가입 하기!</v-btn>
    </v-container>
</template>

<script>
import {mapActions} from "vuex";
// import memberModule from "@/store/memberStore/MemberModule";
const memberModule = 'memberModule'
export default {
    name: "MemberSignUp",
    data() {
        return {
            email: "test@test.com",
            password:"",
            role: "NORMAL"
        }
    },
    methods: {
        async submit() {
            const {email, password, role} = this

            await this.requestMemberSignUp( {email, password, role})
        },
        ...mapActions(memberModule, ['requestMemberSignUp'])
    }
}
</script>

<style scoped>
form, table, td {
    border: black 1px solid;
}
</style>