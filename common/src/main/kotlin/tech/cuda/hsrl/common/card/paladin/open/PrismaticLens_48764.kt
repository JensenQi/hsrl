package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrismaticLens_48764 : Card() {
    override val id = 48764
    override val name = "棱彩透镜"
    override val description = "从你的牌库中抽一张随从牌和一张法术牌，并使其法力值消耗互换。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.BoomsdayProject
    override val background = "以来自月之暗面的稀有矿藏打磨而成。"
    override val artist = "Cicily He"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/208f1a9d81ec699c7e441e4cb857cf32423119058341b98f22d080c84bd2b928.png"
}
