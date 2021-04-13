package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SelfSharpeningSword_59989 : Card() {
    override val id = 59989
    override val name = "自砺之锋"
    override val description = "在你的英雄攻击后，获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "有了它，考试时再也不用准备两把削笔刀了！"
    override val artist = "Kagi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/978e8c6004d9cc89a2e7580552c43b89aee0f4391bf480c5b039f23224886bb2.png"
}
