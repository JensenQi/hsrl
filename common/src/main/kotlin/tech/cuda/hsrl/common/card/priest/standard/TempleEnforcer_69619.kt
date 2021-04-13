package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TempleEnforcer_69619 : Card() {
    override val id = 69619
    override val name = "圣殿执行者"
    override val description = "<b>战吼：</b>使一个友方随从获得+3生命值。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Core
    override val background = "他在每周四的夜晚都会悄然出现在猪和哨声旅店担当保镖。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2a781bdcbc19236fb343a07094c8b63a0b342bdceb61ac5c1e485a97fb81e3bd.png"
}
