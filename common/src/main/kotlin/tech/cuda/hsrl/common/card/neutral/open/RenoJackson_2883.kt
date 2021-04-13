package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RenoJackson_2883 : Card() {
    override val id = 2883
    override val name = "雷诺·杰克逊"
    override val description = "<b>战吼：</b>如果你的牌库里没有相同的牌，则为你的英雄恢复所有生命值。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "雷诺曾四次荣获由探险者协会颁发的“年度最佳服饰奖”。"
    override val artist = "Tyson Murphy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d12546d994d957197c7155e21255541961038de2991c39afd1bb9917695589a9.png"
}
