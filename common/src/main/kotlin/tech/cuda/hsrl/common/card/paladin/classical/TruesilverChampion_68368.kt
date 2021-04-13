package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TruesilverChampion_68368 : Card() {
    override val id = 68368
    override val name = "真银圣剑"
    override val description = "每当你的英雄进攻，便为其恢复 2点生命值。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "它能用来切片，也能切块。你还可以用它来开罐头。（但你不会这么做的。）"
    override val artist = "Ryan Sook"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f7521847cb8decdfc41b47a602d38775e5026669679233e111a2dc908debd000.png"
}
