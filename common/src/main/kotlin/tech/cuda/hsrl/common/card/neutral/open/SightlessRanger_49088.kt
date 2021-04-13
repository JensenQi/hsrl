package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SightlessRanger_49088 : Card() {
    override val id = 49088
    override val name = "盲眼游侠"
    override val description = "<b>突袭</b> <b>超杀</b>：召唤两个1/1的蝙蝠。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "牺牲了视野，但也移除了邪能之爪的冷却时间。"
    override val artist = "Jiajun Tian"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/85ef5d542c798cd3f607785c7678aba1329f8a0d3ac777557d8991c486e4b803.png"
}
