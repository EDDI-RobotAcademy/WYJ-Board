import {
    REQUEST_BOARD_LIST_TO_SPRING,
    REQUEST_BOARD_TO_SPRING
} from '@/store/board/mutation-types'

import axiosInst from '@/utility/axiosInst'

export default{
    requestWriteBoardToSpring({},payload){
    const {title, memberId, content}=this
    return axiosInst.post('/board/write-board',{title, memberId, content})
    .then((res)=>{
        alert("게시물 등록완료")
    })
    .catch(()=>{
        alert("문제발생")
    })
}
}