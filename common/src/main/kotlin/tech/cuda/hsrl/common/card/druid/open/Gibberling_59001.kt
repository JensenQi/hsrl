package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Gibberling_59001 : Card() {
    override val id = 59001
    override val name = "聒噪怪"
    override val description = "<b>法术迸发：</b>召唤一个聒噪怪。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“作为语言学专业的学生，我对聒噪怪颇有研究。我确信，它们说的话就是——怪话。”"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0f614d620e446772929495db57baa9d07c50ee1b878910d43c53b943e1f47e8b.png"
}
