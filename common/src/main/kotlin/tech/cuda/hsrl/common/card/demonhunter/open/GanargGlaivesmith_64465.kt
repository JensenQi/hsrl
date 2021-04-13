package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GanargGlaivesmith_64465 : Card() {
    override val id = 64465
    override val name = "甘尔葛战刃铸造师"
    override val description = "<b>流放：</b>在本回合中，使你的英雄获得+3攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Core
    override val background = "流放产生距离，距离产生攻击力。"
    override val artist = "Forrest Imel"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4dfd1cd3ec793be6b47f7723faffff8b3f6485c32e5ab9ad1cf6d8e2a6d89d9b.png"
}
