package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CorpseWidow_42822 : Card() {
    override val id = 42822
    override val name = "巨型尸蛛"
    override val description = "你的<b>亡语</b>牌的法力值消耗减少（2）点。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Kotf
    override val background = "虽然她的身体经受了死亡的考验，但她的婚姻呢？"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d44a5f1224fa3c6479abc27d03da757fe3cdd4d4d1fb09df6db58afc69cd80fb.png"
}
