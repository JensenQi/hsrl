package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Rampage_69753 : Card() {
    override val id = 69753
    override val name = "狂暴"
    override val description = "使一个受伤的随从获得+3/+3。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "随从很愤怒。随从很厉害！"
    override val artist = "Jonboy Meyers"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/65788c264ad72087d904952436fe629e46bfdd383e2526f87be8d00f4ebcada3.png"
}
