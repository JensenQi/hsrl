package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TruesilverChampion_69533 : Card() {
    override val id = 69533
    override val name = "真银圣剑"
    override val description = "每当你的英雄进攻，便为其恢复 2点生命值。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Core
    override val background = "它能用来切片，也能切块。你还可以用它来开罐头。（但你不会这么做的。）"
    override val artist = "Ryan Sook"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/50e64c36cb03f934da58c74c8eedd3a3b0afb7b6e1bd017cab2c1c20147ad763.png"
}
