package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GiantSandWorm_38909 : Card() {
    override val id = 38909
    override val name = "巨型沙虫"
    override val description = "每当该随从攻击并消灭一个随从，便可再次攻击。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Wotog
    override val background = "据说艾泽拉斯所有的自助餐馆都拒绝使用沙虫肉，尽管它们的价格十分低廉。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/725c515f09ef601fbed3c8c1eea3b6d2708e1d2b630b03d7d1a9ffb080a93de2.png"
}
