package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Scalelord_56438 : Card() {
    override val id = 56438
    override val name = "鳞甲领主"
    override val description = "<b>战吼：</b>使你的所有鱼人获得<b>圣盾</b>。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "这张卡牌的名字是为了说明鱼人和巨龙的共同之处，而非它们之间的差异。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/66cb8f3cf366600384c62c4e6a152636eb64a511b1ec8853be2649835cf21e7b.png"
}
