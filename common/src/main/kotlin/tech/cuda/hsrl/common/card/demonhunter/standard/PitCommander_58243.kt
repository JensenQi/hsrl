package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PitCommander_58243 : Card() {
    override val id = 58243
    override val name = "深渊指挥官"
    override val description = "<b>嘲讽</b> 在你的回合结束时，从你的牌库中召唤一个恶魔。"
    override var cost: Int? = 9
    override var health: Int? = 9
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“深渊们！听从我的指挥！”"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/08d3dac765f46a03df12d98e700ef8c160104ae420b69b31dca1ed6356d86671.png"
}
