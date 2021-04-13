package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GoldRoadGrunt_62702 : Card() {
    override val id = 62702
    override val name = "黄金之路步兵"
    override val description = "<b>嘲讽</b>，<b>暴怒：</b> 获得等同于所受伤害的护甲值。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "不不不，黄金之路和黄砖路区别可大了。"
    override val artist = "Konstantin Porubov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/90fa14f628b494267250fac66a0d3967fcb3c12c5dbf7beefcfe4387bcf63bb5.png"
}
