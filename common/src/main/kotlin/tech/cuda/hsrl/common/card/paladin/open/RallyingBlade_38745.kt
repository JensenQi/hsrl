package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RallyingBlade_38745 : Card() {
    override val id = 38745
    override val name = "集结之刃"
    override val description = "<b>战吼：</b>使你具有<b>圣盾</b>的随从获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Wotog
    override val background = "就一把武器而言，它的确还蛮振奋人心的。"
    override val artist = "Jeremy Cranford"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/12c303e122a044c6121d1bfd09e1a6f26810ebe81a3f5f1d5e59260dd53e8624.png"
}
