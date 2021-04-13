package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Demonwrath_2301 : Card() {
    override val id = 2301
    override val name = "恶魔之怒"
    override val description = "对所有非恶魔随从造成 2点 伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Brm
    override val background = "恶魔在绝大多数时候都不太愤怒，他们只是觉得在愤怒的时候，他们的模样会更加帅气。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c68941b9435a892a35378699e44af0b6458046c769540afcb501d5b63225b5b7.png"
}
