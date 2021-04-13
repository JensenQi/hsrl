package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CarielRoame_62993 : Card() {
    override val id = 62993
    override val name = "凯瑞尔·罗姆"
    override val description = "<b>突袭</b>，<b>圣盾</b> 每当该随从攻击时，使你手牌中神圣法术牌的法力值消耗减少（1）点。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "凯瑞尔宣誓效忠联盟。可是后来，有人在十字路口发现了一个人，似乎是她失踪已久的姐姐。于是凯瑞尔做出了令人难以置信的决定，离开了她的岗哨，踏上了茫茫的贫瘠之地。"
    override val artist = "Ursula Dorada"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e2148b7797e6c95915085b34c4da7c5fbcbf56c3e91f29faf67ce859c9a2754b.png"
}
