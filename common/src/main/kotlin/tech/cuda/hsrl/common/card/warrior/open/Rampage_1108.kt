package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Rampage_1108 : Card() {
    override val id = 1108
    override val name = "狂暴"
    override val description = "使一个受伤的随从获得+3/+3。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy3
    override val background = "随从很愤怒。随从很厉害！"
    override val artist = "Jonboy Meyers"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3f2f8c789793b8f3ae6b634f6c7d9098c44dfc83ddf24f067178ff6ff53c87fc.png"
}
