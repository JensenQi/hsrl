package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoulInfusion_48211 : Card() {
    override val id = 48211
    override val name = "灵魂灌注"
    override val description = "使你手牌中最左边的随从牌获得+2/+2。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.BoomsdayProject
    override val background = "以前大家嫌他魂淡，现在好了……"
    override val artist = "Garrett Hanna"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/df486cbababc6ee296d7252c39624efe07092cb2ba5d478b72ef63c7c2df637a.png"
}
