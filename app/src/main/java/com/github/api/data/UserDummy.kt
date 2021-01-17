package com.github.api.data

object UserDummy {
    val list: ArrayList<User>
    get() {
        val list = arrayListOf<User>()

        list.add(User(
                "yigit",
                89202,
                "https://github.com/yigit",
                "https://avatars0.githubusercontent.com/u/89202?v=4",
                "https://github.com/yigit",
                "https://api.github.com/users/yigit/followers",
                "https://api.github.com/users/yigit/following{/other_user}",
                "https://api.github.com/users/yigit/gists{/gist_id}",
                "https://api.github.com/users/yigit/starred{/owner}{/repo}",
                "https://api.github.com/users/agungjp/subscriptions",
                "https://api.github.com/users/agungjp/orgs",
                "https://api.github.com/users/agungjp/repos",
                "https://api.github.com/users/agungjp/events{/privacy}",
                "https://api.github.com/users/agungjp/received_events",
                "User",
        ))

        return list
    }
}