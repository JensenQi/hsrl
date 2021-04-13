package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VoidFlayer_62871 : Card() {
    override val id = 62871
    override val name = "剥灵者"
    override val description = "<b>战吼：</b>你手牌中每有一张法术牌，便随机对一个敌方随从造成1点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "剥灵者和洋葱一样，都可以剥。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cc90d937d7f5333c40df91a236bf99e4eadbf1be62c56f08f9eb365bd617a6dc.png"
}
