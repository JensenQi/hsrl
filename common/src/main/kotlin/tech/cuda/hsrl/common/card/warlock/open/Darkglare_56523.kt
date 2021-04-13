package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Darkglare_56523 : Card() {
    override val id = 56523
    override val name = "黑眼"
    override val description = "在你的英雄受到伤害后，复原一个 法力水晶。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.AshesOfOutland
    override val background = "他的巨眼在黑暗中闪耀，视线却如同水晶一般清澈！"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/18123b6943fe041bc9ff52fcd5738329b96c2b1bec75c36d504720f8dce11713.png"
}
