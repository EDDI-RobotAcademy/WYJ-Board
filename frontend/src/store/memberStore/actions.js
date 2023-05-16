import axiosInst from "@/utility/axiosInst";

export default {
    requestMemberSignUp({}, payload) {
        return axiosInst.post('/member/signUp', payload)
            .then(() => {
                console.log("전송 성공")
            })
            .catch(()=> console.log("전송 실패"))
    },
}