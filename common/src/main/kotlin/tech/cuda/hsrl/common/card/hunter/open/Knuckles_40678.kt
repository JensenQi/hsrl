package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Knuckles_40678 : Card() {
    override val id = 40678
    override val name = "金手指纳克斯"
    override val description = "在纳克斯攻击一名随从后，还会命中敌方英雄。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Msog
    override val background = "在龙蛇混杂的加基森没点装备怎么行？作为污手党的头号打手，纳克斯正是凭借这一对指虎为其赢得了“金手指”的名号。"
    override val artist = "Sam Nielson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1becc343542da373a743dafe28721ddb693bafebc3aa3ee57b9260df31169c03.png"
}
