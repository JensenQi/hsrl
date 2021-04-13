package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Powershot_2638 : Card() {
    override val id = 2638
    override val name = "强风射击"
    override val description = "对一个随从及其相邻的随从造成 2点伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Tgt
    override val background = "该技能的要诀就是在台风天使用。"
    override val artist = "Jonboy Meyers"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4c7a4f3a379934d98d7ebb987b2656b90451ef108c058d192465383a6cf4163e.png"
}
