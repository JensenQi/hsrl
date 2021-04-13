package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WarglaivesOfAzzinoth_69682 : Card() {
    override val id = 69682
    override val name = "埃辛诺斯战刃"
    override val description = "在攻击一个随从后，你的英雄可以再次攻击。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Core
    override val background = "战刃在未见处青光湛湛，邪火的闪光中梦境黑暗。"
    override val artist = "SARIYA"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/43952a76883c6e91bde353d18fdc36d36b9da9871848ed408a21c6c63b64d712.png"
}
