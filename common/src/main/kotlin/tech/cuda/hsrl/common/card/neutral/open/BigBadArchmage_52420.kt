package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BigBadArchmage_52420 : Card() {
    override val id = 52420
    override val name = "恶狼大法师"
    override val description = "在你的回合结束时，随机召唤一个法力值消耗为（6）的随从。"
    override var cost: Int? = 10
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“我的随从好大呀！”"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3c3beab490226c6988277b7e4450f0bdc902fd71ce8638b86df021c63fd582ad.png"
}
