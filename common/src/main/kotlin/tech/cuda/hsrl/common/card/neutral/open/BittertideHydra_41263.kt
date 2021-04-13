package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BittertideHydra_41263 : Card() {
    override val id = 41263
    override val name = "苦潮多头蛇"
    override val description = "每当该随从受到伤害，对你的英雄造成 3点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "其实只有中间的头口感苦涩，其他的头要么偏甜，要么偏辣。"
    override val artist = "Mark Gibbons"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/65872e00f059cb71fdeafbfebd26caf7b6aefa47fe5cbc2b3a8eb41a0d0cc58a.png"
}
