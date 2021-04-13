package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MordreshFireEye_63064 : Card() {
    override val id = 63064
    override val name = "火眼莫德雷斯"
    override val description = "<b>战吼：</b> 在本局对战中，如果你用你的英雄技能累计造成了10点伤害，则对所有敌人造成10点伤害。 <i>（还剩下 点！）</i> <i>（已经就绪！）</i>"
    override var cost: Int? = 10
    override var health: Int? = 10
    override var attack: Int? = 10
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "除非硬核而死，否则不算硬核。"
    override val artist = "Qinghao Wu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9663aa4e50e339816c1027cad128fc808599db3ec6c4ec84700ae83dc98d5ee0.png"
}
