package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InjuredBlademaster_1109 : Card() {
    override val id = 1109
    override val name = "负伤剑圣"
    override val description = "<b>战吼：</b>对自身造成4点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 7
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "他说这是在一次惨烈的战斗中留下的伤疤，但我们觉得，他只是刮胡子的时候弄伤了自己。"
    override val artist = "Samwise"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1521d3c4bbe4f3cab7bd1745066284e9cb4512605575e41352a4198f51983647.png"
}
