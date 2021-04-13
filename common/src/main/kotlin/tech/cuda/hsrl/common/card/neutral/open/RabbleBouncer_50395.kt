package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RabbleBouncer_50395 : Card() {
    override val id = 50395
    override val name = "场馆保镖"
    override val description = "<b>嘲讽</b> 每有一个敌方随从，该牌的法力值消耗减少（1）点。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "赤脚人士谢绝入内。"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7bed818a645b052a85709f07ed8c1266f99067665e9a5a2df6bd27edfcdd9769.png"
}
