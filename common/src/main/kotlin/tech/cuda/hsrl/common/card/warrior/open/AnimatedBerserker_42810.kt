package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AnimatedBerserker_42810 : Card() {
    override val id = 42810
    override val name = "活化狂战士"
    override val description = "在你使用一张随从牌后，对其造成1点 伤害。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Kotf
    override val background = "如果他能安静一点，活化起来就容易多了。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4dd2f6a37f788f264fd8978c7e05b9940a80758a043aa3f0b955bc0fb399a53f.png"
}
