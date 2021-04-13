package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkshireLibrarian_38447 : Card() {
    override val id = 38447
    override val name = "夜色镇图书管理员"
    override val description = "<b>战吼：</b> 随机弃一张牌。 <b>亡语：</b> 抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Wotog
    override val background = "请注意，逾期不还者需赔付十倍的滞纳金！"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2545cfec3cbadd1a2463bb5e72710eaa8a68179d8aa3f520ed02c9eae86b80e6.png"
}
