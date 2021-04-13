package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UrzulHorror_56739 : Card() {
    override val id = 56739
    override val name = "乌祖尔恐魔"
    override val description = "<b>亡语：</b>将一张2/1的“迷失之魂”置入你的 手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "面面面面面对加拉克苏斯！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f3c226b9b6d6de90fdc946d5b0155d9f2a9cc78cb04a21872916df4305aa2ff9.png"
}
